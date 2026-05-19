package StudentGradeSystem;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// ══════════════════════════════════════════════════════════
//  INTERFACE
// ══════════════════════════════════════════════════════════

interface Evaluable {
    String  computeGrade(double marks);
    double  computeGPA(double marks);
    boolean isPassed(double marks);
}

// ══════════════════════════════════════════════════════════
//  GRADE CALCULATOR  (implements Evaluable)
// ══════════════════════════════════════════════════════════

class GradeCalculator implements Evaluable {

    private static final double PASS_MARK = 40.0;

    @Override
    public String computeGrade(double marks) {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B+";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    @Override
    public double computeGPA(double marks) {
        if (marks >= 90) return 10.0;
        if (marks >= 80) return  9.0;
        if (marks >= 70) return  8.0;
        if (marks >= 60) return  7.0;
        if (marks >= 50) return  6.0;
        if (marks >= 40) return  5.0;
        return 0.0;
    }

    @Override
    public boolean isPassed(double marks) {
        return marks >= PASS_MARK;
    }

    public String getRemark(double marks) {
        if (marks >= 90) return "Outstanding";
        if (marks >= 80) return "Excellent";
        if (marks >= 70) return "Very Good";
        if (marks >= 60) return "Good";
        if (marks >= 50) return "Average";
        if (marks >= 40) return "Pass";
        return "Fail";
    }
}

// ══════════════════════════════════════════════════════════
//  SUBJECT
// ══════════════════════════════════════════════════════════

class Subject {
    private static int counter = 200;

    private int    subjectId;
    private String subjectName;
    private String subjectCode;
    private int    credits;
    private int    maxMarks;

    public Subject(String subjectName, String subjectCode,
                   int credits, int maxMarks) {
        this.subjectId   = ++counter;
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.credits     = credits;
        this.maxMarks    = maxMarks;
    }

    public int    getSubjectId()   { return subjectId; }
    public String getSubjectName() { return subjectName; }
    public String getSubjectCode() { return subjectCode; }
    public int    getCredits()     { return credits; }
    public int    getMaxMarks()    { return maxMarks; }

    @Override
    public String toString() {
        return String.format("[%d] %-28s (%s)  Credits:%d  MaxMarks:%d",
                subjectId, subjectName, subjectCode, credits, maxMarks);
    }
}

// ══════════════════════════════════════════════════════════
//  GRADE  (one row: subject + marks + computed results)
// ══════════════════════════════════════════════════════════

class Grade {
    private Subject         subject;
    private double          marksObtained;
    private String          letterGrade;
    private double          gradePoint;
    private boolean         passed;
    private String          remark;
    private GradeCalculator calc;

    public Grade(Subject subject, double marksObtained) {
        this.calc          = new GradeCalculator();
        this.subject       = subject;
        this.marksObtained = marksObtained;
        this.letterGrade   = calc.computeGrade(marksObtained);
        this.gradePoint    = calc.computeGPA(marksObtained);
        this.passed        = calc.isPassed(marksObtained);
        this.remark        = calc.getRemark(marksObtained);
    }

    public Subject getSubject()       { return subject; }
    public double  getMarksObtained() { return marksObtained; }
    public String  getLetterGrade()   { return letterGrade; }
    public double  getGradePoint()    { return gradePoint; }
    public boolean isPassed()         { return passed; }
    public String  getRemark()        { return remark; }

    public void updateMarks(double newMarks) {
        this.marksObtained = newMarks;
        this.letterGrade   = calc.computeGrade(newMarks);
        this.gradePoint    = calc.computeGPA(newMarks);
        this.passed        = calc.isPassed(newMarks);
        this.remark        = calc.getRemark(newMarks);
    }

    public String toTableRow() {
        return String.format("  %-28s %-6s %6.1f / %-6d  %-4s  %5.1f  %-12s  %s",
                subject.getSubjectName(),
                subject.getSubjectCode(),
                marksObtained,
                subject.getMaxMarks(),
                letterGrade,
                gradePoint,
                remark,
                passed ? "PASS" : "FAIL");
    }
}

// ══════════════════════════════════════════════════════════
//  ABSTRACT PERSON
// ══════════════════════════════════════════════════════════

abstract class Person {
    protected String name;
    protected String id;
    protected String email;
    protected String phone;

    public Person(String name, String id, String email, String phone) {
        this.name  = name;
        this.id    = id;
        this.email = email;
        this.phone = phone;
    }

    public String getName()  { return name; }
    public String getId()    { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public abstract void displayInfo();
}

// ══════════════════════════════════════════════════════════
//  STUDENT  (extends Person)
// ══════════════════════════════════════════════════════════

class Student extends Person {
    private static int rollCounter = 1000;

    private String        rollNumber;
    private String        department;
    private int           semester;
    private String        section;
    private String        dateOfJoining;
    private List<Grade>   grades;

    public Student(String name, String email, String phone,
                   String department, int semester, String section) {
        super(name, "STU" + (++rollCounter), email, phone);
        this.rollNumber    = id;
        this.department    = department;
        this.semester      = semester;
        this.section       = section;
        this.dateOfJoining = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.grades        = new ArrayList<>();
    }

    public String     getRollNumber()  { return rollNumber; }
    public String     getDepartment()  { return department; }
    public int        getSemester()    { return semester; }
    public String     getSection()     { return section; }
    public String     getDateOfJoining(){ return dateOfJoining; }
    public List<Grade> getGrades()     { return grades; }

    public void addGrade(Grade g) {
        for (Grade existing : grades) {
            if (existing.getSubject().getSubjectId()
                    == g.getSubject().getSubjectId()) {
                System.out.println("    Grade already exists for "
                        + g.getSubject().getSubjectName()
                        + ". Use Update option.");
                return;
            }
        }
        grades.add(g);
    }

    public boolean updateGrade(int subjectId, double newMarks) {
        for (Grade g : grades) {
            if (g.getSubject().getSubjectId() == subjectId) {
                g.updateMarks(newMarks);
                return true;
            }
        }
        return false;
    }

    public double getTotalMarks() {
        double total = 0;
        for (Grade g : grades) total += g.getMarksObtained();
        return total;
    }

    public double getPercentage() {
        if (grades.isEmpty()) return 0;
        double totalMax = 0;
        for (Grade g : grades)
            totalMax += g.getSubject().getMaxMarks();
        return (getTotalMarks() / totalMax) * 100.0;
    }

    public double getCGPA() {
        if (grades.isEmpty()) return 0;
        double totalPoints  = 0;
        int    totalCredits = 0;
        for (Grade g : grades) {
            int credits = g.getSubject().getCredits();
            totalPoints  += g.getGradePoint() * credits;
            totalCredits += credits;
        }
        return totalCredits == 0 ? 0 : totalPoints / totalCredits;
    }

    public int getFailCount() {
        int count = 0;
        for (Grade g : grades) if (!g.isPassed()) count++;
        return count;
    }

    public String getOverallResult() {
        return getFailCount() == 0 ? "PASS" : "FAIL";
    }

    public String getOverallGrade() {
        return new GradeCalculator().computeGrade(getPercentage());
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("  ┌────────────────────────────────────────┐");
        System.out.printf ("  │  Roll No     : %-25s│%n", rollNumber);
        System.out.printf ("  │  Name        : %-25s│%n", name);
        System.out.printf ("  │  Department  : %-25s│%n", department);
        System.out.printf ("  │  Semester    : %-25d│%n", semester);
        System.out.printf ("  │  Section     : %-25s│%n", section);
        System.out.printf ("  │  Email       : %-25s│%n", email);
        System.out.printf ("  │  Phone       : %-25s│%n", phone);
        System.out.printf ("  │  Joined      : %-25s│%n", dateOfJoining);
        System.out.printf ("  │  Subjects    : %-25d│%n", grades.size());
        System.out.printf ("  │  CGPA        : %-25.2f│%n", getCGPA());
        System.out.printf ("  │  Result      : %-25s│%n", getOverallResult());
        System.out.println("  └────────────────────────────────────────┘");
    }

    @Override
    public String toString() {
        return String.format("%-10s  %-22s  %-12s  Sem:%-2d  CGPA:%-5.2f  %s",
                rollNumber, name, department,
                semester, getCGPA(), getOverallResult());
    }
}

// ══════════════════════════════════════════════════════════
//  ADMIN  (extends Person)
// ══════════════════════════════════════════════════════════

class Admin extends Person {
    private String designation;

    public Admin(String name, String email, String phone, String designation) {
        super(name, "ADM001", email, phone);
        this.designation = designation;
    }

    public String getDesignation() { return designation; }

    @Override
    public void displayInfo() {
        System.out.printf("  Admin: %s  |  %s  |  %s%n",
                name, designation, email);
    }
}

// ══════════════════════════════════════════════════════════
//  REPORT  (generates formatted report card)
// ══════════════════════════════════════════════════════════

class Report {

    public static void printReportCard(Student s) {
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════════════════════════════════╗");
        System.out.println("  ║              STUDENT GRADE REPORT CARD — ACADEMIC SYSTEM               ║");
        System.out.println("  ╠══════════════════════════════════════════════════════════════════════════╣");
        System.out.printf ("  ║  Roll No : %-12s   Name : %-32s║%n",
                s.getRollNumber(), s.getName());
        System.out.printf ("  ║  Dept    : %-12s   Sem  : %-3d   Section : %-22s║%n",
                s.getDepartment(), s.getSemester(), s.getSection());
        System.out.println("  ╠══════════════════════════════════════════════════════════════════════════╣");
        System.out.println("  ║  SUBJECT                      CODE    MARKS   MAX   GR   GP   REMARK    RESULT║");
        System.out.println("  ╠══════════════════════════════════════════════════════════════════════════╣");

        if (s.getGrades().isEmpty()) {
            System.out.println("  ║  No grades recorded.                                                    ║");
        } else {
            for (Grade g : s.getGrades())
                System.out.println(g.toTableRow());
        }

        System.out.println("  ╠══════════════════════════════════════════════════════════════════════════╣");
        System.out.printf ("  ║  Total Marks  : %-8.1f                                                 ║%n",
                s.getTotalMarks());
        System.out.printf ("  ║  Percentage   : %-6.2f %%                                                ║%n",
                s.getPercentage());
        System.out.printf ("  ║  CGPA         : %-5.2f                                                   ║%n",
                s.getCGPA());
        System.out.printf ("  ║  Overall Grade: %-4s                                                     ║%n",
                s.getOverallGrade());
        System.out.printf ("  ║  Failed in    : %-2d subject(s)                                           ║%n",
                s.getFailCount());
        System.out.println("  ╠══════════════════════════════════════════════════════════════════════════╣");
        System.out.printf ("  ║  FINAL RESULT :  %-55s║%n", s.getOverallResult());
        System.out.println("  ╚══════════════════════════════════════════════════════════════════════════╝");
    }

    public static void printClassReport(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("  No students available.");
            return;
        }
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("  ║                   CLASS PERFORMANCE REPORT                      ║");
        System.out.println("  ╠══════════════════════════════════════════════════════════════════╣");
        System.out.printf ("  ║  %-10s  %-20s  %-12s  %-4s  %-6s  %-6s║%n",
                "Roll No","Name","Department","Sem","CGPA","Result");
        System.out.println("  ╠══════════════════════════════════════════════════════════════════╣");
        for (Student st : students)
            System.out.println("  ║  " + st + "  ║");

        // Stats
        double totalCGPA = 0;
        int    passed    = 0;
        double highest   = Double.MIN_VALUE;
        double lowest    = Double.MAX_VALUE;
        Student topStudent = null;

        for (Student st : students) {
            totalCGPA += st.getCGPA();
            if (st.getOverallResult().equals("PASS")) passed++;
            if (st.getCGPA() > highest) { highest = st.getCGPA(); topStudent = st; }
            if (st.getCGPA() < lowest)    lowest  = st.getCGPA();
        }

        double avgCGPA = totalCGPA / students.size();
        int    failed  = students.size() - passed;

        System.out.println("  ╠══════════════════════════════════════════════════════════════════╣");
        System.out.printf ("  ║  Total Students : %-46d║%n", students.size());
        System.out.printf ("  ║  Passed         : %-46d║%n", passed);
        System.out.printf ("  ║  Failed         : %-46d║%n", failed);
        System.out.printf ("  ║  Average CGPA   : %-46.2f║%n", avgCGPA);
        System.out.printf ("  ║  Highest CGPA   : %-46.2f║%n", highest == Double.MIN_VALUE ? 0 : highest);
        System.out.printf ("  ║  Lowest CGPA    : %-46.2f║%n", lowest == Double.MAX_VALUE ? 0 : lowest);
        if (topStudent != null)
            System.out.printf("  ║  Top Student    : %-46s║%n", topStudent.getName());
        System.out.println("  ╚══════════════════════════════════════════════════════════════════╝");
    }

    public static void printSubjectAnalysis(List<Student> students, Subject subject) {
        System.out.println();
        System.out.println("  ─── Subject Analysis: " + subject.getSubjectName() + " ───");
        double total = 0; int count = 0;
        double high = -1, low = 101;
        Map<String,Integer> gradeCount = new LinkedHashMap<>();
        for (String g : new String[]{"A+","A","B+","B","C","D","F"})
            gradeCount.put(g, 0);

        for (Student st : students) {
            for (Grade g : st.getGrades()) {
                if (g.getSubject().getSubjectId() == subject.getSubjectId()) {
                    total += g.getMarksObtained();
                    count++;
                    if (g.getMarksObtained() > high) high = g.getMarksObtained();
                    if (g.getMarksObtained() < low)  low  = g.getMarksObtained();
                    gradeCount.merge(g.getLetterGrade(), 1, Integer::sum);
                }
            }
        }
        if (count == 0) { System.out.println("  No data found for this subject."); return; }
        System.out.printf("  Average : %.2f   Highest : %.1f   Lowest : %.1f%n",
                total/count, high, low);
        System.out.print("  Grade Distribution: ");
        gradeCount.forEach((k,v)-> System.out.printf("%s:%d  ",k,v));
        System.out.println();
    }
}

// ══════════════════════════════════════════════════════════
//  DEPARTMENT  (manages students in one dept)
// ══════════════════════════════════════════════════════════

class Department {
    private String        deptName;
    private List<Student> students = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String        getDeptName() { return deptName; }
    public List<Student> getStudents() { return students; }

    public void addStudent(Student s)    { students.add(s); }

    public boolean removeStudent(String roll) {
        return students.removeIf(s -> s.getRollNumber().equals(roll));
    }

    public Student findByRoll(String roll) {
        for (Student s : students)
            if (s.getRollNumber().equalsIgnoreCase(roll)) return s;
        return null;
    }

    public Student findByName(String name) {
        for (Student s : students)
            if (s.getName().equalsIgnoreCase(name)) return s;
        return null;
    }

    public List<Student> getBySemester(int sem) {
        List<Student> result = new ArrayList<>();
        for (Student s : students)
            if (s.getSemester() == sem) result.add(s);
        return result;
    }

    public List<Student> getToppers(int n) {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort((a, b) -> Double.compare(b.getCGPA(), a.getCGPA()));
        return sorted.subList(0, Math.min(n, sorted.size()));
    }
}

// ══════════════════════════════════════════════════════════
//  MAIN APPLICATION
// ══════════════════════════════════════════════════════════

public class StudentGradeSystem {

    static Scanner         sc         = new Scanner(System.in);
    static List<Subject>   subjects   = new ArrayList<>();
    static List<Department>departments= new ArrayList<>();
    static Admin           admin;

    public static void main(String[] args) {

        seedData();
        adminLogin();

        boolean running = true;
        while (running) {
            printMainMenu();
            int ch = readInt("  Enter choice: ");
            switch (ch) {
                case 1  -> studentMenu();
                case 2  -> gradeMenu();
                case 3  -> reportMenu();
                case 4  -> subjectMenu();
                case 5  -> searchMenu();
                case 6  -> topperMenu();
                case 0  -> { System.out.println("\n  Logged out. Goodbye!"); running = false; }
                default -> System.out.println("  Invalid choice.");
            }
        }
        sc.close();
    }

    // ── MENUS ──────────────────────────────────────────────

    static void printMainMenu() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════╗");
        System.out.println("  ║     STUDENT GRADE MANAGEMENT         ║");
        System.out.printf ("  ║     Admin: %-26s║%n", admin.getName());
        System.out.println("  ╠══════════════════════════════════════╣");
        System.out.println("  ║  1. Student Management               ║");
        System.out.println("  ║  2. Grade Management                 ║");
        System.out.println("  ║  3. Reports                          ║");
        System.out.println("  ║  4. Subject Management               ║");
        System.out.println("  ║  5. Search                           ║");
        System.out.println("  ║  6. View Toppers                     ║");
        System.out.println("  ║  0. Exit                             ║");
        System.out.println("  ╚══════════════════════════════════════╝");
    }

    // ── 1. STUDENT MANAGEMENT ──────────────────────────────

    static void studentMenu() {
        System.out.println("\n  1.Add Student  2.View All  3.View by Dept  4.Update  5.Remove");
        int ch = readInt("  Choice: ");
        switch (ch) {
            case 1 -> addStudent();
            case 2 -> viewAllStudents();
            case 3 -> viewByDept();
            case 4 -> updateStudent();
            case 5 -> removeStudent();
        }
    }

    static void addStudent() {
        System.out.println("\n  ─── Add New Student ───");
        System.out.print("  Name       : "); String name  = sc.nextLine().trim();
        System.out.print("  Email      : "); String email = sc.nextLine().trim();
        System.out.print("  Phone      : "); String phone = sc.nextLine().trim();
        System.out.println("  Departments:");
        for (int i = 0; i < departments.size(); i++)
            System.out.println("    " + (i+1) + ". " + departments.get(i).getDeptName());
        int di = readInt("  Select Dept: ") - 1;
        if (di < 0 || di >= departments.size()) { System.out.println("  Invalid dept."); return; }
        int    sem     = readInt("  Semester (1-8): ");
        System.out.print("  Section    : "); String section = sc.nextLine().trim();

        Department dept = departments.get(di);
        Student s = new Student(name, email, phone, dept.getDeptName(), sem, section);
        dept.addStudent(s);
        System.out.println("\n  Student added! Roll No: " + s.getRollNumber());
    }

    static void viewAllStudents() {
        System.out.println("\n  ─── All Students ───");
        boolean any = false;
        for (Department d : departments) {
            if (!d.getStudents().isEmpty()) {
                System.out.println("\n  [ " + d.getDeptName() + " ]");
                d.getStudents().forEach(s -> System.out.println("  " + s));
                any = true;
            }
        }
        if (!any) System.out.println("  No students found.");
    }

    static void viewByDept() {
        Department d = selectDept();
        if (d == null) return;
        System.out.println("\n  Department: " + d.getDeptName());
        System.out.print("  Filter by Semester? (0 = all): ");
        int sem = readInt("");
        List<Student> list = sem == 0 ? d.getStudents() : d.getBySemester(sem);
        if (list.isEmpty()) System.out.println("  No students found.");
        else list.forEach(s -> System.out.println("  " + s));
    }

    static void updateStudent() {
        Student s = findStudentByRoll();
        if (s == null) return;
        s.displayInfo();
        System.out.println("  What to update?  1.Email  2.Phone  3.Section");
        int ch = readInt("  Choice: ");
        switch (ch) {
            case 1 -> { System.out.print("  New Email  : "); s.email = sc.nextLine().trim(); }
            case 2 -> { System.out.print("  New Phone  : "); s.phone = sc.nextLine().trim(); }
            case 3 -> { System.out.print("  New Section: "); }
        }
        System.out.println("  Updated successfully.");
    }

    static void removeStudent() {
        System.out.print("  Enter Roll Number to remove: ");
        String roll = sc.nextLine().trim().toUpperCase();
        for (Department d : departments) {
            if (d.removeStudent(roll)) {
                System.out.println("  Student " + roll + " removed."); return;
            }
        }
        System.out.println("  Student not found.");
    }

    // ── 2. GRADE MANAGEMENT ───────────────────────────────

    static void gradeMenu() {
        System.out.println("\n  1.Add Marks  2.Update Marks  3.View Grades");
        int ch = readInt("  Choice: ");
        switch (ch) {
            case 1 -> addMarks();
            case 2 -> updateMarks();
            case 3 -> viewGrades();
        }
    }

    static void addMarks() {
        Student s = findStudentByRoll();
        if (s == null) return;

        System.out.println("\n  Available Subjects:");
        subjects.forEach(sub -> System.out.println("  " + sub));

        int subId = readInt("  Enter Subject ID: ");
        Subject sub = findSubjectById(subId);
        if (sub == null) { System.out.println("  Subject not found."); return; }

        System.out.printf("  Enter marks for %s (max %d): ",
                sub.getSubjectName(), sub.getMaxMarks());
        double marks = readDouble();
        if (marks < 0 || marks > sub.getMaxMarks()) {
            System.out.println("  Invalid marks."); return;
        }

        s.addGrade(new Grade(sub, marks));
        GradeCalculator calc = new GradeCalculator();
        System.out.printf("  Marks added. Grade: %s  GP: %.1f  Remark: %s%n",
                calc.computeGrade(marks),
                calc.computeGPA(marks),
                calc.getRemark(marks));
    }

    static void updateMarks() {
        Student s = findStudentByRoll();
        if (s == null) return;

        if (s.getGrades().isEmpty()) { System.out.println("  No grades recorded."); return; }
        System.out.println("\n  Current grades:");
        s.getGrades().forEach(g ->
            System.out.printf("  [%d] %-28s  %.1f%n",
                g.getSubject().getSubjectId(),
                g.getSubject().getSubjectName(),
                g.getMarksObtained()));

        int    subId    = readInt("  Enter Subject ID to update: ");
        System.out.print("  New marks: ");
        double newMarks = readDouble();

        if (s.updateGrade(subId, newMarks))
            System.out.println("  Marks updated successfully.");
        else
            System.out.println("  Subject not found in student's grades.");
    }

    static void viewGrades() {
        Student s = findStudentByRoll();
        if (s == null) return;
        Report.printReportCard(s);
    }

    // ── 3. REPORTS ────────────────────────────────────────

    static void reportMenu() {
        System.out.println("\n  1.Report Card  2.Class Report  3.Subject Analysis  4.Pass/Fail Summary");
        int ch = readInt("  Choice: ");
        switch (ch) {
            case 1 -> {
                Student s = findStudentByRoll();
                if (s != null) Report.printReportCard(s);
            }
            case 2 -> {
                Department d = selectDept();
                if (d != null) Report.printClassReport(d.getStudents());
            }
            case 3 -> {
                System.out.println("\n  Subjects:");
                subjects.forEach(sub -> System.out.println("  " + sub));
                int id = readInt("  Enter Subject ID: ");
                Subject sub = findSubjectById(id);
                if (sub == null) { System.out.println("  Subject not found."); return; }
                Department d = selectDept();
                if (d != null) Report.printSubjectAnalysis(d.getStudents(), sub);
            }
            case 4 -> passFailSummary();
        }
    }

    static void passFailSummary() {
        System.out.println("\n  ─── Pass / Fail Summary by Department ───");
        for (Department d : departments) {
            int pass = 0, fail = 0;
            for (Student s : d.getStudents()) {
                if (s.getGrades().isEmpty()) continue;
                if (s.getOverallResult().equals("PASS")) pass++;
                else fail++;
            }
            System.out.printf("  %-20s  Pass:%3d  Fail:%3d  Total:%3d%n",
                    d.getDeptName(), pass, fail, d.getStudents().size());
        }
    }

    // ── 4. SUBJECT MANAGEMENT ─────────────────────────────

    static void subjectMenu() {
        System.out.println("\n  1.Add Subject  2.View Subjects");
        int ch = readInt("  Choice: ");
        if (ch == 1) {
            System.out.print("  Subject Name : "); String name = sc.nextLine().trim();
            System.out.print("  Subject Code : "); String code = sc.nextLine().trim();
            int credits  = readInt("  Credits      : ");
            int maxMarks = readInt("  Max Marks    : ");
            Subject s = new Subject(name, code, credits, maxMarks);
            subjects.add(s);
            System.out.println("  Subject added! ID: " + s.getSubjectId());
        } else {
            System.out.println("\n  ─── Subjects ───");
            subjects.forEach(s -> System.out.println("  " + s));
        }
    }

    // ── 5. SEARCH ─────────────────────────────────────────

    static void searchMenu() {
        System.out.println("\n  1.Search by Name  2.Search by Roll");
        int ch = readInt("  Choice: ");
        if (ch == 1) {
            System.out.print("  Enter name: ");
            String name = sc.nextLine().trim();
            boolean found = false;
            for (Department d : departments) {
                Student s = d.findByName(name);
                if (s != null) { s.displayInfo(); found = true; }
            }
            if (!found) System.out.println("  No student found with name: " + name);
        } else {
            Student s = findStudentByRoll();
            if (s != null) s.displayInfo();
        }
    }

    // ── 6. TOPPERS ────────────────────────────────────────

    static void topperMenu() {
        Department d = selectDept();
        if (d == null) return;
        int n = readInt("  Show top how many students? ");
        List<Student> toppers = d.getToppers(n);
        System.out.println("\n  ─── Top " + n + " Students — " + d.getDeptName() + " ───");
        int rank = 1;
        for (Student s : toppers)
            System.out.printf("  #%-3d %s%n", rank++, s);
    }

    // ── ADMIN LOGIN ───────────────────────────────────────

    static void adminLogin() {
        System.out.println("\n  ─── Admin Login ───");
        System.out.print("  Username: "); String u = sc.nextLine().trim();
        System.out.print("  Password: "); String p = sc.nextLine().trim();
        if (u.equals("admin") && p.equals("1234")) {
            System.out.println("  Login successful! Welcome, " + admin.getName());
        } else {
            System.out.println("  Invalid credentials! Logging in as default admin.");
        }
    }

    // ── HELPERS ───────────────────────────────────────────

    static Student findStudentByRoll() {
        System.out.print("  Enter Roll Number: ");
        String roll = sc.nextLine().trim().toUpperCase();
        for (Department d : departments) {
            Student s = d.findByRoll(roll);
            if (s != null) return s;
        }
        System.out.println("  Student not found: " + roll);
        return null;
    }

    static Department selectDept() {
        System.out.println("\n  Departments:");
        for (int i = 0; i < departments.size(); i++)
            System.out.println("  " + (i+1) + ". " + departments.get(i).getDeptName());
        int di = readInt("  Select: ") - 1;
        if (di < 0 || di >= departments.size()) {
            System.out.println("  Invalid selection."); return null;
        }
        return departments.get(di);
    }

    static Subject findSubjectById(int id) {
        for (Subject s : subjects) if (s.getSubjectId() == id) return s;
        return null;
    }

    static int readInt(String prompt) {
        while (true) {
            try {
                if (!prompt.isEmpty()) System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("  Please enter a valid number.");
            }
        }
    }

    static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("  Please enter a valid number.");
            }
        }
    }

    // ── SEED DATA ─────────────────────────────────────────

    static void seedData() {
        admin = new Admin("Prof. Sharma", "sharma@college.edu",
                          "9000000001", "HOD / System Admin");

        Department cse  = new Department("Computer Science");
        Department ece  = new Department("Electronics");
        Department mech = new Department("Mechanical");
        departments.addAll(Arrays.asList(cse, ece, mech));

        // Subjects
        Subject s1 = new Subject("Data Structures",      "DS101",  4, 100);
        Subject s2 = new Subject("Operating Systems",    "OS201",  4, 100);
        Subject s3 = new Subject("DBMS",                 "DB301",  3, 100);
        Subject s4 = new Subject("Computer Networks",    "CN401",  3, 100);
        Subject s5 = new Subject("Java Programming",     "JP501",  4, 100);
        subjects.addAll(Arrays.asList(s1, s2, s3, s4, s5));

        // CSE Students
        Student st1 = new Student("Arjun Reddy",    "arjun@mail.com",  "9111111111", "Computer Science", 3, "A");
        Student st2 = new Student("Priya Sharma",   "priya@mail.com",  "9222222222", "Computer Science", 3, "A");
        Student st3 = new Student("Ravi Kumar",     "ravi@mail.com",   "9333333333", "Computer Science", 3, "B");
        Student st4 = new Student("Sneha Patel",    "sneha@mail.com",  "9444444444", "Computer Science", 3, "B");
        Student st5 = new Student("Vikram Singh",   "vikram@mail.com", "9555555555", "Computer Science", 3, "A");

        // Add grades
        double[][] marks = {
            {88, 75, 91, 82, 95},  // Arjun
            {92, 88, 87, 90, 94},  // Priya  — topper
            {55, 48, 62, 71, 58},  // Ravi
            {78, 82, 69, 75, 80},  // Sneha
            {35, 42, 50, 38, 45},  // Vikram — some fails
        };

        List<Subject> subList = Arrays.asList(s1, s2, s3, s4, s5);
        Student[] students = {st1, st2, st3, st4, st5};
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subList.size(); j++)
                students[i].addGrade(new Grade(subList.get(j), marks[i][j]));
            cse.addStudent(students[i]);
        }

        // ECE Student samples
        Student e1 = new Student("Meena Iyer",    "meena@mail.com", "9666666666", "Electronics", 4, "A");
        Student e2 = new Student("Kiran Naidu",   "kiran@mail.com", "9777777777", "Electronics", 4, "A");
        Subject e_s1 = new Subject("Circuit Theory",   "CT101", 4, 100);
        Subject e_s2 = new Subject("Digital Electronics","DE201",4, 100);
        subjects.addAll(Arrays.asList(e_s1, e_s2));
        e1.addGrade(new Grade(e_s1, 85)); e1.addGrade(new Grade(e_s2, 78));
        e2.addGrade(new Grade(e_s1, 72)); e2.addGrade(new Grade(e_s2, 65));
        ece.addStudent(e1); ece.addStudent(e2);
    }
}

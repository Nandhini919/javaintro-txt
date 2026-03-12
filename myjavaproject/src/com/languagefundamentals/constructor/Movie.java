package com.languagefundamentals.constructor;

public class Movie {
	String hero;
	String heroine;
	String director;
	String producer;
	String moviename;
	double budget;
	Movie(){
		System.out.println("no-arg constructor called");
	}
	Movie(String producer,String director){
		System.out.println("Parametrized-1  constructor called");
		this.producer=producer;
		this.director=director;
	}
	Movie(Movie m,String hero,double budget){
		System.out.println("Parametrized -2 constructor called");
		this.hero=hero;
		this.budget=budget;
		this.producer=m.producer;
		this.director=m.director;
	}
	Movie(Movie m,String heroine,String moviename){
		System.out.println("Parametrized-3 constructor called");
		this.hero=m.hero;
		this.heroine=heroine;
		this.moviename=moviename;
		this.budget=m.budget;
		this.producer=m.producer;
		this.director=m.director;
	}

	public static void main(String[] args) {
		System.out.println("Main started");
		Movie m=new Movie();
		m.showDetails();
		Movie m1=new Movie("DVV","RAJAMOULI");
		m1.showDetails();
		Movie m2=new Movie(m1,"ALLU ARJUN",60000000000.0);
		m2.showDetails();
		Movie m3=new Movie(m2,"RASHMIKA MANDANA","PUSHPA");
		m3.showDetails();

	}
	void showDetails() {
		System.out.println("Name of the Hero:"+hero);
		System.out.println("Name of the Heroine:"+heroine);
		System.out.println("Name of the Moive:"+moviename);
		System.out.println("Name of the Producer:"+producer);
		System.out.println("Name of the Director:"+director);
		System.out.println("Budget of the Movie:"+budget);
		System.out.println("*************************************");
	}

}

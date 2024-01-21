package org.example;

public class Movie {

    private String title;
    private String nameDirector;
    private String surnameDirector;
    private int durationInMinutes;
    private int productionYear;

    public Movie(String title, String nameDirector, String surnameDirector, int durationInMinutes, int productionYear)
    {
        this.title = title;
        this.nameDirector = nameDirector;
        this.surnameDirector = surnameDirector;
        this.durationInMinutes = durationInMinutes;
        this.productionYear = productionYear;
    }

    public void MovieInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Director: " + nameDirector + " " + surnameDirector);
        System.out.println("Duration: " + durationInMinutes);
        System.out.println("Year : " + productionYear);
    }


}

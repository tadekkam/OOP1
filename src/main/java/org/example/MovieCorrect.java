package org.example;

public class MovieCorrect {

    private String title;
    private String nameDirector;
    private String surnameDirector;
    private int durationInMinutes;
    private int productionYear;

    public MovieCorrect(String title, String nameDirector, String surnameDirector, int durationInMinutes, int productionYear)
    {
        this.title = title;
        this.nameDirector = nameDirector;
        this.surnameDirector = surnameDirector;
        this.durationInMinutes = durationInMinutes;
        this.productionYear = productionYear;
    }

    public void movieInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Director: " + nameDirector + " " + surnameDirector);
        System.out.println("Duration: " + durationInMinutes);
        System.out.println("Year : " + productionYear);
    }


}

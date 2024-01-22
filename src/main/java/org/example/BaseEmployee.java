package org.example;

public class BaseEmployee {
    private final String firstName;
    private final String lastName;
    private final int yearOfEmployment;

    public BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
    }
    public int getYearsOfEmployment() {
        return 2024 - yearOfEmployment;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int calculateMonthlySalary() {
        return 0;
    }
}

class TicketSeller extends BaseEmployee {
    private static final int SALARY = 3000;
    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
    }

    public int getSalary() {
        return SALARY;
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary();
    }

}

class Manager extends BaseEmployee {
    private static final int SALARY_MANAGER = 5000;
    int bonus = 500;
    public Manager(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
    }

    public int getSalary() {
        return SALARY_MANAGER + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary();
    }

}



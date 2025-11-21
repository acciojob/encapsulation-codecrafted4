package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly stud1 = new RWOnly(1,"utkarsh","MP",25);
        RWOnly stud2 = new RWOnly(2,"satyam","Up",26);
        RWOnly stud3 = new RWOnly(3,"malay","Haryana",25);
        RWOnly stud4 = new RWOnly(4,"rahul","Rjasthan",22);
        RWOnly stud5 = new RWOnly(5,"rekha","Karntka",24);

        stud1.getDetails();
        stud2.getDetails();
        stud3.getDetails();
        stud4.getDetails();
        stud5.getDetails();

    }
}
package com.driver;

public class RWOnly {
    private int id ;
    private String name;
    private String address;
    private int age;

    public RWOnly(int id, String name,String address, int age){
        this.id = id;
        this.name = name;
        this.address= address;
        this.age = age;
    }
    public int getId(){ return this.id;}
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}
    public int getAge(){return this.age;}
    public void getDetails(){
        System.out.println("Student-"+getId()+" || "+getName()+" || "+getAddress()+" || "+getAge());
    }
}

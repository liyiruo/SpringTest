package com.springTest;

public class Beans {

    private String name;

    public void setName(String name) {
        System.out.println("setName...");
        this.name = name;
    }

    public void hello(){
        System.out.println("Hello " + name);
    }


    public Beans() {
        System.out.println("HelloWorld's construct...");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Beans{" +
                "name='" + name + '\'' +
                '}';
    }
}
package com.company;

/**
 * Created by root on 15/03/16.
 */
public class Cat {

    private String Name;
    private String Breed;
    private int Age;

    public Cat(String name, String breed, int age) {
        this.Name = name;
        this.Breed = breed;
        this.Age = age;
    }

    public void Meow(){
        System.out.println("\n" + this.Name + " diz: Miau!");
    }

    public void Run(){
        System.out.println("\n" + this.Name + " está correndo");
    }

    public void Jump(){
        System.out.println("\n" + this.Name + " está saltando!");
    }

    public void Scratch(){
        System.out.println("\n" + this.Name + " está arranhando!");
    }

    public void Sleep(){
        System.out.println("\n" + this.Name + " diz: zzzzzzzzz...");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        this.Breed = breed;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }
}

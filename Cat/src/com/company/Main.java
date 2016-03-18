package com.company;

public class Main {

    public static void main(String[] args) {

	    Cat cat1 = new Cat("Ceci", "Sem Raça", 7);

        System.out.println("\nNome: " + cat1.getName());
        System.out.println("Raça: " + cat1.getBreed());
        System.out.println("Idade: " + cat1.getAge());



        Cat cat2 = new Cat("Joca", "Sem Raça", 2);

        System.out.println("\nNome: " + cat2.getName());
        System.out.println("Raça: " + cat2.getBreed());
        System.out.println("Idade: " + cat2.getAge());

        cat2.Jump();
        cat1.Meow();
        cat2.Meow();
        cat2.Run();
        cat1.Run();
        cat2.Scratch();
        cat1.Jump();
        cat1.Scratch();
        cat2.Sleep();

    }
}

package edu.julio.sintax.sixthsection;

public class AboutMe {
    public static void main(String[] args) {
        //the arguments start with index 0
        String name = args [0];
        String surname = args [1];
        int age = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);

        System.out.println("Hi, my name is " + name + " " + surname);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + height + " cm tall");
    }
}


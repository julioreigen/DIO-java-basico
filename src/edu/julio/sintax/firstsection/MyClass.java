package edu.julio.sintax.firstsection;

public class MyClass {
    public static void main(String[] args) {
        String name = "Julio César";
        String surname = "de Brito";
        String fullName = fullName(name, surname);

        System.out.println(fullName);
    }
    static String fullName(String name, String surname){
        return name + " " + surname;
    }
}

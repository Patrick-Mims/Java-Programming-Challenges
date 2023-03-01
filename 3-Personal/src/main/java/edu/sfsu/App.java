package edu.sfsu;

public class App {
    public static void main( String[] args) {
        Personal personal = new Personal("Jason","3232 Elm Street", 100, 123-232-1123 );

        String name = personal.getName();
        String address = personal.getAddress();
        int age = personal.getAge();
        int phone = personal.getPhone();

        System.out.println(name + " " + address + " " + age + " " + phone + " ");
    }
}

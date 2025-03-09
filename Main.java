import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new java.util.Scanner(System.in);
        int age = Scanner.nextInt();
        Scanner scan = new Scanner(System.in);
        String name = Scanner.next();
        Person person1 = new Person(name,age);
        person1.setAge(age);
        person1.setName(name);
        person1.display();
        Person.isYoung(age);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age.\n ");
        int age = scanner.nextInt();
        System.out.println("enter your name.\n");
        String name = scan.next();
        Person person1 = new Person(name,age);
        person1.setAge(age);
        person1.setName(name);
        person1.display();
        person1.isYoung(age);


    }
}
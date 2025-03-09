public class Person {
    private String name;
    private int age;
     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }
     public int getAge() {
         return age;
     }
     public void setName(String name) {
         this.name = name;
     }
     public void setAge(int age) {
         this.age = age;
     }

     public void display(){
         System.out.println("Name: " + name + " Age: " + age);
     }

     public static void isYoung(int age){
         if( age >= 18){
             System.out.println("Young!");
         }
     }
}

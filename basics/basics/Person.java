public class Person {
    
    String name;
    int age;

    
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    
    public void show() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

    
    public static void main(String[] args) {
        Person p = new Person("Siva", 18);
        p.show();
    }
}

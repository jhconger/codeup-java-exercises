public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
//TODO: change the name field to the passed value
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//      // I expected this to evaluate to true and true.  However, these are two different people that happen to have the same name, so the second evaluation should be false.
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//         // This states that both are the same person with the expected boolean evaluation.
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
//      // I expected this outcome of John for both persons followed by jane for both persons since they are set to equal each other.
    }
}

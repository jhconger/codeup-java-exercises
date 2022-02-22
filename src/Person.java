public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String personName) {
        this.name = personName;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

    }
}
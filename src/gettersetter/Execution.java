package gettersetter;

public class Execution {
    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo("Tushar", 18);
        c1.setName("Tanishq");
        c1.setNumber(17);
        System.out.println(c1.getName());
        System.out.println(c1.getNumber());
    }
}

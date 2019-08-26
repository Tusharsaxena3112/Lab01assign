package toString;

public class A {

    private String name;
    private B birthday;

    public A(String name, B birthday) { //constructor
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("Your name is %s and your birthday is %s", name, birthday);
    }

}


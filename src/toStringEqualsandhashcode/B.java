package toStringEqualsandhashcode;

public class B {
    private int d;
    private int m;
    private int y;

    public B(int d, int m, int y) { //Constructor
        this.d = d;
        this.m = m;
        this.y = y;
    }

    @Override
    public String toString() { //toString
        return String.format("%d/%d/%d", d, m, y);
    }

}

/**
 * Created by danawacomputer on 2017-07-13.
 */
class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    private int x;

    Parent() {
        this.x = 10;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}

class Child extends Parent {
    void method() {
        System.out.println("x = " + getX());
        System.out.println("this.x = " + this.getX());
        System.out.println("super.x = " + super.getX());
    }
}

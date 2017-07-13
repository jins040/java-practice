/**
 * Created by danawacomputer on 2017-07-13.
 */
class SuperTest2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Child2 extends Parent {

    private int x;

    Child2() {
        this.x = 20;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getX() {
        return x;
    }

    void method() {
        System.out.println("x = " + getX());
        System.out.println("this.x = " + this.getX());
        System.out.println("super.x = " + super.getX());
    }
}
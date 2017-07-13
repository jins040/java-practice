/**
 * Created by danawacomputer on 2017-07-13.
 */
class SuperTest3 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x = " + p3.getX());
        System.out.println("p3.y = " + p3.getY());
        System.out.println("p3.z = " + p3.getZ());
    }
}

class Point {
    private int x;
    private int y;

    Point() {
        this(10, 20);
    }

    Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

class Point3D extends Point {
    private int z;

    Point3D() {
        //this(100, 200, 300);
        this.z = 300;
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.setZ(z);
    }

    public void setZ(int z) {
        this.z = z;
    }
    public int getZ() {
        return z;
    }
}
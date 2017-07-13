/**
 * Created by danawacomputer on 2017-07-13.
 */
class CastingTest1 {
    public static void main(String[] args) {
        CarFunc car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        car = fe;
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class FireEngine extends CarFunc {
    void water() {
        System.out.println("water!!");
    }
}

class CarFunc {
    private String color;
    private int door;

    CarFunc() {
        this("white", 4);
    }
    CarFunc(String color, int door) {
        this.setColor(color);
        this.setDoor(door);
    }

    void drive() {
        System.out.println("drive, Brrr~~");
    }
    void stop() {
        System.out.println("stop!!");
    }

    void setColor(String color) {
        this.color = color;
    }
    String getColor() {
        return color;
    }
    void setDoor(int door) {
        this.door = door;
    }
    int getDoor() {
        return door;
    }
}
/**
 * Created by danawacomputer on 2017-07-12.
 */
class ConstructorTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.printf("c1의 color = %s, gearType = %s, door = %d \n", c1.getColor(), c1.getGearType(), c1.getDoor());
        System.out.printf("c2의 color = %s, gearType = %s, door = %d \n", c2.getColor(), c2.getGearType(), c2.getDoor());
    }
}

class Car {
    private String color;
    private String gearType;
    private int door;

    public Car() {
        //this("white", "auto", 4);
    }

    public Car(String color) {
        this(color, "auto", 4);
    }

    public Car(String color, String gearType, int door) {
        this.setColor(color);
        this.setGearType(gearType);
        this.setDoor(door);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}

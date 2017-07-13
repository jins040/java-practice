/**
 * Created by danawacomputer on 2017-07-12.
 */
class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값은 " + t1.getChannel() + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.getChannel() + "입니다.");

        //t2 = t1;

        t1.setChannel(7);

        System.out.println("t1의 채널을 7로 변경했습니다.");

        System.out.println("t1의 channel 값은 " + t1.getChannel() + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.getChannel() + "입니다.");

        t2.channelUp();
        t2.channelUp();

        System.out.println("t1의 channel 값은 " + t1.getChannel() + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.getChannel() + "입니다.");

        t1.power();
        System.out.println("t1의 전원상태는 " + t1.isPower() + "입니다.");
        t1.power();
        System.out.println("t1의 전원상태는 " + t1.isPower() + "입니다.");
    }
}

class Tv {
    private String color;
    private boolean power;
    private int channel;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

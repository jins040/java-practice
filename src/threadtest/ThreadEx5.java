package threadtest;

/**
 * Created by danawacomputer on 2017-07-14.
 */
class ThreadEx5 {
    static long startTime = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadEx5_1());
        t1.start();

        startTime = System.currentTimeMillis();

        for(int i = 0 ; i < 500 ; i++) {
            System.out.print("-");
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}

class ThreadEx5_1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0 ; i < 500 ; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
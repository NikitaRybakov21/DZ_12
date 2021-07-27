import java.util.Arrays;

public class Main extends Thread {
    static final int SIZE = 100000000;
    static final int HALF = SIZE / 8;
    static float[] arr = new float[SIZE];
    static float[] arr2 = new float[SIZE];
    static boolean flag1,flag2,flag3,flag4,flag5,flag6,flag7,flag8 = false;

    public static void main(String[] args) throws InterruptedException {
        long a = System.currentTimeMillis();
        tread();
        System.out.println(System.currentTimeMillis() - a);

        long b = System.currentTimeMillis();
        multiTread();

        while (true){
            Thread.sleep(2);
            if(flag1 && flag2 && flag3&& flag4 && flag5 && flag6 && flag7 && flag8) {
                System.out.println(System.currentTimeMillis() - b);
                System.out.println(Arrays.equals(arr,arr2));
                return;
            }
        }
    }

    private static void tread(){
        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void  multiTread(){
        long b = System.currentTimeMillis();

        Arrays.fill(arr2, 1);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < HALF; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag1 = true;
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF; i < HALF*2; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag2 = true;
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF*2; i < HALF*3; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag3 = true;
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF*3; i < HALF*4; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag4 = true;
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF*4; i < HALF*5; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag5 = true;
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF*5; i < HALF*6; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag6 = true;
            }
        });
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF*6; i < HALF*7; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag7 = true;
            }
        });
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = HALF*7; i < HALF*8; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                flag8 = true;
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    }
}

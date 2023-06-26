package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Thread2 th2 = new Thread2();
        Thread3 th3 = new Thread3();

        th2.setPriority(Thread.MAX_PRIORITY); // 10
        th3.setPriority(Thread.MIN_PRIORITY); // 1

        System.out.println("th2 우선순위 : " + th2.getPriority());
        System.out.println("th3 우선순위 : " + th3.getPriority());

        th2.start();
        th3.start();
    }
}

class Thread2 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
            for (long j = 0; j < 10000000L; j++);
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
            for (long j = 0; j < 10000000L; j++);
        }
    }
}

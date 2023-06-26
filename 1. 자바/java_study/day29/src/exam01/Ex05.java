package exam01;

public class Ex05 {
    public static void main(String[] args) {
        ThreadEx05 th1 = new ThreadEx05("*");
        ThreadEx05 th2 = new ThreadEx05("**");
        ThreadEx05 th3 = new ThreadEx05("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();

            Thread.sleep(2000);
            th2.suspend();

            Thread.sleep(3000);
            th1.resume();

            Thread.sleep(3000);
            th1.stop();
            th2.stop();

            Thread.sleep(2000);
            th3.stop();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class ThreadEx05 implements Runnable {
    private volatile boolean isStop;
    private volatile boolean isSuspended;

    private Thread th;

    public ThreadEx05(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!isStop) {
            if (!isSuspended) {
                System.out.println(Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupted : " + isSuspended + ", " + isStop);
                    // 응답성 향상
                }
            } else { // 일시정지 상태
                Thread.yield(); // 응답성이 향상
            }
        }

        System.out.println(Thread.currentThread().getName() + " - 중지!");
    }
    
    // 쓰레드 시작 
    public void start() {
        th.start();
    }
    
    // 쓰레드 중지
    public void stop() {
        isStop = true;
        th.interrupt();
        System.out.println("interrupt() - stop");
    }
    
    // 일시 정지
    public void suspend() {
        isSuspended = true;
        th.interrupt();
        System.out.println("interrupt() - suspend");
    }
    
    // 다시 시작
    public void resume() {
        isSuspended = false;
    }
}

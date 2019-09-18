public class Thread1_3 extends Thread{

    @Override
    public void run() {
        synchronized (Main.lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("1");
                    Main.lock.notify();
                    Main.lock.wait();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
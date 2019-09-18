public class Thread2_3 extends Thread{

    @Override
    public void run() {
        synchronized (Main.lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    Main.lock.wait();
                    System.out.print("2");
                    Main.lock.notify();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
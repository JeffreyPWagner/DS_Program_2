public class Thread1_2 extends Thread{

    @Override
    public void run() {
        synchronized (Main.lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.print("1");
                }
                Main.lock.notify();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
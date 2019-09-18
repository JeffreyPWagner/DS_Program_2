public class Thread2_2 extends Thread{

    @Override
    public void run() {
        synchronized (Main.lock) {
            try {
                Main.lock.wait();
                for (int i = 0; i < 10; i++) {
                    System.out.print("2");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
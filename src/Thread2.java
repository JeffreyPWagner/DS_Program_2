public class Thread2 extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("2");
                Thread.sleep(100);
            }
            interrupt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

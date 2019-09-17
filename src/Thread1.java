public class Thread1 extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("1");
                Thread.sleep(100);
            }
            interrupt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

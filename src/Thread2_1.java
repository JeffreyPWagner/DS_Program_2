public class Thread2_1 extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("2");
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.util.Scanner;

public class Main {

    public final static Object lock = new Object();

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String taskNumber = "";
            while (!taskNumber.equals("end")) {
                System.out.println("Enter a task number or end");
                taskNumber = scanner.next();
                if (taskNumber.equals("1")) {
                    Thread1_1 t1 = new Thread1_1();
                    Thread2_1 t2 = new Thread2_1();
                    t1.start();
                    t2.start();
                    t1.join();
                    t2.join();
                    System.out.println();
                } else if (taskNumber.equals("2")) {
                    Thread1_2 t1 = new Thread1_2();
                    Thread2_2 t2 = new Thread2_2();
                    t2.start();
                    t1.start();
                    t1.join();
                    t2.join();
                    System.out.println();
                } else if (taskNumber.equals("3")) {
                    Thread1_3 t1 = new Thread1_3();
                    Thread2_3 t2 = new Thread2_3();
                    t2.start();
                    t1.start();
                    t1.join();
                    t2.join();
                    System.out.println();
                } else if (taskNumber.equals("end")) {
                    break;
                } else {
                    System.out.println("Unsupported selection");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

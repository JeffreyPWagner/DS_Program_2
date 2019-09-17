import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String taskNumber = "";
            while (!taskNumber.equals("end")) {
                System.out.println("Enter a task number");
                taskNumber = scanner.next();
                if (taskNumber.equals("1")) {
                    Thread1 t1 = new Thread1();
                    Thread2 t2 = new Thread2();
                    t1.start();
                    t2.start();
                    t1.join();
                    t2.join();
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

import java.util.Scanner;

public class SwapFeetAndMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double foot, meter;
        do {
            System.out.println("--------------------------");
            System.out.println("|           Menu          |");
            System.out.println("|1. Foot To Meter |");
            System.out.println("|2. Meter To Foot |");
            System.out.println("|0. Exit                  |");
            System.out.println("--------------------------");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number foot: ");
                    foot = scanner.nextDouble();
                    System.out.println("Result is : " + footToMeter(foot));
                    break;
                case 2:
                    System.out.println("Enter number meter : ");
                    meter = scanner.nextDouble();
                    System.out.println("Result is : " + meterToFoot(meter));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn chọn giá trị từ 0 -2 ");
            }
        } while (choice != 0);
    }

    public static double footToMeter(double foot) {
        final double FOOT_TO_MET = 0.305;
        return FOOT_TO_MET * foot;
    }

    /**
     * Chuyển đổi từ meters sang feet
     **/
    public static double meterToFoot(double meter) {
        final double MET_TO_FOOT = 3.279;
        return MET_TO_FOOT * meter;

    }
}

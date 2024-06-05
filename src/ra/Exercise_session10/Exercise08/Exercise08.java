package ra.Exercise_session10.Exercise08;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputNumber(scanner);
    }

    public static void inputNumber(Scanner scanner) {
        do {
            try {
                System.out.println("Nhập vào cạnh thứ nhất");
                int side1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh thứ hai");
                int side2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh thứ ba");
                int side3 = Integer.parseInt(scanner.nextLine());
                if ((side1 < 0 || side2 < 0 || side3 < 0) || (side1 + side2 < side3 && side1 + side3 < side2 && side2 + side3 < side1)) {
                    throw new IllegalTriangleException("Độ dài cạnh không hợp lệ");
                } else {
                    break;
                }
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}

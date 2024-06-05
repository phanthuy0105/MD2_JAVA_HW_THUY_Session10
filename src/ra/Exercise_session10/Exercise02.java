package ra.Exercise_session10;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("CHƯƠNG TRÌNH BẮT ĐẦU");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int firstNumber = inputNumber(scanner);
        System.out.println("Nhập vào số thứ hai:");
        int secondNumber = inputNumber(scanner);
        int sum = firstNumber + secondNumber;
        System.out.println("Kết quả: " + sum);
        System.out.println("CHƯƠNG TRÌNH KẾT THÚC");
    }

    public static int inputNumber(Scanner scanner) {
        do {
            //Bắt số vừa nhập phải là số nguyên
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException ex) {
                System.err.println("Số vừa nhập không phải số nguyên, vui lòng nhập lại");
            }
        } while (true);
    }
}
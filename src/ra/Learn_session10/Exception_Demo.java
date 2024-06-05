package ra.Learn_session10;

import java.util.Scanner;

public class Exception_Demo {
    public static void main(String[] args) {
        System.out.println("CHƯƠNG TRÌNH BẮT ĐẦU");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int result = firstNumber / secondNumber;
        System.out.println("Thương 2 số là: " + result);
        System.out.println("CHƯƠNG TRÌNH KẾT THÚC");
    }
}
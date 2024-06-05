package ra.Exercise_session10;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("CHƯƠNG TRÌNH BẮT ĐẦU");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int result = divide(firstNumber, secondNumber);
        System.out.println("Kết quả: " + result);
        System.out.println("CHƯƠNG TRÌNH KẾT THÚC");
    }

    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException,NumberFormatException{
        //throw: Ném ngoại lệ cho các trường hợp cụ thể
        if (secondNumber==0){
            //Ném ra 1 đối tượng ngoại lệ để xử lý
            throw new ArithmeticException("lỗi chia cho 0");
        }
        int result = firstNumber / secondNumber;
        return result;
    }
}
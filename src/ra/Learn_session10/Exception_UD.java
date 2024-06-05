package ra.Learn_session10;

import java.util.Scanner;

public class Exception_UD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập vào tên sinh viên là số nguyên có giá trị lớn hơn hoặc bằng 18
        int age = inputAge(scanner);
        System.out.println("Tuổi sinh viên vừa nhập là: " + age);
    }

    public static int inputAge(Scanner scanner) {
        System.out.println("Nhập vào tuổi sinh viên:");
        do {
            //Bắt tuổi phải là số nguyên
            try {
                int age = Integer.parseInt(scanner.nextLine());
                //Giá trị lớn hơn hoặc bằng 18
                if (age >= 18) {
                    return age;
                } else {
                    System.err.println("Tuổi sinh viên phải lớn hơn hoặc bằng 18");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Tuổi sinh viên phải là số nguyên");
            }
        } while (true);
    }
}
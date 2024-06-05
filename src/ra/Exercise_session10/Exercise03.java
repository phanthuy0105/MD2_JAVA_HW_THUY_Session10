package ra.Exercise_session10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        List<Integer> arrInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.printf("arrInt.add(%d) = ", i);
            arrInt.add(Integer.parseInt(scanner.nextLine()));
        }
        
        divide(arrInt);

        Integer max = Collections.max(arrInt);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }

    public static void divide(List<Integer> arrInt) throws ArithmeticException{
        if (arrInt.size() == 0) {
            throw new ArithmeticException("mảng không có phần tử nào");
        }
    }
}
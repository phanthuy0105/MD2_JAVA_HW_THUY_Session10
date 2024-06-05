package ra.Exercise_session10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = inputCreated(scanner);
        System.out.println("dd/MM/yyyy " + date);
    }
    public static Date inputCreated(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào ngày tháng năm dd/MM/yyyy:");
        do {
            String createdStr = scanner.nextLine();
            try {
                Date created = sdf.parse(createdStr);
                return created;
            } catch (Exception ex) {
                System.err.println("Ngày nhập có định dạng dd/MM/yyyy, vui lòng nhập lại");
            }
        } while (true);
    }
}

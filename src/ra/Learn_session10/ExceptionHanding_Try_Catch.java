package ra.Learn_session10;

import java.util.Scanner;

public class ExceptionHanding_Try_Catch {
    public static void main(String[] args) {
        /*
         * try{
         *       Block Statements;
         * }catch(Exception1 ex){
         *       Handing Exception Block1;
         * }catch(Exception2 ex){
         *       Handing Exception Block2;
         * }...
         * catch(ExceptionN ex){
         *       Handing Exception BlockN;
         * }finally{
         *       Khối lệnh luôn luôn được thực hiện dù có exception hay không
         * }
         *
         * */
        System.out.println("CHƯƠNG TRÌNH BẮT ĐẦU");
        Scanner scanner = new Scanner(System.in);
        //Xử lý exception trong khối lệnh dưới
        try {
            System.out.println("Nhập vào số thứ nhất:");
            int firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số thứ hai:");
            int secondNumber = Integer.parseInt(scanner.nextLine());
            int result = firstNumber / secondNumber;
            System.out.println("Thương 2 số là: " + result);
        } catch (NumberFormatException nfe) {
            //Khối lệnh xử lý exception khi lỗi convert String --> Number
            System.err.println("Dữ liệu đầu vào không đúng");
            System.out.println("Đã xử lý xong exception này");
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("CHƯƠNG TRÌNH KẾT THÚC");
        }


    }
}
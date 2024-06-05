package ra.Exercise_session10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercise06 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("Hằng");
        list.add(5);
            int sum = 0;
            for (Object element : list) {
                try {
                    sum += Integer.parseInt(element.toString());
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
        System.out.println(sum);
    }
}

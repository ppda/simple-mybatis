import java.util.ArrayList;
import java.util.List;

public class T {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> integers = list.subList(0, 5);
        System.out.println(integers);
    }
}

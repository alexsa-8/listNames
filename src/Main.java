import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        list.add("Дима");
        list.add("Оля");
        list.add("Женя");
        list.add("Саша");
        list.add("Тома");
        System.out.println(list);

        for (String element : list) {
            String s1 = element.substring(1);
            list1.add(s1);
        }
        System.out.println(list1);

        list1.sort(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2.toString());
            }
        });
        System.out.println(list1);
    }
}
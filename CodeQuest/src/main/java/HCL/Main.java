package HCL;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Orange");
        map.put(2, "Apple");
        map.put(3, "Grape");
        map.put(4, "Banana");

        Map<Integer, String> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        System.out.println(sortedMap);
    }
}

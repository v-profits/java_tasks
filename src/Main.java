import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Отыскание первого неповторяющегося символа. Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.";
        char[] arr = str.toCharArray();
        System.out.println(arr);

        Map<Character,Integer>map = new HashMap<>();
        int j;
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                j = map.get(ch) + 1;
                map.replace(ch, j); //если ключ/значение есть - меняет значение
            }
            else map.put(ch, 1); //добавляет ключ/значение
        }
//        System.out.println(map);
//        for (Integer value : map.values()) { //map.values() - все значения
//            System.out.println(value);
//        }

        for (Character ch : map.keySet()) { //map.keySet() - все ключи
            if (map.get(ch) == 1) { //map.get(ch) - значение по ключу
                System.out.println(ch);
                break;
            }
        }
    }
}

//1.2.  Отыскание первого неповторяющегося символа. Написать программу,
//        которая возвращает первый неповторяющийся (некратный) символ в заданной строке.







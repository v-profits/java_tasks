import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Подсчет повторяющихся символов. Написать программу, " +
                "которая подсчитывает повторяющиеся символы в заданной строке.";
        char[] arr = str.toCharArray();
        System.out.println(arr);
        Map<Character,Integer> map = new HashMap<>();

        int j;
        for (char ch : arr) { //перебор элементов arr
            if (map.containsKey(ch)) { //возвращает true, если коллекция содержит ключ arr[i]
                j = map.get(ch) + 1; //возвращает значение объекта
                map.replace(ch, j); //заменить элемент
            }
            else
                map.put(ch, 1);//добавить элемент
        }
        System.out.println(map); //выводим все ключ/значение

        int k = 1;
//        System.out.print('{');
//        for(Map.Entry<Character,Integer>item : map.entrySet()) { //перебор элементов map
//            if(item.getValue() != 1 && map.size() != k)
//                System.out.printf("%s=%d, ", item.getKey(), item.getValue());
//            else if(item.getValue() != 1)
//                System.out.printf("%s=%d", item.getKey(), item.getValue());
//            ++k;
//        }
//        System.out.print('}');
//        k = 1;
//        System.out.println();

        System.out.print('{');
        for(Character key : map.keySet()) { //перебор ключей map
            if(map.get(key) != 1 && map.size() != k)
                System.out.printf("%s=%d, ", key, map.get(key));
            else if(map.get(key) != 1)
                System.out.printf("%s=%d", key, map.get(key));
            ++k;
        }
        System.out.print('}');
    }
}

//1.  Подсчет повторяющихся символов. Написать программу,
// которая подсчитывает повторяющиеся символы в заданной строке.

//https://metanit.com/java/tutorial/5.8.php
//https://hr-vector.com/java/hashmap






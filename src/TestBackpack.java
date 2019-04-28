
import java.util.*;

public class TestBackpack {
    // версия с ходу для наполняемости рюкзака
    public static void main(String[] args) {
        List<Integer> arrBackpack = new ArrayList<>();
        Map<Integer, Integer> obj = new HashMap<>();
        Map<Integer, Integer> objValue = new LinkedHashMap<>();
        int maxKg = 7;
        int result = 0;
        obj.put(4, 20);
        obj.put(3, 18);
        obj.put(2, 14);

        for (Map.Entry<Integer, Integer> entry : obj.entrySet()) {
            objValue.put(entry.getValue() / entry.getKey(), entry.getKey());
        }

        for (Map.Entry<Integer, Integer> iter : objValue.entrySet()) {
            if (iter.getValue() < maxKg) {
                maxKg = maxKg - iter.getValue();
                arrBackpack.add(iter.getKey() * iter.getValue());
            } else { // если не лезет в рюкзак полностью, то добавить остаток в свободного места рюкзака
                arrBackpack.add(iter.getKey() * maxKg);
            }
        }

        System.out.println(objValue);
        System.out.println(arrBackpack);
    //возврат общего результата
        for (Integer integer : arrBackpack) {
            result += integer;
        }

        System.out.println(result);
    }


}

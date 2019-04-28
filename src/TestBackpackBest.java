import java.util.Arrays;
import java.util.Comparator;

public class TestBackpackBest {
    //продуманная версия для наполняемости рюкзака
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);
        final int W = 7;
        final Item[] arrItem = {item1, item2, item3};

        //сортировка в обратном порядке исходя из ценности на единицу кг.
        Arrays.sort(arrItem, Comparator.comparingDouble(Item::valueOfWeight).reversed());
        System.out.println(Arrays.toString(arrItem));

        int tempWeight = 0;
        double tempValue = 0;
        int tempItem = 0;

        while (tempItem < arrItem.length && tempWeight != W) {
            // целые предметы
            if (tempWeight + arrItem[tempItem].getWeight() < W) {
                tempValue += arrItem[tempItem].getValue();
                tempWeight += arrItem[tempItem].getWeight();
            } else { // если целый предмет не лезет, а место в рюкзаке осталось
                tempValue += ((W - tempWeight) / (double) arrItem[tempItem].getWeight() * arrItem[tempItem].getValue());
                tempWeight = W; // полный
            }
            tempItem++;
        }
        System.out.println("Рюкзак наполнен: " + tempValue);

    }

    static class Item {
        private int weight;
        private int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

        public double valueOfWeight() {
            return value / (double) weight;
        }

        @Override
        public String toString() {
            return "weight=" + weight +
                    ", value=" + value;
        }
    }
}

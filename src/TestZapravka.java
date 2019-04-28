public class TestZapravka {
    public static void main(String[] args) {
        int limit = 400;
        int[] taipLimit = {0, 200, 375, 550, 750, 950};
        System.out.println(stopMetod(taipLimit, limit));

    }

// если вывод = -1, то данный путь невозможно проехать
    public static int stopMetod(int[] taipLimit, int limit) {
        int count = 0;
        for (int i = 0; i < taipLimit.length; i++) {
            if (taipLimit[i] > limit) {
                return -1;
            }
            if (i < taipLimit.length - 1) {
                if (taipLimit[i] < limit && taipLimit[i + 1] >= limit) {
                    count++;
                    limit = taipLimit[i] + limit; // 375+400=775
                }
            }
        }
        return count;
    }

}

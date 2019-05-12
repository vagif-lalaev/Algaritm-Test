public class Singleton {
    private static class Holder {
        private static Singleton INSTANCE = null;
    }

    public Singleton() {
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}

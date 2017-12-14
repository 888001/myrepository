package prototype;

class Singleton {
    private static Singleton intsance = new Singleton();
    public static int counter1;
    public static int counter2 = 0;
    private Singleton() {
        counter1++;
        counter2++;
    }
    public static Singleton getInstance() {
        return intsance;
    }

}
	public class Test111 {
		public static void main(String[] args) {
			@SuppressWarnings("unused")
			Singleton instance = Singleton.getInstance();
			System.out.println("counter1 = " + Singleton.counter1 + ", counter2 = " + Singleton.counter2);
		}
	}
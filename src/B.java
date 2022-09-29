public class B {
    public static void main(String[] args) {
        A a = new A();
        a.setCount(-10);
        //a.count = -10;
        System.out.println("Count is " + a.getCount());
        a.setCount(10);
        System.out.println("Count is " + a.getCount());

    }
}

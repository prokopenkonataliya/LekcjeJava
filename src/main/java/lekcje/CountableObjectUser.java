package lekcje;

public class CountableObjectUser {
    public static void main(String[] args) {
        CountableObject countableObject = new CountableObject();
        countableObject.setCount(-10);
        //a.count = -10;
        System.out.println("Count is " + countableObject.getCount());
        countableObject.setCount(10);
        System.out.println("Count is " + countableObject.getCount());

    }
}

public class A {
   private int count;
    public void setCount(int aCount){
        if(aCount < 0){
            System.out.println("Inverint count");
        } else {
            count = aCount;
        }
    }
    public int getCount(){
        return count;
    }
}

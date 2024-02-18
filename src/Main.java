
public class Main {
    public static void main(String[] args) {
        Integer a =10;
        String b="can";
        Double d=3.14;
        Test<String,Integer,Double> t=new Test<>(b,a,d);
        t.showInfo();




    }
}
package inheritance02;

public class 박쥐 extends 포유류 implements 날수있는 {
    박쥐() {
        myClass = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println(myClass + "가 날고 있어요");
    }
}

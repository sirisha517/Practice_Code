public class TestOops {
    public String test1(){
        String a = "siri ";
        String b = "kallempudi";
        return a+b;

    }
    public static void main(String[] args){
        TestOops test = new TestOops();
        test.test1();
        System.out.println("String:"+test.test1());
    }
}

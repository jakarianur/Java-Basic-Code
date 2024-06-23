class A {
    private int data = 40;
    private void msg() {
        System.out.println("Hello java");
    }
    public int getData() {
        return data;
    }
    public void callMsg() {
        msg();
    }
}
public class Simple {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getData()); 
        obj.callMsg();
    }
}

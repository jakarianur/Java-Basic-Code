public class NewClass {   
    int max = 100;  
    static int var = 50;  

    public static void sum() {        
        NewClass obj = new NewClass();
        System.out.println(obj.max);        
        System.out.println(var);        
    }        

    public static void main(String[] args) {
        int a = 10, b = 20; 
        System.out.println(a + b);        
        NewClass obj = new NewClass();
        System.out.println(obj.max);        
        System.out.println(var);                     
        sum();
    }
}

interface MyInterface{
    public void method1();
    public void method2();
}

class main implements MyInterface{
    public void method1(){
        System.out.println("Implementation of method1");
    }
    public void method2(){
        System.out.println("Implementation of method2");
    }
    public static void main(String arg[]){
        MyInterface obj = new main();
        obj.method1();
        obj.method2();
    }
}
package assignment.day_1;

public class StaticVariable {
    static int a = 20;
    static int b = 10;

    static void add(){
        int c = a +b;
        System.out.println("Addition= " + c);
    }
    static void sub(){
        int d = a-b;
        System.out.println("Subtraction= " +d);
    }
    static void mul(){
        int e = a*b;
        System.out.println("Multilpication= " +e);
    }
    static void div(){
        int f = a/b;
        System.out.println("Division= " +f);
    }
    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();

    }
}

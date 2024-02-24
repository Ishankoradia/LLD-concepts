package lld.InheritanceAndPolymorphism;

public class C extends P{
    protected int d2 = 20;
    protected int d = 200;
 
    protected void fun2(){
        System.out.println("inside C's fun2");
    }
 
    protected void fun(){
        System.out.println("inside C's fun");
    }

    protected void fun(int a){
        System.out.println("inside C's fun + " + a);
    }
 
    static protected void sfun(){
        System.out.println("inside C's sfun");
    }
}
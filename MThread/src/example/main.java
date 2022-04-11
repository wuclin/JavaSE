package example;

public class main {
    public static void main(String[] args){
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);
        a.setName("A");
        b.setName("B");
        a.start();b.start();
    }
}

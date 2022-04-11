public class mai {
    public static void main(String[] args){
        Service s = new Service();
        ThreadA a = new ThreadA(s);
        ThreadB b = new ThreadB(s);
        a.setName("AA");b.setName("BB");
        a.start();
        b.start();
    }
}

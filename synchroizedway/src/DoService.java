public class DoService {
    public synchronized  void methodA() {
        try{
            Thread.sleep(2000);
            System.out.println("同步方法A"+Thread.currentThread().getName()+"run now");
            while(true){

            }
        }catch (Exception E){
            System.out.println(E.getStackTrace());
        }
    }
    public synchronized void methodB() {
        try{
            Thread.sleep(2000);
            System.out.println("同步方法B"+Thread.currentThread().getName()+"run now");
        }catch (Exception E){
            System.out.println(E.getStackTrace());
        }
    }
    public void methodC() {
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"run now");
        }catch (Exception E){
            System.out.println(E.getStackTrace());
        }
    }
    public synchronized static void methodD() {
        try{

            System.out.println("静态同步"+Thread.currentThread().getName()+"run now");
            while(true){
            }
        }catch (Exception E){
            System.out.println(E.getStackTrace());
        }
    }
    public synchronized static void methodE() {
        try{

            System.out.println("静态同步"+Thread.currentThread().getName()+"run now");
            while(true){
            }
        }catch (Exception E){
            System.out.println(E.getStackTrace());
        }
    }

    public void methodF(){
        synchronized (DoService.class){
            System.out.println("类锁");
            while (true){

            }
        }
    }
    public void methodG(DoService s){
        synchronized (s){
            System.out.println("实例锁");
            while(true){

            }
        }
    }
}

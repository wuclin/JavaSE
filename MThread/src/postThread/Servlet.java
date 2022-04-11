package postThread;

public class Servlet {
    private static String nameRef;
    private static String pwdRef;
    public synchronized static void post(String name, String pwd) {
        try {
            nameRef = name;
            if (name.equals("a")){
                Thread.sleep(2000);
            }
            pwdRef = pwd;
            System.out.println("name= "+nameRef+"pwd= "+pwdRef);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

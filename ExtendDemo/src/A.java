public class A {
    public static void main(String[] args) {
        People p = new Student();
        Student s = new Student();
        p = s;
        
        String a = "123";
        System.out.println();
    }
}

class People{

}
class Student extends People{


}
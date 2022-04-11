import java.lang.reflect.Field;

/**
 * 使用反射修改私有变量的值，和有没有set没有关系
 * 如果是私有变量的要使用getDeclaredField方法去获取私有变量
 * 同时要setAccessible为true
 */
public class main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Field field = person.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "qwe");
        System.out.println(person.toString());

    }
}

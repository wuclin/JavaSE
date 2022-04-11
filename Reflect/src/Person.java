public class Person {
    private String name;
    private String phone;

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

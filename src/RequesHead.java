public class RequesHead {

    private String name;

    private String age;

    public RequesHead(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public static void main(String[] args) {
        // haha
    }

    @Override
    public String toString() {
        return "RequesHead{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

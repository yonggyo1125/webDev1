package exam01;

public class Student {
    private String ban;
    private String name;

    public Student(String ban, String name) {
        this.ban = ban;
        this.name = name;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban='" + ban + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

import java.util.List;

public class JavaConfigStudent {

    private int id;
    private String name;
    private List<JavaConfigPhone> ph;
    private JavaConfigAddress add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JavaConfigPhone> getPh() {
        return ph;
    }

    public void setPh(List<JavaConfigPhone> ph) {
        this.ph = ph;
    }

    public JavaConfigAddress getAdd() {
        return add;
    }

    public void setAdd(JavaConfigAddress add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "org.genspark.AnnoStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}

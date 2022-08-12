package annotationStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnnoStudent {

    private int id;
    private String name;
    @Autowired
    private List<AnnoPhone> ph;
    @Autowired
    private AnnoAddress add;


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

    public List<AnnoPhone> getPh() {
        return ph;
    }

    public void setPh(List<AnnoPhone> ph) {
        this.ph = ph;
    }

    public AnnoAddress getAdd() {
        return add;
    }

    public void setAdd(AnnoAddress add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}



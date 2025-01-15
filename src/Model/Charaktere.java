package Model;

import java.util.List;

public class Charaktere implements HasID {
    Integer id;
    String name;
    String Herkunftsort;

    public Charaktere(Integer id, String name, String Herkunftsort) {
        this.id = id;
        this.name = name;
        this.Herkunftsort = Herkunftsort;

    }

    public Integer getID() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunftsort() {
        return Herkunftsort;
    }

    public void setHerkunftsort(String herkunftsort) {
        Herkunftsort = herkunftsort;
    }



    @Override
    public String toString() {
        return "Charaktere{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Herkunftsort='" + Herkunftsort + '\'' +

                '}';
    }
}


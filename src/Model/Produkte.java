package Model;

public class Produkte implements HasID{
    Integer id;
    String Name;
    Integer Preis;
    String HerkunftsRegion;

    public Produkte(Integer id, String Name, Integer Preis, String HerkunftsRegion) {
        this.id = id;
        this.Name = Name;
        this.Preis = Preis;
        this.HerkunftsRegion = HerkunftsRegion;
    }

    public Integer getID() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHerkunftsRegion() {
        return HerkunftsRegion;
    }

    public void setHerkunftsRegion(String herkunftsRegion) {
        HerkunftsRegion = herkunftsRegion;
    }

    public Integer getPreis() {
        return Preis;
    }

    public void setPreis(Integer preis) {
        Preis = preis;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", HerkunftsRegion='" + HerkunftsRegion + '\'' +
                '}';
    }
}

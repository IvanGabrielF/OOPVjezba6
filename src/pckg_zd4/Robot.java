package pckg_zd4;

public class Robot {

    private int id;
    private String desc;



    public Robot(int id, String desc){
        this.desc = desc;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

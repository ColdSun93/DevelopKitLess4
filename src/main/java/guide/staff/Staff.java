package guide.staff;

public class Staff {

    private int id;
    private String phone;
    private String name;
    private int seniority;

    public Staff(int id, String phone, String name, int seniority) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getSeniority() {
        return seniority;
    }

    @Override
    public String toString() {
        return  "Personnel №= " + id +
                ", phone= '" + phone + '\'' +
                ", name= '" + name + '\'' +
                ", seniority= " + seniority;
    }
}

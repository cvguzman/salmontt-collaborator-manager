package Model;

public enum Departament {
    SALT_WATER("Agua Salada"),
    SWEET_WATER("Agua Dulce");

    private String area;

    Departament(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Departament {" +
                "name='" + name() + '\'' +
                '}';
    }

}

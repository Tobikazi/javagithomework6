import java.util.List;

public class Person {

    private String name;
    private String sureName;



    private Integer quantityTickets;

    public Person(String name, String sureName, int quantityTickets) {
        this.name = name;
        this.sureName = sureName;
        this.quantityTickets = quantityTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Integer getQuantityTickets() {
        return quantityTickets;
    }

    public void setQuantityTickets(Integer quantityTickets) {
        this.quantityTickets = quantityTickets;
    }
}

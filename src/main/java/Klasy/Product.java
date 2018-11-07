package Klasy;

/**
 * Created by operator on 01.07.2017.
 */
public class Product {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getspecification() {
        return specification;
    }

    public void setspecification(String specification) {
        this.specification = specification;
    }

    private String specification;

    public Product(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Product(String name, String descripiton, String specification){
        this(name,descripiton);
        this.specification = specification;
    }

}
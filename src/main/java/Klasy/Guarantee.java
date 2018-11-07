package Klasy;
import java.time.LocalDate;
/**
 * Created by operator on 01.07.2017.
 */
public class Guarantee {
    private Product product;
    private LocalDate validUntil;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public Guarantee() {}

    public Guarantee(LocalDate validUntil){
        this.validUntil = validUntil;
    }

    public Guarantee(Product product,LocalDate validUntil){
        this(validUntil);
        this.product = product;
    }


}

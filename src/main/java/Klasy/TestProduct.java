package Klasy;

/**
 * Created by operator on 01.07.2017.
 */
import java.time.LocalDate;

public class TestProduct {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product pralka = new Product("Pralka Bosch","Super pralka");
        Guarantee gurantee = new Guarantee();
        gurantee.setValidUntil(LocalDate.of(2017, 12, 12));
        gurantee.setProduct(pralka);
        Guarantee secondGurantee = new Guarantee(LocalDate.of(2019, 12,5));
        secondGurantee.setProduct(pralka);

        Product phone = new Product("Iphone 7", "iphone najnowsza wersja");

        Guarantee myGuarantee = new Guarantee(phone,LocalDate.of(2017, 11,1));



    }

}
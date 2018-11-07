package Enumy;

/**
 * Stwórz swój własny enum, który będzie przechowywał typy gitar na świecie.
 * Następnie dopisz (lub wymyśl), dwa stałe parametry do tych gitar.
 * Proponuję : ilość strun, średnica bębna.
 *
 * Napisz klasę, która będzie przechowywać typ gitary, cenę, nazwę i producenta.
 * Stwórz w niej gettery, settery i konstruktor.
 * Stwórz listę losowych gitar, a następnie stwórz metodę do sortowania ich względem średnicy bębna.
 *
 * Program główny powinien poprosić użytkownika o wpisanie średnicy do konsoli
 * a następnie dopasować do niej gitarę i wypisać dane na jej temat.
 * Created by operator on 23.06.2017.
 */
public class Guitar implements Comparable<Guitar>{
    private GuitarEnum type;
    private int price;
    private String name;
    private String manufacturer;

    public Guitar(GuitarEnum type, int price, String name, String manufacturer) {
        super();
        setType(type);
        setPrice(price);
        setName(name);
        setManufacturer(manufacturer);
    }
    public int getDiameter(){
        return type.getDiameterofDrum();
    }

    @Override
    public String toString() {
        return "Guitar [type=" + type + ", diameter="+this.getType().getDiameterofDrum()+", price=" + price + ", name=" + name + ", manufacturer=" + manufacturer + "]";
    }

    public GuitarEnum getType() {
        return type;
    }
    public void setType(GuitarEnum type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price<0)
            this.price = price;
        else this.price=0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public int compareTo(Guitar g) {
        if (this.getDiameter()<g.getDiameter()) return -1;
        else if (this.getDiameter()>g.getDiameter()) return 1;
        return 0;
    }

}

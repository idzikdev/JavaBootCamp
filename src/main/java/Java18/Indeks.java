package Java18;

final public class Indeks {
    private String indexNumber;

    public Indeks(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    @Override
    public String toString() {
        return "Indeks{" +
                "indexNumber='" + indexNumber + '\'' +
                '}';
    }
}

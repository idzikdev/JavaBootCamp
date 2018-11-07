package Enumy;

/**
 * Created by operator on 23.06.2017.
 */
public enum GuitarEnum {
    BASS(1,3),ELECTRIC(2,5),ACOUSTIC(3,6);

    private int numberOfStrings;
    private int diameterofDrum;

    private GuitarEnum(int numberOfStrings, int diameterofDrum) {
        this.numberOfStrings = numberOfStrings;
        this.diameterofDrum = diameterofDrum;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getDiameterofDrum() {
        return diameterofDrum;
    }

    public void setDiameterofDrum(int diameterofDrum) {
        this.diameterofDrum = diameterofDrum;
    }

}

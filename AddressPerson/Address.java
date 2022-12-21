package HW_Java.AddressPerson;

public class Address {
    private String straße;
    private int numHause;

    public Address(String straße, int numHause) {
        this.straße = straße;
        this.numHause = numHause;
    }

    public String getAddress() {
        return straße;
    }

    public int getNumHause() {
        return numHause;
    }
    @Override
    public String toString() {
        return "| Address = " +   straße +
                "  numHaus = " + numHause+" | ";
    }
}

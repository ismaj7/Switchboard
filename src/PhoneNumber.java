public class PhoneNumber {

    int prefix;
    int rest;

    public PhoneNumber (int prefix, int rest) {
        this.prefix = prefix;
        this.rest = rest;
    }

    public int getPrefix() {
        return this.prefix;
    }

    public String toString() {
        return this.prefix + "" + this.rest;
    }
}

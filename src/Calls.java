public class Calls {

    PhoneNumber sourcePhone;
    PhoneNumber destinyPhone;
    int length;
    int timeBand = 1 | 2 | 3;
    int order;
    double price;

    public Calls (int order, PhoneNumber sourcePhone, PhoneNumber destinyPhone, int length, int timeBand) {
        this.sourcePhone = sourcePhone;
        this.destinyPhone = destinyPhone;
        this.length = length;
        this.timeBand = timeBand;
        this.order = order;
    }

    public double calcPrice() {
        int sourcePrefix = this.sourcePhone.getPrefix();
        int destinyPrefix = this.destinyPhone.getPrefix();
        if (sourcePrefix == destinyPrefix) {//I guess this is how you know if a call is local or provincial?
            this.price = this.length * 0.15;
        }else {
            if (this.timeBand == 1) {
                this.price = this.length * 0.20;
            }else {
                if (this.timeBand == 2) {
                    this.price = this.length * 0.25;
                }else {
                    if (this.timeBand ==3) {
                        this.price = this.length * 0.30;
                    }
                }
            }
        }
        return this.price;
    }

    public int getLength() {
        return this.length;
    }

    public int getBand() {
        return this.timeBand;
    }

    public String toString() {
        return ("--Source phone was " + sourcePhone.toString() + "--Destiny phone was " + destinyPhone.toString() + "--The length of the call was " + length + "secs.--And the time band of the call was " + timeBand);
    }

    public int getOrder() {
        return this.order;
    }

}

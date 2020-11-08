public class SwitchBoard {

    Calls[] callArray = new Calls[100];

    public SwitchBoard(Calls[] callArray){
        this.callArray = callArray;
    }

    public void printCall(int order) {
        System.out.println(callArray[order].toString());
    }

    public void printEveryCall (int maxOrder) {
        for (int i = 1; i <= maxOrder; i++) {
            System.out.println("This is the call number " + callArray[i].getOrder());
            System.out.println(callArray[i].toString());
            System.out.println("");
        }
    }
}

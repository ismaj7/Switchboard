public class Exercise5 {
    public static void main(String[] argv) {

        Calls[] callArray = new Calls[100];

        //Case 1 - Local call:
        PhoneNumber sourceOne = new PhoneNumber(964, 987654);
        PhoneNumber destinyOne = new PhoneNumber(964, 123456);
        callArray[1] = new Calls (1, sourceOne, destinyOne, 85, 1);
        double priceOne = callArray[1].calcPrice();

        //Case 2 - Provincial call (Time Band 1):
        PhoneNumber sourceTwo = new PhoneNumber(964, 123456);
        PhoneNumber destinyTwo = new PhoneNumber(972, 654321);
        callArray[2] = new Calls (2,sourceTwo, destinyTwo, 63, 1);
        double priceTwo = callArray[2].calcPrice();

        //Case 3 - Provincial call (Time Band 2):
        PhoneNumber sourceThree = new PhoneNumber (972, 123456);
        PhoneNumber destinyThree = new PhoneNumber (981, 987654);
        callArray[3] = new Calls (3, sourceThree, destinyThree, 34, 2);
        double priceThree = callArray[3].calcPrice();

        //Case 4 - Provincial call (Time Band 3):
        PhoneNumber sourceFour = new PhoneNumber (934, 123456);
        PhoneNumber destinyFour = new PhoneNumber (955, 854393);
        callArray[4] = new Calls (4, sourceFour, destinyFour, 26, 3);



        SwitchBoard exercise5 = new SwitchBoard(callArray);

        System.out.println("Printing each call separately: ");
        System.out.println("");
        exercise5.printCall(1);
        System.out.println("");
        exercise5.printCall(2);
        System.out.println("");
        exercise5.printCall(3);
        System.out.println("");
        exercise5.printCall(4);
        System.out.println("");

        System.out.println("Printing every call with one method: ");
        //Is there a way to know the last filled position of an array?
        System.out.println("");
        exercise5.printEveryCall(4);
    }
}

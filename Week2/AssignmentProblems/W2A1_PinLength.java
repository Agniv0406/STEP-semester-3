package Week2.AssignmentProblems;
public class W2A1_PinLength {

    static void checkPinLength(String pin) {

        if (pin.length() != 4) {

            System.out.println(
                "Invalid PIN — must be exactly 4 digits."
            );

        } else {

            System.out.println(
                "PIN length OK."
            );
        }
    }

    public static void main(String[] args) {

        checkPinLength("482");

        checkPinLength("4820");
    }
}
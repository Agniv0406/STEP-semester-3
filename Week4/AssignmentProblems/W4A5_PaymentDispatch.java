package Week4.AssignmentProblems;

class Payment {

    double lastCharged;

    void pay(double amount) {

        lastCharged = amount;

        System.out.println(
            "Paid (cash): Rs " +
            amount
        );
    }

    double getLastCharged() {

        return lastCharged;
    }
}

class CardPayment extends Payment {

    void payWithProcessingFee(
            double amount) {

        lastCharged =
            amount * 1.02;

        System.out.println(
            "Charged (card, incl. fee): Rs " +
            lastCharged
        );
    }
}

public class W4A5_PaymentDispatch {

    static void processTransaction(
            Payment payment,
            double amount) {

        if (payment instanceof CardPayment) {

            CardPayment card =
                (CardPayment) payment;

            card.payWithProcessingFee(
                amount
            );

        } else {

            payment.pay(amount);
        }
    }

    public static void main(String[] args) {

        Payment[] payments = {

            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {100,50,200,75,120};

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            processTransaction(
                payments[i],
                amounts[i]
            );

            totalCollected +=
                payments[i].getLastCharged();
        }

        System.out.println(
            "Total Collected: Rs " +
            totalCollected
        );
    }
}
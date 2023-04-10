package ment.introduction;

public class DiaDemo {
    public static void main(String[] args) {
        // Declare the number of sides for each die #1 and #2
        int dieSize1 = 6;
        int dieSize2 = 20;

        // Create two instances of Die class
        Die die1 = new Die(dieSize1);
        Die die2 = new Die(dieSize2);

        // Display the initial state of the dice.
        System.out.println("This simulates teh rolling of a " +
                            dieSize1 + " sides dice and a " +
                            dieSize2 + " sides die.");

        System.out.println("Initial value of the dice: ");
        System.out.println(die1.getValue() + " " + die2.getValue());

        // Roll the dice five times
        System.out.println("Rolling the dice 5 times");

        for (int i = 0; i < 5; i++) {
            die1.roll();
            die2.roll();

            // Display the values of the dice.
            System.out.println(die1.getValue() + " " + die2.getValue());
        }

    }
}

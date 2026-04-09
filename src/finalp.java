// user story  11 ask trainer yes or no
public static boolean askTraining(Scanner input) {

    boolean valid = false;
    boolean answer = false;

    while (!valid) {
        System.out.print("Do you want to calculate the training heart rates? (y/n): ");
        String userInput = input.nextLine();

        if (userInput.length() > 0) {
            char c = userInput.charAt(0);

            if (c == 'y' || c == 'Y') {
                answer = true;
                valid = true;
            } else if (c == 'n' || c == 'N') {
                answer = false;
                valid = true;
            } else {
                System.out.println("Error: enter y, Y, n, or N.");
            }
        } else {
            System.out.println("Error: enter y, Y, n, or N.");
        }
    }
    //test for a video 
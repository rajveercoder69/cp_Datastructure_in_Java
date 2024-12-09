import java.util.Scanner;

 class SnakeAndLadder {

    public static void playGame(int[][] board, int[] dieInputs) {
        int currentPosition = 1; // Start position
        int snakesEncountered = 0;
        int laddersEncountered = 0;

        for (int dieInput : dieInputs) {
            int nextPosition = currentPosition + dieInput;

            if (nextPosition <= 100) {
                int row = 10 - (nextPosition - 1) / 10;
                int col = (nextPosition - 1) % 10;

                if (board[row][col] == 0) {
                    currentPosition = nextPosition;
                } else if (board[row][col] < nextPosition) {
                    // Ladder
                    laddersEncountered++;
                    currentPosition = board[row][col];
                } else {
                    // Snake
                    snakesEncountered++;
                    currentPosition = board[row][col];
                }

                if (currentPosition == 100) {
                    System.out.println("Possible " + snakesEncountered + " " + laddersEncountered);
                    return;
                }
            }
        }

        System.out.println("Not possible " + snakesEncountered + " " + laddersEncountered + " " + currentPosition);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Snake and Ladder board
        int[][] board = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String token = scanner.next();
                if (token.equals("Start")) {
                    board[i][j] = 1;
                } else if (token.equals("End")) {
                    board[i][j] = 100;
                } else if (token.startsWith("S")) {
                    board[i][j] = Integer.parseInt(token.substring(2, token.length() - 1));
                } else if (token.startsWith("L")) {
                    board[i][j] = Integer.parseInt(token.substring(2, token.length() - 1));
                } else {
                    board[i][j] = Integer.parseInt(token);
                }
            }
        }

        // Input: Die inputs
        int[] dieInputs = new int[10];
        for (int i = 0; i < 10; i++) {
            dieInputs[i] = scanner.nextInt();
        }

        // Play the game and output the result
        playGame(board, dieInputs);
    }
}

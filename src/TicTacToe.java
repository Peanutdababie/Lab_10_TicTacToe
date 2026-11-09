public class TicTacToe {
    private static final int ROWS = 3;

    private static final int COLS = 3;

    private static String board [][] = new String[ROWS][COLS];

    private static void clearBoard(){
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                board[i][j] = "";
            }
        }
    }
    private static void display() {
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                System.out.println(board[i][j]);
            }
        }
    } // shows the Tic Tac Toe game used as part of the prompt for the users move choice…

    private static boolean isValidMove(int row, int col){
        boolean valid = false;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j].equals("")){
                    valid = true;
                }
            }
        }
        return valid;
    } // returns true if there is a space at the given proposed move coordinates which means it is a legal move.

    private static boolean isWin(String player) // checks to see if there is a win state on the current board for the specified player (X or O) This method in turn calls three additional methods that break down the 3 kinds of wins that are possible.
    {
        boolean win = false;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j].equalsIgnoreCase("x") || board[i][j].equalsIgnoreCase("o")){
                    win = true;
                }
            }
        }
        return win;
    }

    private static boolean isColWin(String player) // checks for a col win for specified player
    {
        boolean win = false;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j].equalsIgnoreCase("x") || board[i][j].equalsIgnoreCase("o")){
                    win = true;
                }
            }
        }
        return win;
    }

    private static boolean isRowWin(String player) // checks for a row win for the specified player
    {
        boolean win = false;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j].equalsIgnoreCase("x") || board[i][j].equalsIgnoreCase("o")){
                    win = true;
                }
            }
        }
        return win;
    }

    private static boolean isDiagnalWin(String player) // checks for a diagonal win for the specified player
    {
        boolean win = false;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j].equalsIgnoreCase("x") || board[i][j].equalsIgnoreCase("o")){
                    win = true;
                }
            }
        }
        return win;
    }

    private static boolean isTie() // checks for a tie condition: all spaces on the board are filled OR there is an X and an O in every win vector (i.e. all possible 8 wins are blocked by having both and X and an O in them.)
    {
        boolean win = false;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j].equalsIgnoreCase("x") || board[i][j].equalsIgnoreCase("o")){
                    win = true;
                }
            }
        }
        return win;
    }


    public static void main() {
        //int rowMove = SafeInput.getRangedInt(…);
        //int colMove = SafeInput.getRangedInt(…);


    }
}

import java.util.Scanner;
public class in2D {
    static int z = 0;
    static Scanner ggg = new Scanner(System.in);
    static boolean win = false;
    static char[][] main_part ={
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};
    public static void main(String[] args) {
        gamePanel();
    }
    // data reset
    private static void reset(){
        main_part = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
    }
    private static void gamePanel(){
        System.out.println("============================================");
        System.out.println("1. Start game ");
        System.out.println("2. ХУЙ ЗНАЕТ ЧТО ТУТ БУДЕТ ");
        System.out.println("3. Information ");
        System.out.println("0. Exit");
        System.out.println("============================================");
        System.out.print("FUNCTION: ");
        int a = ggg.nextInt();
        if(a == 1){
            reset();
            start();
        }
        else if(a == 3) information();
        else System.exit(0);
    }
    private static void start(){
        win = false;
        square(main_part);
        int count = 0;
        for(;count<9;count++) {
            if (count % 2 == 0) square(x_part());
            else square(o_part());
            check_win();
            if(win) break;
        }
        if(!win) System.out.println("DRAW");
        gamePanel();
    }
    private static void information(){
        System.out.println("");
        System.out.println("1. Адиль гей");
        System.out.println("2. Муха черт");
        System.out.println("3. Альха негр");
        System.out.println("");
        System.out.println("0. Exit");
        System.out.println("1. Back");
        System.out.println("FUNCTION: ");
        int a = ggg.nextInt();
        if(a == 0) System.exit(0);
        else gamePanel();
    }
    private static char[][] x_part(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a row (1, 2, or 3) for player X: ");
        int y = scan.nextInt();
        System.out.print("Enter a column (1, 2, or 3) for player X: ");
        int x = scan.nextInt();
        if(y < 1 || y > 3 || x < 1 || x > 3 || main_part[y-1][x-1] == 'X' || main_part[y-1][x-1] == 'O') return x_part();
        main_part[y-1][x-1] = 'X';
        return main_part;
    }
    private static char[][] o_part(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a row (1, 2, or 3) for player O: ");
        int y = scan.nextInt();
        System.out.print("Enter a column (1, 2, or 3) for player O: ");
        int x = scan.nextInt();
        if(y < 1 || y > 3 || x < 1 || x > 3 ||main_part[y-1][x-1] == 'X' || main_part[y-1][x-1] == 'O') return o_part();
        main_part[y-1][x-1] = 'O';
        return main_part;
    }
    private static void square(char[][] main_part){
        System.out.println(" ============= ");
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(" | ");
                System.out.print(main_part[y][x]);
            }
            System.out.println(" |");
            System.out.println(" ============= ");
        }
    }
    private static void check_win(){
        if(main_part[0][0] == 'X' && main_part[0][0] == main_part[0][1] && main_part[0][0] == main_part[0][2]){
            System.out.println("X win");
            win = true;
        }
        else if(main_part[1][0] == 'X' && main_part[1][0] == main_part[1][1] && main_part[1][0] == main_part[1][2]){
            System.out.println("XXX win");
            win = true;
        }
        else if(main_part[2][0] == 'X' && main_part[2][0] == main_part[2][1] && main_part[2][0] == main_part[2][2]){
            System.out.println("XXX win");
            win = true;
        }
        else if(main_part[0][0] == 'X' && main_part[0][0] == main_part[1][0] && main_part[0][0] == main_part[2][0]){
            System.out.println("XXX win");
            win = true;
        }
        else if(main_part[0][1] == 'X' && main_part[0][1] == main_part[1][1] && main_part[0][1] == main_part[2][1]){
            System.out.println("XXX win");
            win = true;
        }
        else if(main_part[0][2] == 'X' && main_part[0][2] == main_part[1][2] && main_part[0][2] == main_part[2][2]){
            System.out.println("XXX win");
            win = true;
        }
        else if(main_part[0][0] == 'X' && main_part[0][0] == main_part[1][1] && main_part[0][0] == main_part[2][2]){
            System.out.println("XXX win");
            win = true;
        }
        else if(main_part[2][0] == 'X' && main_part[2][0] == main_part[1][1] && main_part[2][0] == main_part[0][2]){
            System.out.println("X win");
            win = true;
        }
        else if(main_part[0][0] == 'O' && main_part[0][0] == main_part[0][1] && main_part[0][0] == main_part[0][2]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[1][0] == 'O' && main_part[1][0] == main_part[1][1] && main_part[1][0] == main_part[1][2]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[2][0] == 'O' && main_part[2][0] == main_part[2][1] && main_part[2][0] == main_part[2][2]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[0][0] == 'O' && main_part[0][0] == main_part[1][0] && main_part[0][0] == main_part[2][0]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[0][1] == 'O' && main_part[0][1] == main_part[1][1] && main_part[0][1] == main_part[2][1]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[0][2] == 'O' && main_part[0][2] == main_part[1][2] && main_part[0][2] == main_part[2][2]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[0][0] == 'O' && main_part[0][0] == main_part[1][1] && main_part[0][0] == main_part[2][2]){
            System.out.println("O win");
            win = true;
        }
        else if(main_part[2][0] == 'O' && main_part[2][0] == main_part[1][1] && main_part[2][0] == main_part[0][2]){
            System.out.println("O win");
            win = true;
        }
    }
}
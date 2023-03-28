import java.util.Scanner;
public class main {

    
    // public static void warriorLoop(Warrior userclass) {
    //     System.out.println(userclass.firstAbility());
    //     sharedinit();
    //     Boolean run = false;
    //     Interface gameInterface = new Interface();

    //     while (run == true) {
    //         //UserInput type to handle userinput

    //         String userInput = gameInput.nextLine();
    //     }
    // }
    // public static void mageLoop(Mage userclass) {
    //     System.out.println(userclass);
    //     sharedinit();
    // }

    public static void gameLoop(Humanoid user) {

    }
    public static void sharedinit() {
        Warrior beginner_enemy1 = new Warrior("Brad", 50, 50, 1);
        Warrior beginner_enemy2 = new Warrior("Todd", 60, 40, 1);

        Mage beginner_enemy3 = new Mage("Stephen",80,30,1);

        //Need interface for attacks
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        //clears out /n from input
        scanner.nextLine();
        
        player player = new player(name);

        System.out.println("Okay "+name+" enter your class!");
        String userClass = scanner.nextLine();
            // if (userClass.trim() ==)
        scanner.close();
        //Uses dynamic polymorphism
        Humanoid humanoid = null;
        if (userClass.trim().toLowerCase().equals("warrior")) {
            humanoid = new Warrior(name);
        }
        else if (userClass.trim().toLowerCase().equals("mage")) {
            humanoid = new Mage(name);            
        }
        gameLoop(humanoid);
    }



}
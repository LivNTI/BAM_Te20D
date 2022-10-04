import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inLine = new Scanner(System.in);

        Friend aFriend = new Friend();
        Friend myFriend = new Friend("Filip");
        System.out.println("my friend is called " + myFriend.getName());
        System.out.println("What is your friends name: ");
        String newName = inLine.next();

        aFriend.setName(newName);
        System.out.println("my old friend is now called " + aFriend.getName());
        newName = inLine.next();
        System.out.println();
    }
}
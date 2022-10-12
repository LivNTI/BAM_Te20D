public class Player {
    //instance variables
    private String name = "A friend";
    private int hp = 100;
    private boolean friend;

    //Constructors
    public Player() {
    }

    public Player(String name, boolean friend) {

        this.name = name;
        this.friend = friend;
    }

    //Methods
    public void hit(int damage) {
        this.hp = this.hp - damage;
    }


    // Getters Setters
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

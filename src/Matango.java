public class Matango {
    private int hp;
    private final int LEVEL = 10;
    private char suffix;

    public void run() {
        System.out.println("おばけキノコ" + this.suffix + "は、逃げ出した！");
    }

    public int setHp() {
        return this.hp;
    }

    public String getName() {
        return "おはけキノコ" + this.suffix;
    }

}

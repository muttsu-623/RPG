public class Matango {
    int hp = 50;
    private char suffix;

    public int setHp() {
        return this.hp;
    }

    public String getName() {
        return "おはけキノコ" + this.suffix;
    }

    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "の攻撃!");
        System.out.println(h.getName() + "に、10のダメージ");
        h.setHp(h.getHp() - 10);
    }

    public void run() {
        System.out.println("おばけキノコ" + this.suffix + "は、逃げ出した！");
    }

    public Matango(char suffix) {
        this.suffix = suffix;
    }

}

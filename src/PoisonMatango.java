public class PoisonMatango extends Matango {
    private int poisonPoint = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public int attack(Hero h) {
        super.attack();
        if (poisonPoint < 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.getHp() / 5;
            System.out.println(damage + "のダメージ！");
            h.setHp(h.getHp() - damage);
            this.poisonPoint--;
        }
    }
}

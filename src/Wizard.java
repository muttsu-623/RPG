public class Wizard {
    private String name;
    private int hp;

    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(h.name + "のHPは10回復した！");
    }
}

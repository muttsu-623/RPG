public class Wizard {
    private String name;
    private int hp;

    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(h.getName() + "のHPは10回復した！");
    }

    public String getName() {
        return this.name;
    }

    public String getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}

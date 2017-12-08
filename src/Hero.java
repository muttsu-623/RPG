public class Hero {

    // フィールド
    private String name;
    private int hp;
    private static int money;

    //getter & setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public static void setRandomMoney() {
        Hero.money = (int) (Math.random()*1000);
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った。");
        System.out.println("HPが" + sec + "ポイント回復した。");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げた！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは、" + this.hp + "でした。");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.setHp() -= 5;
        System.out.println(m.getName() + "は5のダメージを受けた！");
    }

    // Heroクラスのインスタンスが生成された時に、自動的に読み込む部分
    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    Hero() {
        this("ダミー");
    }

}

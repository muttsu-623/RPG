public class Main {
    public static void main(String[] args) {

        // Heroクラスのhを作成
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;

        // Heroクラスのh2を作成し、フィールドに値を代入
        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 150;

        // Wizardクラスのwを作成し、フィールドに値を代入
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 100;
    }
}

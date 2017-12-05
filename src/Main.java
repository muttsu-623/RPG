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

        // Matangoクラスのm1を作成し、フィールドに値を代入
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        // Matangoクラスのm2を作成し、フィールドに値を代入
        Matango m2 = new Matango();
        m2.hp = 40;
        m2.suffix = 'B';

        //　冒険の始まり
        h.slip();
        m1.run();
        m2.run();
        h.run();
    }

}

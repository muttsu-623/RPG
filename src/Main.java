public class Main {
    public static void main(String[] args) {

        // Heroクラスのhを作成
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = "100";

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

public class Main {
    public static void main(String[] args) {

        // Heroクラスのhを作成
        Hero h1 = new Hero();
        h1.getName() = "ミナト";
        h1.setHp(100);

        // Heroクラスのh2を作成し、フィールドに値を代入
        Hero h2 = new Hero();
        h2.getName() = "アサカ";
        h2.setHp(50);

        // Wizardクラスのwを作成し、フィールドに値を代入
        Wizard w = new Wizard();
        w.getName() = "スガワラ";
        w.setHp(100);

        // Heroクラスのmoneyをランダムに設定.
        Hero.setRandomMoney();
        System.out.println("Heroの所持金は、" + Hero.getMoney() + "円に設定されました。");

    }
}

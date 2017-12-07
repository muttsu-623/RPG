public class SuperHero extends Hero {
    private boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println(this.getName() + "は、飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println(this.getName() + "は、着地した。");
    }
    public void run() {
        System.out.println(this.getName() + "は、撤退した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは、" + this.getName() + "でした。");
    }
}

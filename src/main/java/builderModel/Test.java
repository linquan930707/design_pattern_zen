package builderModel;

/**
 * 建造者模式 也叫生成器模式
 * 定义：将一个复杂的对象的构建过程与它的表示分离，使得同样的构建过程可以创造不同的表示；
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.getBenzModelOne().run();
        director.getBMWModelOne().run();
        director.getBenzModelTwo().run();
        director.getBMWModelTwo().run();
    }
}

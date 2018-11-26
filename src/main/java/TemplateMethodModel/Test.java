package TemplateMethodModel;

import java.util.ArrayList;

/**
 * 模板方式工厂
 * 实现类相同的方法封装在父类抽象方法，子类实现具体的不同实现。
 * 定义：定义一个算法的框架，而将一些步骤延迟到子类中，使的子类可以不改变算法的结构即可重定义该算法的某些步骤；基本方法由子类实现供模板方法调用，模板方法可以是一个或多个，
 * 一般是父类的具体实现，或方法，或框架，实现对基本方法的调度，完成固定的业务逻辑
 *
 * 使用场景：可以用来父类调用子类的实现，一般在框架中有需要拓展方法，可以继承抽象类，然后覆盖 protected 方法，最后执行一个execute()方法，完成拓展，是一种容易拓展的模式
 */
public class Test {
    public static void main(String[] args) {
        CarModel BModel = new BenzModel();
        ArrayList<String>lst = new ArrayList<>();
        lst.add("start");
        lst.add("engine boom");
        lst.add("alarm");
        lst.add("stop");
        BModel.setSequence(lst);
        BModel.run();

    }
}

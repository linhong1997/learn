package com.cbsa.lh.learn.designPrinciples.SingleResponsibilityPrinciple;

/**
 * @Author: linhong
 * @Date: 2021/1/26 09:26
 * @Description:单一职责原则：一个类只负责一项职责。
 */
//我们用动物生活来做测试
class Animal{
//    public void breathe(String animal){
//        System.out.println(animal+"生活在陆地上");
//    }
public void breathe(String animal){
    System.out.println(animal+"生活在陆地上");
}

    public void breathe2(String animal){
        System.out.println(animal+"生活在水中");
    }
}
public class Client{
    public static void main(String[] args){
//        Animal animal = new Animal();
//        animal.breathe("羊");
//        animal.breathe("牛");
//        animal.breathe("猪");
//        Terrestrial terrestrial = new Terrestrial();
//        terrestrial.breathe("羊");
//        terrestrial.breathe("牛");
//        terrestrial.breathe("猪");
//
//        Aquatic aquatic = new Aquatic();
//        aquatic.breathe("鱼");
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe2("鱼");
    }
}

class Terrestrial{
    public void breathe(String animal){
        System.out.println(animal+"生活在陆地上");
    }
}
class Aquatic{
    public void breathe(String animal){
        System.out.println(animal+"生活在水里");
    }
}

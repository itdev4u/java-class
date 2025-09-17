package reminder.ch12.ex03;

import reminder.ch12.Fruit;
import reminder.ch12.FruitBox;

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for(Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

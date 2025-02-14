package ch07.polyargument2;

/**
 * 고객 : 물건을 사는 사람
 */
public class Buyer {
    int money = 1000;   //소유금액
    int bonusPoint = 0; //보너스 점수

    Product[] item = new Product[10];   //구매한 제품을 저장하는 배열
    int i = 0;

    void buy(Product p) {
        if(money  < p.price) {
            System.out.println("잔액이 부족해서 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i = 0; i < item.length; i++) {
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

}

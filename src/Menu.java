import java.util.Scanner;

public class Menu {
    public void showMenu(){

            System.out.println("KFC Burger 를 이용해주셔서 감사합니다.");
            System.out.println("아래 메뉴판을 참고해서 메뉴를 골라서 입력해주세요.");
            System.out.println("/n");

            System.out.println("[" + "KFC MENU" + "]");
            // 메뉴를 나오게 하는 화면.
            System.out.println("1. Burgers "    +   "|"  + "각종 치킨 패티 및 비프가 들어간 프리미엄 버거");
            System.out.println("2. Chicken " + "|" +  "육즙 가득한 통다리살과 KFC 만의 비법으로 만들어진 치킨 ");
            System.out.println("3. Drinks"    +   "|"  + "치킨 및 햄버거와 같이 곁들일 수 있는 음료");
            System.out.println("4. SideMenu "    +   "|"  + "버거 및 치킨과 함께 즐길 수 있는 사이드 메뉴");

            System.out.println();


            System.out.println("[" + "ORDER MENU" + "]");
            System.out.println("5. Order "    +   "|"  + "장바구니에 담긴 메뉴를 확인 후 주문합니다.");
            System.out.println("6. Cancel "    +   "|"  + "진행중인 주문을 취소합니다.");

        }


    }


import java.io.ObjectInputStream;
import java.util.Scanner;

import static com.sun.beans.introspect.ClassInfo.clear;
import static javax.security.auth.callback.ConfirmationCallback.YES;

public class Order {
    private ObjectInputStream.ValidationList product;

    // 주문 취소 메서드

    public void cancelOrder(int input){
        if(input == YES){
            System.out.println("진행하던 주문을 취소되었습니다.");
            showMenu();
        }
    }


    // 주문 완료 메서드
    public void confirmOrder(int input, int watingNumber ) throws InterruptedException {
        if (input == 1) {
            System.out.println("주문이 완료되었습니다! \n");
            System.out.println("대기번호는" + "[" + watingNumber + "]" + "번 입니다.\n");
            clear();
            Thread.sleep(3000);

        }
    }


    // 장바구니 출력하는 메서드.
    private static void TotalCart(Product product){
        System.out.println("주문하신"  + product.getName() + "을 추가하시겠습니까?");

        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();

        if( input.equals("확인")){
            Object order;
            order.addToCart(product);
                showMenu();
        } else if (input.equals("취소")) {
                showMenu();
        }

    }

    // 장바구니 총 합을 구함.
    protected int calculateTotalPrice(){
        int total = 0;
        for(Product product : items){
            totalPrice += product.getPrice();
        }
    }

        return totalPrice;



}

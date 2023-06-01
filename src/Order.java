import static javax.security.auth.callback.ConfirmationCallback.YES;

public class Order {
    // 주문 취소 메서드

    public void cancelOrder(int inputNumber){
        if(inputNumber == 6){
            System.out.println("진행하던 주문을 취소하시겠습니까?");
            System.out.println("1. 확인" + '\t' + "2. 취소");
        }
    }


    // 주문 완료 메서드
    public void confirmOrder(int input, int watingNumber ){
        if(input ==1){
            System.out.println("주문이 완료되었습니다! \n");
            System.out.println("대기번호는" + "[" + watingNumber +"]" + "번 입니다.\n");
            System.out.println("("+ "3초후 메뉴판으로 돌아갑니다." + ")");


        }
    }

    // 장바구니 출력하는 메서드.
    public void TotalCart(){
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("[" + "Orders" + "]");
        // 넘어온 값들 출력.
        System.out.println("[" + "Total" + "]");



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

public class Main {
    public static void main(String[] args){
        double price = 100.00;

        if(!VATReverseCharging.getInstance().isReverseChargeApplicable("DE")){
            price = price*1.21;
        }
        System.out.println("Prijs: "+price);
    }
}

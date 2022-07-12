public class Main {
    public static void main(String[] args) {

        int price = 100; // стоимость одного билета
        int bonus = 20; // количество рублей для получения одной мили
        int miles = price / bonus; // количество бонусных миль

        System.out.println("количество ваших бонусных миль - " + (miles));
    
    }
}

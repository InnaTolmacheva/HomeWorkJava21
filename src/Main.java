public class Main {
    public static void main(String[] args) {
        //входные данные
        int price = 5687; // цена билета
        int amount = 20; // количество рублей, за которые начисляются милли

        // рассчитаем колличество бонусных милль
        int mile = price / amount;

        System.out.println("Поздравляем! Вам начислено " + mile + " бонусных милль");
    }
}

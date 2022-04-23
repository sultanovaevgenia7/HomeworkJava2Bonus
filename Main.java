public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        double ticketPrice = 1000.0;
        System.out.println("Цена вашего билета " + (long) ticketPrice + " рублей " + (long) (ticketPrice - (long) ticketPrice) * 100 + " копеек ");

        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли
        long bonusKoeficients = 20;
        long bonusMiles = (long) (ticketPrice / bonusKoeficients);
        System.out.println("Ваши бонусные мили " + bonusMiles);

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
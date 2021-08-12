public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int topUp = 10000;
        int total = amount + topUp;
        boolean giveABonus = topUp > 1000;

        int bonus;
        if (giveABonus) {
            bonus = total / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(total);
    }

}

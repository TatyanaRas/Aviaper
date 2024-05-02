//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676;// стоимость билета
        int bonusMile = 20;// бонусы за одну милю
        int numbMilTicket = ticketPrice / bonusMile * 1;
        System.out.println(numbMilTicket);
    }
}
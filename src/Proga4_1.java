/**
 * Created by Александр on 24.02.2015.
 */
public class Proga4_1 {
    public static void main(String[] args) {
        String[] Names = new String[5];
        Names[0] = "Вася";
        Names[1] = "Саня";
        Names[2] = "Гриша";
        Names[3] = "Петя";
        Names[4] = "Коля";

        String[] Greetings = new String[5];
        for (int i = 0; i < 5; i++) {
            Greetings[i] = "Привет, "+Names[i];
            System.out.println(Greetings[i]);
        }
    }
}

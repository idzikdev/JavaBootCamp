package Metody;

/**
 * Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
 sześcianem pewnej liczby naturalnej.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie9 {
    public static void main(String[] args) {
        if (isCube(27))
            System.out.println("TAK");
        else
            System.out.println("NIE");

    }

    public static boolean isCube(int number) {
        boolean tak = false;
        for (int i = 1; i < number; i++) {
            if (i * i * i ==number) {
                tak = true;
                break;
            }
        }
        if (tak)
            return true;
        return false;
    }
}

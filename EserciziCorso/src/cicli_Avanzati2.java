public class cicli_Avanzati2 {
    public static void main(String args[]) {
        int number = 10;
        result(number);
    }

    public static void result(int number) {
        for (int i = 0; i <= number; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

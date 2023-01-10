public class App {
    public static void main(String[] args) throws Exception {
        int number = 2;
        System.out.println("Tabela de multiplicação de " + number);
        for(int i = 0; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + number*i);
        };
    }
}
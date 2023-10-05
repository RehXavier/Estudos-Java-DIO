public class EstruturaCondicionalComposta {
    public static void main(String[] args) {
        double saldo = 50.00;
        double retirada = 25.00;

        if (retirada > saldo) {
            saldo = saldo - retirada;
            System.out.println(saldo);
            System.out.println("Saque realizado com sucesso"); 
        } else System.out.println("Saldo Insulficiente");
}
        }
    


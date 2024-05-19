public class Conta {
    
    String titular;
    int numeroConta;
    int agencia;
    double saldo;

    public Conta(String titular, int agencia, int numeroConta, double saldo){
        
        // Recebe as informações para criar a conta
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Conta() {
        //TODO Auto-generated constructor stub
    }

    // Métodos para obter os dados da conta
    public String getTitular(){
        return titular;
    }

    public int getAgencia(){
        return agencia;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    // Método para exibir os dados da conta
    public void ExibirDadosDaConta(){
        System.out.println("Dados da Conta Bancária");
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo Disponivel: " + saldo);
    }
    
}

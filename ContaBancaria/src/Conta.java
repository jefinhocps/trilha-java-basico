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
        System.out.println("*******************************************\n");
        System.out.println("Dados da Conta Bancária");
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo Disponivel: " + saldo);
    }

    // Método para sacar
    public void RealizarSaque(double valorSolicitado){
        saldo = getSaldo();

        System.out.println("Valor de saque Solicitado: " + valorSolicitado);

        if (valorSolicitado > saldo) {
            System.out.println("O valor solicitado excede o saldo disponivel.");
        }else{
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso: " + valorSolicitado);
            System.out.println("Saldo atualizado: " + saldo);
        }
    }
    
}

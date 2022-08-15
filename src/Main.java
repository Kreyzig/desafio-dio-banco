
public class Main {

	public static void main(String[] args) {
		
		Cliente vanilson = new Cliente();
		vanilson.setNome("Vanilson");
		
		Conta cc = new ContaCorrente(vanilson);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(vanilson);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente jess = new Cliente();
		jess.setNome("Jéssica");
		Conta cc = new ContaCorrente(jess);
		Conta poupanca = new ContaPoupanca(jess);
		
		cc.extrato();
		poupanca.extrato();
		
	}

}

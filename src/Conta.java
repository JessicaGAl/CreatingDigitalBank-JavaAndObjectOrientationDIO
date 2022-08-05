
public abstract class Conta implements iConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL= 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	public double getSaldo() {
		return saldo;
	}



	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}
    

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}


	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}


	@Override
	public void pix(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirinfos() {
		System.out.println(String.format("Títula: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}



}

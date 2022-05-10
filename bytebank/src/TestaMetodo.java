public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaSulamy = new Conta(6646,969060);
		contaDaSulamy.deposita(100);
		contaDaSulamy.deposita(50);
		System.out.println(contaDaSulamy.getSaldo());

		boolean conseguiuRetirar = contaDaSulamy.saca(20);
		System.out.println(contaDaSulamy.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(6644,969063);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaSulamy);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDaSulamy.getSaldo());
	}

}
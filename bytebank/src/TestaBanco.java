public class TestaBanco {
	public static void main(String[] args) {
		Cliente sulamy = new Cliente();
		sulamy.setNome("Sulamy Lobato");
		sulamy.setCpf("222.222.222.-22");
		sulamy.setProfissao("desenvolvedora java");

		Conta contaDaSulamy = new Conta(6646,969060);
		contaDaSulamy.deposita(100);

		contaDaSulamy.setTitular(sulamy);
		System.out.println(contaDaSulamy.getTitular().getNome());
		System.out.println(contaDaSulamy.getTitular());

	}
}
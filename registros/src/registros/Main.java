package registros;

public class Main {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("vitor");
		a1.setRa("324324234234");
		
		Endereco e1 = new Endereco();
		e1.setCep("456788657");
		e1.setLogradouro("quadra 01");
		e1.setNumero(3);
		
		a1.setEndereco(e1);
		
		System.out.println(a1.getNome()+
				"\n-" +
				a1.getRa()+
				"\n-" +
				a1.getEndereco().getLogradouro());
		
	}

}

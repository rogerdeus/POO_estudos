package registros;

public class Main2 {
	public static void main(String[] args) {
		
		Endereco e2 = new Endereco();
		
		e2.setCep("345678");
		e2.setLogradouro("quadra3");
		e2.setNumero(3);
		
		String nome = "Vitor";
		
		Aluno a2 = new Aluno(nome, e2);
		
		System.err.println(a2.getNome());
		System.out.println(a2.getEndereco().getLogradouro());
		System.out.println(a2.getRa());
	}

}

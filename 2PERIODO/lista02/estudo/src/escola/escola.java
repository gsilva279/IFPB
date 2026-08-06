package escola;

public class escola {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("João");
		a.setNota1(10);
		a.setNota2(1);
		a.setNota3(7);
		
		System.out.println(a.media());
		
		Professor p = new Professor();
		if (p.resultado(a) == true) 
		    System.out.println(a.getNome() + " foi aprovado");
		else
		    System.out.println(a.getNome() + " não foi aprovado");

	}
}

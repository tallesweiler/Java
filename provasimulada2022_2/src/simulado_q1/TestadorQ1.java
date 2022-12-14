package simulado_q1;

import java.util.Date;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem média de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		UserBase userBase = new UserBase();

		User talles = new User("tallescw", null);
		User joao = new User("jvmoraiscb", null);
		User celso = new User("celso", new Date());

		userBase.addUser(talles);
		userBase.addUser(joao);
		userBase.addUser(celso);

		talles.addTweet("nao ironicamente");
		talles.addTweet("hj n é um bom dia");
		talles.addTweet("quem sabe amanha");

		celso.addTweet("nao ironicamente");
		joao.addTweet("hj n é um bom dia");
		joao.addTweet("quem sabe amanha");

		System.out.printf("%.1f%% | %.2f\n", userBase.calculaPorcentagemVerificados()*100, userBase.calculaTamanhoMedioDosTweets());

	}

}

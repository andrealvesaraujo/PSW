package meuRepositorio;

/**
 * Classe para exemplificar o uso de git
 * @author Aluno
 * @version 5.0
 * @since 2.0
 */
public class helloGit {
	
	/**
	 * Valor do texto hello git
	 */
	private String txt="hello git";
	
	/**
	 * Metodo que imprime hello git
	 * 
	 * @param args parametros de linha de comando da classe
	 */
	public static void main(String[] args){
		System.out.println(helloGit());
	}
	
	/**
	 * Metodo que retorna string
	 * @return string com o texto
	 */
	public static String helloGit(){
		return "Hello Git";
	}
}

package variaveis;

public class TipoString {
	
	public static void main(String[] args) {
		
		String email = "GIovannaCarpi@Hotmail.Com.br";
		
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Quantidade Caracteres: " + email.length());
		System.out.println("� igual: " + email.equals("giovannacarpii@hotmail.com"));
		
		
		if(email.contains("@")==true) {
			System.out.println("Usu�rio: "+ email.substring(0,email.indexOf("@")));
		}
		System.out.println("At� Logo");

	}

}

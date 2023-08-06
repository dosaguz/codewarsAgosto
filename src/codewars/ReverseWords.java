package codewars;

public class ReverseWords {
	  public static String reverseWords(final String original)
	  {
	    // Have at it
		  String salida = "";
		  char c;
		  String[] palabras =original.split(" ");

  if (palabras.length == 0) {
    return original;
  }
		  for (String p : palabras) {
			  for (int i=p.length()-1;i>=0;i--) {
				 c= p.charAt(i);
				 salida=salida+c;
			 }
			  salida=salida+" ";
			 }
		  return salida.substring(0, salida.length() - 1);	 
	  }
	  public static void main(String[] args) {
		System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
	}
}
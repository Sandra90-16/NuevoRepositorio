public class Palindromo {

	public static boolean funcion(String a) {

		//modificacion victor 15 feb
		//modificacion victor  feb 12 10.20
		boolean res = true;

		int i = 0; //1

		if(a.length() % 2 == 0) { //2

			while(i<a.length()/2 && res) { //3 y //4

				res = a.charAt(i) == a.charAt((a.length()-1)-i); //5

				i++;

			}

		}

		else {

			while(i<(a.length()/2)+1 && res) { //6

				res = a.charAt(i) == a.charAt((a.length()-1)-i); //7

				i++;

			}

		}

		return res;//8

	}
	
	public static void main(String[] args) {
		System.out.println("Es un palindromo " + funcion("dabale arroz a la zorra el abad"));
	}
	//modificacion 12 feb 10:04

}



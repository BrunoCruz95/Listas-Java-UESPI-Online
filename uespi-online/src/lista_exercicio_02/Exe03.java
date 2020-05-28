package lista_exercicio_02;

public class Exe03 {
	public static void main(String[] args) {
		
		int[] vetor1 = {1,2,3,4,5};
		int[] vetor2 = {7,1,2,9,3};
		int[] vetor3 = new int[10];
		
		System.out.print("Vetor 3: [");
		
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				vetor3[i] = vetor1[i];
			}
			if(i > 4) {
				vetor3[i] = vetor2[i-5];
			}
			
			System.out.print(vetor3[i]);
			if(i < 9) {
				System.out.print(", ");
			}
			if(i == 9) {
				System.out.print("]");
			}
		}
	}
}

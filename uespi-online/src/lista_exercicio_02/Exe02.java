package lista_exercicio_02;

public class Exe02 {
	public static void main(String[] args) {
		
		int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
		int[] vetor2 = {7,1,2,9,3,8,2,6,2,3};
		int[] vetor3 = new int[10];
		
		System.out.print("Vetor 3: [");
		
		for(int i = 0; i < 10; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			
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

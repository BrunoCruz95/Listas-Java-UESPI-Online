package lista_exercicio_02;

public class Exe01 {
	public static void main(String[] args) {
		
		int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
		int[] vetor2 = new int[10];
		
		System.out.print("Vetor 2: [");
		
		for(int i =0;i < 10; i++) {
			vetor2[i] = vetor1[i];
			System.out.print(vetor2[i]);
			if(i < 9) {
				System.out.print(", ");
			}
			if(i == 9) {
				System.out.print("]");
			}
		}
	}
}

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> randomList = new ArrayList<Integer>(); //arraylist
		int number;
		
		for(int i = 1; i <= 50;) {
			number = (int)(Math.random() * 51);// preencher com numero de 0 50
			if(!randomList.contains(number) && number != 0) {
				randomList.add(number);
				i++;
			}
		}
		System.out.println(randomList);// imprimindo a lista aleatoria
		buscaLinear(40, randomList);// buscando o numero 40 na lista aleatoria e encontrando a posicao

		bubbleSort(randomList); //ordenando lista com funcao bubbleSort
		System.out.println(randomList); //mostrando a lista ordenada
	}

	private static void buscaLinear(int i, ArrayList<Integer> randomList) {
		int iteracoes = 1;

		for (Integer num : randomList) {
			if (num == i) {
				System.out.println("Encontrei o numero 40 apos " + iteracoes + " iteracoes");
				break;
			} else iteracoes++;
		}
	}

	private static void bubbleSort(ArrayList<Integer> randomList){
		for(int count = 0; count < randomList.size() - 1; count++) {
			for(int j = 0; j < randomList.size() - 1 - count; j++) {
				if(randomList.get(j) > randomList.get(j + 1)) {
					int aux = randomList.get(j);
					randomList.set(j, randomList.get(j+1));
					randomList.set(j + 1, aux);
				}
			}
		}
	}
}

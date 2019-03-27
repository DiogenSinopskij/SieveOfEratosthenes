/*
  "Решето Ератосфена".
*/
public class SieveOfEratosthenes{
	public static void main(String args[]){
		/*
		  N - диапозон значений.
		*/
		int N = 100;		
		boolean Prime[] = new boolean[N];
		


		/*
		  Заполняем массив истинным значением.
		*/		
		for (int i = 0; i < N; i++)
			Prime[i] = true;
		

		/*
		  Реализация самого алгоритма.
		*/
		for (int i = 2; i < N; i++){
			for (int j = i * i; j < N; j+=i){
				Prime[j] = false;			
			}
		}


		/*
		  Выводим все значение int i если Prime[i] == true.
		*/
		for (int i = 2; i < N; i++){
			if(Prime[i])
				System.out.println(i);
		}
		/*
		  Получаем все простые числа.
		*/
					
	}
}

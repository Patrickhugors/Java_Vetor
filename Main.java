import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int maior = 0;
    int menor = 0;
    
    Scanner tam = new Scanner(System.in);
    int x;
    System.out.print("Digite o tamanho desejado do vetor: ");
      x = tam.nextInt();

    Scanner leitor = new Scanner(System.in);
    int v[] = new int[x];

    for(int i = 0; i < v.length; i++) {
      System.out.print("Digite o valor do Vetor [" + i + "]: ");
      v[i] = leitor.nextInt();
    }
    
    for( int i = 0; i < v.length; i++) {

    }
    for (int j = 0; j < v.length; j ++){
      if(v[j] > maior){
        maior = v[j];
      }else if (v[j] < menor){
        menor = v[j];
      }
    }
    System.out.println("O valor da maior diferença entre dois elementos distintos é de " + dif(v));

    System.out.println("O vetor está ordenado em ordem crescente? " + ordem(v));
    
  }
  
  public static boolean ordem(int v[]) {
    for (int i = 1; i < v.length;i++){
      if (v[i - 1] > v[i]){
        return false;
      }       
    }
    return true;        
  }
  
  public static int dif(int v[]) {
    int maior = 0;
    int menor = 0;
    for (int i = 0; i < v.length; i++){
      maior = v[i];
      menor = v[i];
    }
    for (int j = 0; j < v.length; j ++){
      if(v[j] > maior){
         maior = v[j];
      }else if (v[j] < menor){
        menor = v[j];
      }
    }
    int soma = maior - menor;
    return soma;
  }
}
package lista5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matri = new int[6][3];
        int i,j ;
        int maior=0;
        int menor=0;
        int linha =0, coluna=0;
        int linha2 =0, coluna2=0;

        for ( i=0; i<6; i++){
            for ( j = 0 ; j<3; j++){
                System.out.println("Escolha um numero da matriz  " + i + " na coluna " + j);
                matri[i][j] = sc.nextInt();

    }

}


        for (i=0; i<6; i++){
            for (j = 0 ; j<3; j++){
                System.out.print(matri[i][j]+ " ");

            }
            System.out.println();
        }


        for (i=0; i<6; i++){
            for (j = 0 ; j<3; j++){

               if (matri[i][j] > maior){
                   maior = matri[i][j];
                   linha2 = i;
                   coluna2 = j;

               } else if (matri[i][j] <= menor) {
                   menor = matri[i][j];
                   linha = i;
                   coluna = j;

               }
            }
        }

            System.out.println("O maior elemento da matriz é: "+  maior + " na liha "+ linha2+ " coluna "+ coluna2);
          System.out.println("O menor elemento da matriz é: " + menor + " na linha " + linha + " coluna " + coluna);
    }
}

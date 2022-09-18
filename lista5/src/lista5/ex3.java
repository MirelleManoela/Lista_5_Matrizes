package lista5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matri = new int[5][5];
        int i,j;
        double soma = 0, media=0;

        for ( i=0; i<5; i++){
            for ( j = 0 ; j<5; j++){
                System.out.println("Escolha um numero da matriz  " + i + " na coluna " + j);
                matri[i][j] = sc.nextInt();

            }
        }

        for (i=0; i<5; i++){
            for (j = 0 ; j<5; j++){
                System.out.print(matri[i][j]+ " ");

            }
            System.out.println();
        }
        soma = (matri[0][0]+ matri[1][1] + matri[2][2] + matri[3][3] + matri[4][4]);
        media = soma/5;

        System.out.println("A média dos elementos da diagonal principal é: " + media);
    }
        }



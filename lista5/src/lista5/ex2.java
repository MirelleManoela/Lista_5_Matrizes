package lista5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriA = new int[2][3];
        int[][] matriB = new int[3][2];
        int[][] matriC = new int[2][2];
        int c1=0 , c2=0, c3=0, c4=0;
        int i,j;
        int i2,j2;
        int i3,j3;

        System.out.println("Matriz A: ");
        for ( i=0; i<2; i++){
            for ( j = 0 ; j<3; j++){
                System.out.println("Escolha um numero da matriz A " + i + " na coluna " + j);
                matriA[i][j] = sc.nextInt();
    }
}
        System.out.println();
        System.out.println("Matriz B: ");
        System.out.println();

        for ( i2=0; i2<3; i2++){
            for ( j2 = 0 ; j2<2; j2++){
                System.out.println("Escolha um numero da matriz B " + i2 + " na coluna " + j2);
                matriB[i2][j2] = sc.nextInt();
    }

}

        System.out.println("Matriz A: ");
        for (i=0; i<2; i++){
          for (j = 0 ; j<3; j++){
             System.out.print(matriA[i][j]+ " ");
        }
            System.out.println();
}
        System.out.println("Matriz B: ");
        for ( i2=0; i2<3; i2++){
            for ( j2 = 0 ; j2<2; j2++){
                System.out.print(matriB[i2][j2]+ " ");
    }
            System.out.println();
}

        c1 = (matriA[0][0] * matriB[0][0]) + (matriA[0][1] * matriB[1][0]) + (matriA[0][2] * matriB[2][0]);
        c2 = (matriA[0][0] * matriB[0][1]) + (matriA[0][1] * matriB[1][1]) + (matriA[0][2] * matriB[2][1]);
        c3 = (matriA[1][0] * matriB[0][0]) + (matriA[1][1] * matriB[1][0]) + (matriA[1][2] * matriB[2][0]);
        c4 = (matriA[1][0] * matriB[0][1]) + (matriA[1][1] * matriB[1][1]) + (matriA[1][2] * matriB[2][1]);

       matriC[0][0] = c1;
       matriC[0][1] = c2;
       matriC[1][0] = c3;
       matriC[1][1] = c4;

        System.out.println("Matriz C: ");
        for ( i3=0; i3<2; i3++){
            for ( j3 = 0 ; j3<2; j3++){
                System.out.print(matriC[i3][j3]+ " ");
            }
            System.out.println();
        }
    }
}
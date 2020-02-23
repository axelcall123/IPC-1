package ipct1;
import java.util.Scanner;
public class HT3 {
    public void matriz_n(){
        //PARA SCANNER
        Scanner sc=new Scanner(System.in);
        //INGRESO DE LAS DOS MATRICES n*n
        int matriz_uno[][];
        int matriz_dos[][];
        //SOLICITAR N PARA LA MATIRZ
        System.out.println("Ingrese el numero de columnas y ailas n*n");
        int n=sc.nextInt();
        //MATRIA n*n
        matriz_uno = new int[n][n];
        matriz_dos= new int[n][n];
        //VARIABLES QUE SIRVEN PARA INDICAR EL NUMERO DE NOTA INGRESADO EN LAS 2 MATRICES
        int numero_u=1;
        int numero_d=1;
        //CICLO PARA SOLCITAR LAS NOTAS DE LAS 2 MATRICES
        for(int a=0;a<matriz_uno.length;a++) {
            //CICLO PARA LLEGAR HATA LA ULTIMA POSCION DE LA MATRIA SEA n*n LA ULTIMA POSICION
            for(int c=0;c<matriz_uno[a].length;c++) {
                 System.out.println("nota numero"+numero_u++ +" de la matriz # 1");
                matriz_uno[a][c]=sc.nextInt();
            } 
        }for(int a=0;a<matriz_dos.length;a++) {
            for(int c=0;c<matriz_dos[a].length;c++) {
                 System.out.println("nota numero"+numero_d++ +" de la matriz # 2");
                matriz_dos[a][c]=sc.nextInt();
            } 
        }  
        

        //IMPRESION DE LOS DATOS INGRESADOS EN LA MATRIZ
        System.out.println("IMPRIMIR MATRIZ # uno");
        for(int a=0;a<matriz_uno.length;a++) {
            for(int c=0;c<matriz_uno[a].length;c++) {
                 System.out.print("|"+matriz_uno[a][c]+"|");
            }
            System.out.println();
        }
        System.out.println("IMPRIMIR MATRIZ # dos");
        for(int a=0;a<matriz_dos.length;a++) {
            for(int c=0;c<matriz_dos[a].length;c++) {
                 System.out.print("|"+matriz_dos[a][c]+"|");
            }
            System.out.println();
        }
        //OTRA MANERA DE HACER UN CILCO PARA IMPRIMIR EL RESULTADO
        //EN VEZ DE UTILIZAR UNA VARIBLE MAS Y UN WHILE
        System.out.println("IMPRIMIR LA SUMA DE LAS MATRICES");
        for(int a=0;a<matriz_dos.length;a++) {
            for(int c=0;c<matriz_dos[a].length;c++) {
                int sumatoria=matriz_uno[a][c]+matriz_dos[a][c];
                 System.out.print("|"+sumatoria+"|");
            }
            System.out.println();
        }
        
    }
}

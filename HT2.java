
package ipct1;

import java.util.Scanner;

public class HT2 {
Scanner sc=new Scanner(System.in);

    public void matriz_nm(){
        //LETRA DONDE COMIENZA EL CILCLO
        char comienzo='a';
        //MATRIZ N*M
        char letras[][];
        int n_letra=0;
        int fila=0;
        //INGRESAR FILAS Y COLUMNAS
        System.out.println("Ingrese el numero de columnas");
        int m=sc.nextInt();
        System.out.println("Ingrese el numero de filas");
        int n=sc.nextInt();
        //MATRIZ DE N COLUMNAS Y M FILAS
        letras = new char[n][m];
        //CICLO PARA SUMAR LA VARIABLE CHAR Y AUMENTAR UNA LETRA
        for(int a=0;a<letras.length;a++) {
            //CICLO PARA AUMENTAR DE LA A-Z
            for(int c=0;c<letras[a].length;c++) {
                //CONDICION PARA QUE EL CICLO TERMINE HASTA LA LETRA Z
                if(n_letra<26){
                letras[a][c]=(char)+(+comienzo+n_letra);
                }
                //CONTADOR QUE AYUDA EN LA CONDICION HASTA LLEGAR A UN NUMERO A 26
                n_letra++;
            } 
        }
        //CILCO PARA IMPRIMIR LA MATRIZ, OTRA MANERA DE IMPIMIR UNA MATRIZ      
        while(fila<n){
            for(int a=0;a<m;a++){ 
                System.out.print("|"+letras[fila][a]+"|");
            }System.out.println();
            fila++;
        } 
    }
   
}
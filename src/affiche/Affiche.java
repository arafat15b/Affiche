/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package affiche;

import java.util.Scanner;

/**
 *
 * @author ARAFAT
 */
public class Affiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
int n;
int indice = -1;
Scanner sc = new Scanner(System.in);
System.out.println("Entrez le nombre a chercher: ");
n = sc.nextInt();
for (int i = 0; i<tab.length; i++){
if ((tab[i] == n) && (indice == -1)){
indice = i;
}
}
if (indice != -1){
System.out.println("Le nombre est à l’indice ");
System.out.println(indice);
}else{
System.out.println("Le nombre n’est pas dans le tableau");
}
}
}    


    
    


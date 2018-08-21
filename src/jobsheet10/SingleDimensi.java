/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author win 7
 */
public class SingleDimensi {
    public static void main (String args []){  
int nilai [][]=new int [2][3]; 
 nilai [0][0]=85; 
 nilai [0][1]=81; 
 nilai [0][2]=78; 
 nilai [1][0]=65; 
 nilai [1][1]=73; 
 nilai [1][2]=71; 
 String MP[]={"RPL","PBO"}; 
 double ratarataMP[]= new double[nilai.length]; 
 for (int i=0; i<nilai.length; i++){ 
 for (int j=0; j<nilai[0].length; j++){ 
 ratarataMP[i]+=nilai [i][j]; 
 } 
 ratarataMP[i]/=nilai[0].length; 
 } 
 System.out.println("Nilai Mata Pelajaran\n"); 
 System.out.println ("MK\tMinggu1\tMinggu2\tMinggu3\tRata-Rata"); 
 for (int i=0; i<nilai.length; i++){ 
 System.out.print(MP[i]+"\t"); 
 for (int j=0;j<nilai[0].length; j++){
 }
 System.out.print(ratarataMP[i]+"\n");
 } 
}  
}



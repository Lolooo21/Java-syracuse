import javax.swing.*;
import java.util.Arrays;
//package testio;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int entier = 15;
        int duree = 0;
        String n = args[0];
        int x = Integer.parseInt(n);


        try {
            FileWriter fw=new FileWriter("f"+x+".txt");
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write("n Un");
            bw.newLine();
            recursive_syracuse(x,duree,0,bw);
           /* bw.write("Il est à moi...");
            for(int i=0;i<20;i++)
            {
                bw.write(Integer.toString(i));
                bw.newLine();

            }*/
            bw.close();
            System.out.println("Ecriture terminée");
        }
        catch (Exception e) {
            System.out.println("Erreur "+e);
        }
       /* int n = 5;
        System.out.println(somme_carre(n));
        int[] tab = {4, 5, 9, 10, 15, 20};
        System.out.println(somme_entier_positif(tab, 0));
        int i = 0;
        System.out.println(palindrome_recur("kayak", 0));
        int[] table = {3,8,56,9,0};
        ordre_inverse(table,0);
        System.out.println(Arrays.toString(table));
        System.out.println(fibonacci());
        System.out.println(recursivite_fibo(10));*/

        //int[] fibo = new int[]{recursivite_fibo(9)};
        //System.out.println(Arrays.toString(fibo));
    }

    /*Question 1 Ecrire une fonction récursive qui calcule la somme des n premiers carrés. Par
    exemple, si n vaut 3, ce sous-programme calculera 1
            2 + 22 + 32
            . Ce sous programme n’est défini
    que pour un n supérieur à 0.*/
    public static int somme_carre(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * n + somme_carre(n - 1));
        }

    }

    /* Question 2 Ecrire un sous-programme récursif qui calcule la somme des éléments positifs d’un
     tableau.*/
    public static int somme_entier_positif(int[] tab, int nb) {
        if (nb >= tab.length) {
            return 0;
        } else if (nb >= 0) {
            if (tab[nb] > 0) {
                return tab[nb] + somme_entier_positif(tab, nb + 1);
            } else {
                return somme_entier_positif(tab, nb + 1);
            }

        }

        return -1;
    }

    /* Question 3 Ecrire un sous-programme récursif qui vérifie si une chaîne de caractère est un
    palindrôme. Rappel : un palindrôme est un mot qui se lit de la même façon de gauche à droite
    et de droite à gauche, comme par exemple ada ou radar. Pour cela vous utiliserez les méthodes
    charAt et length de la classe String. s.charAt(i) renvoie le ième caractère de la chaîne s et
s.length() renvoie la longueur de s.*/
    public static boolean palindrome_recur(String mot, int i) {
        if (i > mot.length() /2)
            return true;
        else if (mot.charAt(i) == mot.charAt(mot.length() -i -1))
            return palindrome_recur(mot, i+1);
        else
            return false;
    }

    /*Question 4 Ecrire un sous-programme récursif qui réarrange les éléments d’un tableau en
    ordre inverse.*/

    public static void ordre_inverse(int[] table, int j){
        if(j < table.length/2){
            int temp;
            temp = table[j];
            table[j] = table[table.length -j -1];
            table[table.length-j-1]=temp;
            ordre_inverse(table,j+1);
        }
    }

    /*  Question 5 Ecrire une fonction qui calcule les valeurs de la série de Fibonacci, définie par :
            — u0 = 0
            — u1 = 1
            — un = un−1 + un−2
    Ecrivez cette fonction sous forme itérative et sous forme récursive.*/

    public static int fibonacci(){
        int u0 =0;
        int u1 =1;
        int un =0;
        int i;
        int count = 10;

        for(i = 2;i<count;i++){
            un = u0+u1;
            u0 = u1;
            u1 = un;
            System.out.println(un);

        }
        return un;
    }
    public static int recursivite_fibo(int nb){
        if (nb <2){
            return nb;
        }else return recursivite_fibo(nb - 1) + recursivite_fibo(nb - 2);

    }
    //public static int recursivite_fibo(nb-1)
    //if(nb>0){
       //un = u0+u1;
       //u0 = u1;
       //u1 = un;
       //recursivite_fibo(nb-1);

    /*Question 6 Mini projet : Conjecture de Syracuse
    Soit la fonction mathématique f : N → N définie par :
    f(x) = (
    x
2
    si x est pair
3x + 1 sinon.
    On appelle cette fonction la fonction de Collatz et comme vous pourrez le vérifier sur internet
    elle a donné et donne toujours du fil à retordre aux mathématiciens. Voici pourquoi :
    Soit un entier positif n. Si on calcule f(n), puisf(f(n)), puisf(f(f(n))) etc. on finit toujours
    par tomber sur la valeur 1 quelle que soit la valeur de n ∈ N. Aucun mathématicien n’est arrivé
    à ce jour à le démontrer (et on ne sait même pas démontrer que c’est indécidable, c’est à dire
            non démontrable à l’aide des mathématiques usuelles). Cela reste une conjecture.
    On peut également formuler le problème avec une suite définie par récurrence u0 vaut n, et
    un+1 = f(un). Les termes succesifs de la suite sont alors : x, f(x), f(f(x)) etc. La conjecture
    est que la suite (un) finit par atteindre la valeur 1, pour n ∈ N. Si on poursuit le calcul la suite
    devient périodique, de période 4, 2, 1, on dit que la suite est entrée dans un puit. Par exemple*/
  /*  en partant de 15 on a la suite :
            15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1,(4, 2, 1, 4, 2, 1, ...)
    Les mathématicien parlent de la trajectoire de n pour désigner cette suite et il définissent
    également le temps de vol (le nombre de termes avant le premier 1, ici 17)et l’altitude maximale
    pour la valeur maximale prise par la suite (ici 160).*/

    public static int collatz(int x){
        if(x%2 == 0){
            return x/2;
        }else{
            return 3*x+1;
        }
    }

    public static void recursive_syracuse(int entier, int cpt, int max,BufferedWriter bw) throws IOException {
        if(entier>max) // permet de trouver le max
            max=entier;
        if (entier  == 1){
            bw.write(cpt+" "+entier);
            bw.newLine();
            bw.write("Durée de vol="+cpt);
            bw.newLine();
            bw.write("Alt max="+max);
            bw.newLine();
            return;}
        else
            bw.write(cpt +" "+entier);
            bw.newLine();
            recursive_syracuse(collatz(entier),cpt+1,max,bw);
    }



}


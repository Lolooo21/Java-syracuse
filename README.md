TD1 : récursivité
Enseignante : Samah Bouzidi
16 janvier 2023
L’objectif de ce TP est de pratiquer la programmation récursive en Java.
Question 1 Ecrire une fonction récursive qui calcule la somme des n premiers carrés. Par
exemple, si n vaut 3, ce sous-programme calculera 1
2 + 22 + 32
. Ce sous programme n’est défini
que pour un n supérieur à 0.
Question 2 Ecrire un sous-programme récursif qui calcule la somme des éléments positifs d’un
tableau.
Question 3 Ecrire un sous-programme récursif qui vérifie si une chaîne de caractère est un
palindrôme. Rappel : un palindrôme est un mot qui se lit de la même façon de gauche à droite
et de droite à gauche, comme par exemple ada ou radar. Pour cela vous utiliserez les méthodes
charAt et length de la classe String. s.charAt(i) renvoie le ième caractère de la chaîne s et
s.length() renvoie la longueur de s.
Question 4 Ecrire un sous-programme récursif qui réarrange les éléments d’un tableau en
ordre inverse.
Question 5 Ecrire une fonction qui calcule les valeurs de la série de Fibonacci, définie par :
— u0 = 0
— u1 = 1
— un = un−1 + un−2
Ecrivez cette fonction sous forme itérative et sous forme récursive.
Question 6 Mini projet : Conjecture de Syracuse
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
devient périodique, de période 4, 2, 1, on dit que la suite est entrée dans un puit. Par exemple
1
en partant de 15 on a la suite :
15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1,(4, 2, 1, 4, 2, 1, ...)
Les mathématicien parlent de la trajectoire de n pour désigner cette suite et il définissent
également le temps de vol (le nombre de termes avant le premier 1, ici 17)et l’altitude maximale
pour la valeur maximale prise par la suite (ici 160).
1. Écrire une fonction Collatz calculant la valeur de la fonction f(x) sur son argument x.
2. Écrire une procédure (un fonction ne renvoyant pas de résultat) récursive Syracuse qui
calcule les itérations successives de la fonction de Collatz sur un entier donné en argument,
jusqu’à trouver 1. Pour le moment la fonction Syracuse n’affichera rien et ne renverra pas
de résultat (mais elle doit calculer chacun des termes successifs de Collatz).
3. Ajouter ensuite un affichage des valeurs successives trouvées dans cette fonction.
4. En reprenant le code de Syracuse écrire une fonction récursive temps_de_vol qui
renvoie le nombre d’itérations de la fonction de Collatz nécessaire pour atteindre 1.
5. Écrire un programme en JAVA qui prend en paramètre de ligne de commande U0 et le
nom du fichier de sortie des données calculées, de type « f100.dat » pour U0 = 100. Le
programme écrira dans le fichier de sortie l’ensemble des valeurs de la suite de Syracuse
définie dans l’article sous la forme « n Un », avec en entête « n Un ». À la fin, il écrira
l’altitude maximum, la durée du vol et la durée en altitude (temps de vol supérieur à
U0). Le format est donné dans l’exemple suivant. Ainsi, l’exécution de : java syracuse 15
f15.dat produira le fichier f15.dat suivant :
2
6. Script Shell d’analyse :
Écrire un script en bash permettant de faire les analyses suivantes : Le script prendra par
défaut en paramètres les valeurs minimum et maximum de U0 (entiers naturels) à étudier.
Il calculera toutes les données des suites de Syracuse, à l’aide du programme fait en C,
pour les valeurs de U0 comprises entre le minimum et le maximum passés en paramètre,
en retenant ces données dans des fichiers qui devront être effacés avant la fin de son
exécution.
Le script écrira ensuite, dans des fichier de données pour les valeurs de U0 comprises entre
le minimum et le maximum passés en paramètre, l’altitude maximum, la durée de vol et
et la durée de vol en altitude.

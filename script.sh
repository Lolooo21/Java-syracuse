javac Main.java
rm altimax.txt
rm dureevol.txt

for i in $(seq $1 $2);
do
java Main $i
tail -n2 f$i.txt | head -n1 | cut -d= -f2 >> dureevol.txt #extrait les 2 dernieres lignes d'un fichier et la 1ere ligne de celui-ci
tail -n1 f$i.txt | cut -d= -f2 >> altimax.txt 
done


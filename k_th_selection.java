package dizidektheleman;
import java.util.Random;
import java.util.Scanner;
public class DizideKthEleman {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int diziBoyutu,arananEleman, dogruMu = 0;
while( dogruMu == 0 ){          // Dizi boyutunu hata vermiycek şekilde girene kadar girmemizi sağlar.
try{
System.out.print("Dizi boyutunu giriniz: ");
diziBoyutu = input.nextInt();
int dizi[ ] = new int[diziBoyutu];
Random r = new Random();
for (int i = 0; i < diziBoyutu; i++)    // Diziye random değerler atama
dizi[i]=r.nextInt(100000);
System.out.print("Dizinin aranan elemanını giriniz: ");
arananEleman = input.nextInt();
dogruMu = 1;                                // Girilen dizi boyutu sorun yaratmadı demek
System.out.println("Dizinin aranan elemanı = " + diziElemaniBulma(dizi, arananEleman));
}
catch(OutOfMemoryError e){
System.out.println("Dizi boyutu çok büyük. Daha küçük bir sayı giriniz");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Aradığınız elemanın indisi dizi boyutundan fazla");
}
catch(Exception e){
System.out.println("Hatayla karşılaşıldı. Farklı bir sayı deneyin");
}
}
}
public static int diziElemaniBulma(int [] dizi, int arananEleman){
String siralama;
int gecici;
System.out.println("Dizinin büyükten küçüğe sıralanması için = b");
System.out.println("Dizinin küçükten büyüğe sıralanması için = k");
Scanner input = new Scanner(System.in);
siralama = input.next();
if (siralama.equals("b")){
for (int i=1; i<dizi.length; i++){
for (int j=0; j<dizi.length-i; j++){
if (dizi[j]<dizi[j+1]){
gecici = dizi[j+1];
dizi[j+1] = dizi[j];
dizi[j] = gecici;
}
}
}
}
if (siralama.equals("k")){ 
for (int i=1; i<dizi.length; i++){
for (int j=0; j<dizi.length-i; j++){
if (dizi[j]>dizi[j+1]){
gecici = dizi[j+1];
dizi[j+1] = dizi[j];
dizi[j] = gecici;
}
}
}
}
return dizi[arananEleman-1];
}
}

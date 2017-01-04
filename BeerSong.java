package HeadFirstJava;

/**
 * Created by CyberNiggaXX87 on 27.01.2016.
 */
public class BeerSong
{ public static void main(String[] args){
    int beerNum=99;
    String word="бутылок";

    while (beerNum>0){
        if (beerNum==1){
            word="бутылка";
        }
        System.out.println(beerNum+" "+word+" пива на стене");
        System.out.println(beerNum+" "+word+" пива");
        System.out.println("возьми одну");
        System.out.println("пусти по кругу!");
        System.out.println();
        beerNum--;


    }
    if (beerNum>0){
        System.out.println(beerNum+" "+word+" пива на стене");
    }
    else{
        System.out.println("нет бутылок пива на стене!");
    }
}
}

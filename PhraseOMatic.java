package HeadFirstJava;

/**
 * Created by CyberNiggaXX87 on 27.01.2016.
 */
public class PhraseOMatic
{public static void main(String[] args){
    String[] wordListOne={"медвежий", "яичный", "добрый", "доступный", "ковалентный", "нековалентный", "периодический", "устроенный", "внушимый", "берлога"};
    String[] wordListTwo={"космодром", "тальяти", "многоточие", "дэбилоид", "фрикоделька", "подчиненный", "атлас", "кукуруза", "Алина", "стехиометрическая", "бородавка"};
    String[] wordListThree={"индивид", "птеродактель", "яичко", "соя", "банановая песня", "жулик", "жмурик", "столбняк", "равнодушный", "циничный", "рабочий рот"};

    int oneLength=wordListOne.length;
    int twoLength=wordListTwo.length;
    int threeLength=wordListThree.length;

    int rand1=(int) (Math.random()*oneLength);
    int rand2=(int) (Math.random()*twoLength);
    int rand3=(int) (Math.random()*threeLength);

    String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

    System.out.println("Все что нам нужно - это: "+phrase);
}
}

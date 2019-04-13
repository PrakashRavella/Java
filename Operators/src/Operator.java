import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Operator {

    public static void main(String[] args)
    {

        double  value1=20;
        double value2=80;
        double fina;
        double divide;
        fina= ((value1+value2)*25);
        System.out.println("the value is "+fina);
        divide=fina/40;
        int result =1+2;
        System.out.println(result);

        int previousResult =result;

        result=result-1;
        System.out.println(previousResult+ "-1="+result);


        result=+100;
        System.out.println(result);

        result=result*100;
        System.out.println(result + "+20=" +result);

        result=result/5;
        System.out.println(result);


        result+=result;
        System.out.println(result);

        boolean IsAlean =true;

        if(IsAlean==false)
            System.out.println("this is a]not alien ");

        int score =100;
        if(score<100);
        System.out.println("scoure is hundred");

        int second = 70;
        if((score==100 )&& (second==70));
        System.out.println("we have statisfied the condition ");

        if((score==70)||(second<90));
        System.out.println("we have used or operator");

        int newValue=100;
        if(newValue==100);
        System.out.println("this is true ");

        boolean value =true;
        if(value=true)
        System.out.println("boolean is true");

        boolean wasCar =value?true:false;
        if(wasCar=true);
        System.out.println("Wascar is true");


        if(divide<=20);
        System.out.println("Total was over the limit ");








    }

}

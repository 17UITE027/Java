package Converter;
import java.util.*;


    public class CurrencyConverter
    {	
	double d,e,y,i,eu,ye,meter,km,mile,Inr,Dollar,Euro,Yen;
        void dollarToInr(double d)
        {
            Inr=d*68.01;
	    System.out.println("Indian Rupee is:"+Inr);
        }
        void EuroToInr(double e)
        {
            Inr=e*80.31;
	    System.out.println("Indian Rupee is:"+Inr);
        }
        void YenToInr(double y)
        {
            Inr=y*0.61;
	    System.out.println("Indian Rupee is:"+Inr);
        }
        void InrToDollar(double i)
        {
            Dollar=i/68.01;
	    System.out.println("Dollar is:"+Dollar);
        }
        void InrToEuro(double eu)
        {
            Euro=eu/80.31;
	    System.out.println("Euro is:"+Euro);
        }
        void InrToYen(double ye)
        {
            Yen=ye/68.01;
	    System.out.println("Yen is:"+Yen);
        }
    }



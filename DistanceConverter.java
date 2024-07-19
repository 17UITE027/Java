package Converter;
import java.util.*;


    public class DistanceConverter
    {
	double km,meter,mile;
        void convertMeterIntoKm(double meter)
        {
            km=meter*0.001;
	    System.out.println("Km is:"+km);
	
        }
        void convertKmIntoMeter(double km)
        {
            meter=km*1000;
	    System.out.println("Meter is:"+meter);
        }
        void convertMilesIntoKm(double mile)
        {
            km=mile*1.609;
	    System.out.println("Km is:"+km);
        }
        void convertKmIntoMiles(double km)
        {
            mile=km*0.621;
	    System.out.println("Mile is:"+mile);
        }
    }


package za.ac.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //Provinces
        Provinces pro = new Provinces();
        pro.addProvinces();
        assertEquals("Western Cape", pro.prov.get(0));
        System.out.println("Pass Province Test");

        //Sencus
        Sencus sence = new Sencus();
        sence.houses();
        if(sence.un.contains(4)){
            System.out.println("Pass Sencus Test");
        }

        //CityCode
        CityCode city = new CityCode();
        city.city();
        if(city.cc.containsKey("Cape Town")){
            System.out.println("Pass City Code Test");
        }

    }
}

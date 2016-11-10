package com.github.zakariandys.SpringInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.zakariandys.common.VehicleInterface;

/**
 * Hello world!
 *
 */
public class App 
{
//	private static ApplicationContext context;
	
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	VehicleInterface carMercy = (VehicleInterface) context.getBean("TheMercedes");
    	VehicleInterface carBmw = (VehicleInterface) context.getBean("TheBmw");
    	
    	
    	System.out.println(carMercy);
    	carMercy.move();
    	System.out.println("===============================================================");
    	System.out.println(carBmw);
    	carBmw.move();
        
    }
}

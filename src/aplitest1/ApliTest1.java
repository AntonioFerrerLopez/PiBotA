/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplitest1;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author root
 */
public class ApliTest1 {

    /**
     * @param args the command line arguments
     */
  
        
     public static void Activa() throws InterruptedException{      
        System.out.println("<--Pi4J--> GPIO Control Example ... started.");
        
        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();
        
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput E1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "Motor1A");
        final GpioPinDigitalOutput E2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Motor1B");
        final GpioPinDigitalOutput E3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "Motor2A");
        final GpioPinDigitalOutput E4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "Motor2B");
        

        
        
        System.out.println("MOTOR 1 sentido horario ");
        E1.low();
        E2.high();
                    
        
                
        System.out.println("MOTOR 2 sentido horario ");
        E3.low();
        E4.high();
        
        
        Thread.sleep(9000);
        
        
                
        System.out.println("MOTOR 1 sentido ANTI ");
        E2.low();
        E1.high();
                    
        
                
        System.out.println("MOTOR 2 sentido ANTI ");
        E4.low();
        E3.high();
        
        
                       gpio.shutdown();
     }
     
     
     public static void Para() throws InterruptedException{
         
         
          // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();
        
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput E1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "Motor1A");
        final GpioPinDigitalOutput E2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Motor1B");
        final GpioPinDigitalOutput E3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "Motor2A");
        final GpioPinDigitalOutput E4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "Motor2B");
       
        Thread.sleep(9000);
        
        
        System.out.println("MOTOR 1 paro");
        E2.low();
        E1.low();
                    
        
                
        System.out.println("MOTOR 2 paro");
        E4.low();
        E3.low();
        
        
        
               gpio.shutdown();
               
     }    
        

    
}

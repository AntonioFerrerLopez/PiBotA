
package PiBotA.Controladores;


import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;


public class ControladorGPIO {
    // crea controlador gpio 
        GpioController gpio = GpioFactory.getInstance();
       
       //Variables estaticas para acceder desde istancia.
       public static GpioPinDigitalOutput E1 ;
       public static GpioPinDigitalOutput E2 ;
       public static GpioPinDigitalOutput E3 ;
       public static GpioPinDigitalOutput E4 ;
        
       public static  GpioPinDigitalOutput LedIzq ;
       public static  GpioPinDigitalOutput LedDer ;
       public static  GpioPinDigitalOutput LedPos ;
        
       public static  GpioPinDigitalInput senLuz ;
        
        
    
    public ControladorGPIO(){

        //PROVISION DE MOTORES
        E1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "Motor1A");
        E2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Motor1B");
        E3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "Motor2A");
        E4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "Motor2B");
        
        //PROVISION DE LEDS        
        LedIzq = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "LedIzquierda");
        LedDer = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "LedDerecha");
        LedPos = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "LedPosicion");
        
        //PROVISION DE ENTRADA SENSOR DE LUZ 
        senLuz = gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, "SensorLuz");  
         
    }
       

public void EliminaControlador(){
    gpio.shutdown();
}  


}

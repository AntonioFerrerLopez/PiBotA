/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiBotA.Vistas;


import PiBotA.Controladores.ControladorGPIO;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;


public class ActivarTest extends java.awt.Frame {
      
 //instancia de controlador.    
 ControladorGPIO gpioControl=new ControladorGPIO();
        
   
    public ActivarTest() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        estadoLuz = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        izquierda = new javax.swing.JButton();
        avanza = new javax.swing.JButton();
        derecha = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        para = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Sluz = new javax.swing.JLabel();
        ActivarSensorLuz = new javax.swing.JButton();
        LabelEstadoSluz = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jButton1.setText("luz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        estadoLuz.setText("estado");

        jPanel1.setLayout(null);

        izquierda.setText("IZQUIERDA");
        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(izquierda);
        izquierda.setBounds(0, 50, 100, 50);

        avanza.setText("AVANZA");
        avanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzaActionPerformed(evt);
            }
        });
        jPanel1.add(avanza);
        avanza.setBounds(100, 0, 100, 50);

        derecha.setText("DERECHA");
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });
        jPanel1.add(derecha);
        derecha.setBounds(200, 50, 100, 50);

        atras.setText("ATRAS");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras);
        atras.setBounds(100, 100, 100, 50);

        para.setText("para");
        para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraActionPerformed(evt);
            }
        });
        jPanel1.add(para);
        para.setBounds(110, 60, 80, 30);

        jLabel1.setText("Control Manual ");

        Sluz.setText("Sensor Luz ");

        ActivarSensorLuz.setText("Activar");
        ActivarSensorLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarSensorLuzActionPerformed(evt);
            }
        });

        LabelEstadoSluz.setText("Estado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sluz)
                .addGap(2, 2, 2)
                .addComponent(ActivarSensorLuz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelEstadoSluz, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sluz)
                    .addComponent(ActivarSensorLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEstadoSluz))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jLabel2.setText("Sensores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(estadoLuz)))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
  
        gpioControl.E1.low();
        gpioControl.E2.low();
        gpioControl.E3.low();
        gpioControl.E4.low();
        
        gpioControl.LedIzq.low();
        gpioControl.LedDer.low();
        gpioControl.LedPos.low();
        
        
        gpioControl.EliminaControlador();
        System.exit(0);
 
    }//GEN-LAST:event_exitForm

    
    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed

    System.out.println("MOTORES Giro DERECHA ");
    gpioControl.E1.low();
    gpioControl.E2.high();
                    
    gpioControl.E3.low();
    gpioControl.E4.high();
        
    //Led indicador Derecha
    gpioControl.LedIzq.low();
    gpioControl.LedDer.high();
    
       
    }//GEN-LAST:event_derechaActionPerformed

    private void paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraActionPerformed
        // TODO add your handling code here:
          
        
    System.out.println("MOTOR 1 paro");
      gpioControl.E2.low();
      gpioControl.E1.low();
                    
        
                
    System.out.println("MOTOR 2 paro");
      gpioControl.E4.low();
      gpioControl.E3.low();
        
    //Leds intermitentes OFF    
    gpioControl.LedIzq.low();
    gpioControl.LedDer.low();


               
    }//GEN-LAST:event_paraActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
                
    System.out.println("MOTORES Giro IZQUIERDA");
    gpioControl.E1.high();
    gpioControl.E2.low();
                   
   
    gpioControl.E3.low();
    gpioControl.E4.high();
    
    //Led indicador Izquierda   
    gpioControl.LedIzq.low();
    gpioControl.LedDer.low();
        
    }//GEN-LAST:event_atrasActionPerformed

    private void avanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzaActionPerformed
        // TODO add your handling code here:
        
    System.out.println("Avanza");
    gpioControl.E1.low();
    gpioControl.E2.high();
    
    gpioControl.E3.high();
    gpioControl.E4.low();
        
    //Leds indicadores OFF          
    gpioControl.LedIzq.low();
    gpioControl.LedDer.low();
        
        
    }//GEN-LAST:event_avanzaActionPerformed
 
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        //Libera controlador al cerrar la ventana.
        gpioControl.EliminaControlador();
    }//GEN-LAST:event_formWindowClosed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
       
    System.out.println("MOTORES Giro DERECHA ");
    gpioControl.E1.high();
    gpioControl.E2.low();
                          
    gpioControl.E3.high();
    gpioControl.E4.low();
    
    //Led indicador Izquierda    
    gpioControl.LedIzq.high();
    gpioControl.LedDer.low();
        

    }//GEN-LAST:event_izquierdaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Cambia valor de Led de posición cada vez que se pulsa el boton.
        gpioControl.LedPos.toggle();
        
        if ( gpioControl.LedPos.isLow() == true ){
            estadoLuz.setText("OFF");
        }   else {
            estadoLuz.setText("ON");

            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ActivarSensorLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarSensorLuzActionPerformed

    //CREACION DEL LISTENER PARA SENSOR DE LUZ 
    gpioControl.senLuz.addListener(new GpioPinListenerDigital() {
      
        public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
        // Visualiza estado por consola
        System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
                
            if (event.getState() == PinState.HIGH){
                Sluz.setText("Nivel ALTO");
            } else Sluz.setText("Nivel BAJO");
                        
        } 
            
    });  
    }//GEN-LAST:event_ActivarSensorLuzActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivarTest().setVisible(true);
        } 
     });  
                
        } 
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivarSensorLuz;
    private javax.swing.JLabel LabelEstadoSluz;
    private javax.swing.JLabel Sluz;
    private javax.swing.JButton atras;
    private javax.swing.JButton avanza;
    private javax.swing.JButton derecha;
    private javax.swing.JLabel estadoLuz;
    private javax.swing.JButton izquierda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton para;
    // End of variables declaration//GEN-END:variables
           
}
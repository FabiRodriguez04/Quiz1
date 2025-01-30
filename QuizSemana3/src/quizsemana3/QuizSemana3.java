/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizsemana3;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabian
 */
public class QuizSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreDelTrabajador="";
        String variableX="";
        double salario= 0.0;
        double salario1RaDeduccion=0;
        double Salario2DaDeduccion=0;
        double salarioTotal=0;
        
        
        nombreDelTrabajador=JOptionPane.showInputDialog("Ingrese su nombre");
        variableX=JOptionPane.showInputDialog("Ingrese su salario actual");
        
        salario=Double.parseDouble(variableX);
        
        /// Al salario se le deducira 9.25% Enfermedad y maternidad
        ///Y despues se le deduce 5.08% (IVM)
       
        salario1RaDeduccion= salario*0.0925;
        Salario2DaDeduccion=salario*0.0508;
        salarioTotal= salario - salario1RaDeduccion - Salario2DaDeduccion;
                
        JOptionPane.showMessageDialog(null, "Nombre del trabajador:" + nombreDelTrabajador + "\n"+
                                            "Su Salario sin deducciones:" +  salario + "\n" +
                                            "Deduccion del 9.25%:" + salario1RaDeduccion + "\n" +
                                            "Deduccion del 5.08%:" + Salario2DaDeduccion + "\n" +
                                            "Su salio total con deducciones es:" + salarioTotal);
               
        
        
        
        
                
        
    }
    
}

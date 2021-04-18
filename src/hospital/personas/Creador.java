/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author loke
 */
public class Creador {
    String nombreFichero = "/home/karen/Documentos/nueva/psm.pan";
    
    public void creadorEmpleado (Empleado empleado){
    
    
try {
FileOutputStream ficheroSalida = new FileOutputStream(nombreFichero);
ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
// se escriben dos objetos de la clase Persona
objetoSalida.writeObject(empleado);//crea el objeto
objetoSalida.close();
} catch (FileNotFoundException e) {
System.out.println("¡El fichero no existe!");
} catch (IOException e) {
System.out.println(e.getMessage());
} catch (Exception e) {
System.out.println(e.getMessage()); 
};
    }
    
    
    public void lectorEmpleado () {       
        try {
            FileInputStream ficheroEntrada = new FileInputStream(nombreFichero);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
// se leen dos objetos de la clase Persona
            Empleado p1 = (Empleado) objetoEntrada.readObject();
            
// se cierra el flujo de objetos objetoEntrada
            objetoEntrada.close();
            System.out.println("DNI\t Nombre");
            System.out.println(p1.persona.getNombre());            
            System.out.println(p1.persona.getNombre());
            System.out.println(p1.persona.getApellidos());
            System.out.println(p1.persona.getEdad());
            System.out.println(p1.persona.getGenero());
            System.out.println(p1.persona.getDocumento());
            System.out.println(p1.getOcupaciones());
            System.out.println(p1.getAntiguedad());
            System.out.println(p1.getHoraDeInicio());
            System.out.println(p1.getHoraDeSalida());
            System.out.println(p1.getIdUsuario());
            System.out.println(p1.getCertificados());
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }
    
}

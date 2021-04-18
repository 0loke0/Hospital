/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.personas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author loke
 */
public class Empleado {

    String ocupaciones;
    int antiguedad;// fechaVinculacion;
    int sueldo;
    int horaDeInicio;
    int horaDeSalida;
    int idUsuario;
    String certificados;
    Personas persona = new Personas();
    Scanner sc = new Scanner(System.in);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    /*   public void sEmpleado(){
    this.ocupaciones= ""; 
    this.antiguedad=0;// fechaVinculacion;
    this.sueldo=0;
    this.horaDeInicio=0;
    this.horaDeSalida=0;
    this.idUsuario=0; 
    this.certificados="";
    }*/

    public void creadorEmpleado(int x) throws IOException {
        try {
            
            Formatter bw = new Formatter("/home/karen/Documentos/nueva/Empleado" + x + ".txt");

            // herencia de personas 
            sc.nextLine();
            System.out.println("nombre");
            persona.nombre = sc.nextLine();
            bw.format("nombre ");
            bw.format("%S,%S", persona.nombre, "\r\n");

            System.out.println("apellidos");
            persona.apellidos = sc.nextLine();
            bw.format("apellidos ");
            bw.format("%S,%S", persona.apellidos, "\r\n");

            System.out.println("Edad");
            persona.edad = sc.nextInt();
            bw.format("edad ");
            bw.format("%S,%S", persona.edad, "\r\n");//persona.edad

            sc.nextLine();

            System.out.println("Genero");
            persona.genero = sc.nextLine();
            bw.format("genero ");
            bw.format("%S,%S", persona.genero, "\r\n");

            System.out.println("Documento");
            persona.documento = sc.nextInt();
            bw.format("documento ");
            bw.format("%S,%S", persona.documento, "\r\n");

            sc.nextLine();

            /// propios de Empleado
            System.out.println("ocupaciones");
            this.ocupaciones = sc.nextLine();
            bw.format("ocupaciones ");
            bw.format("%S,%S", this.ocupaciones, "\r\n");

            System.out.println("antiguedad");
            this.antiguedad = sc.nextInt();
            bw.format("antiguedad ");
            bw.format("%S,%S", this.antiguedad, "\r\n");

            System.out.println("sueldo");
            this.sueldo = sc.nextInt();
            bw.format("sueldo ");
            bw.format("%S,%S", this.sueldo, "\r\n");

            System.out.println("horaDeInicio");
            this.horaDeInicio = sc.nextInt();
            bw.format("horaDeInicio ");
            bw.format("%S,%S", this.horaDeInicio, "\r\n");

            System.out.println("horaDeSalida");
            this.horaDeSalida = sc.nextInt();
            bw.format("horaDeSalida ");
            bw.format("%S,%S", this.horaDeSalida, "\r\n");

            System.out.println("idUsuario");
            this.idUsuario = sc.nextInt();
            bw.format("idUsuario ");
            bw.format("%S,%S", this.idUsuario, "\r\n");

            sc.nextLine();

            System.out.println("certificados");
            this.certificados = sc.nextLine();
            bw.format("certificados ");
            bw.format("%S,%S", this.certificados, "\r\n");
            
            bw.close();
        } catch (Exception e) {
            System.out.println("Error el archivo no esta creado en el directorio");
        }

    }

    public void muestraContenido(int x) throws IOException {

        String direcion = "C:/Users/loke/Desktop/Nueva/Empleado" + x + ".txt";
        String cadena;
        FileReader f = new FileReader(direcion);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            System.out.println(cadena);
        }
        b.close();
    }

    public void mostrar() {

        System.out.println(persona.getNombre());
        System.out.println(persona.getApellidos());
        System.out.println(persona.getEdad());
        System.out.println(persona.getGenero());
        System.out.println(persona.getDocumento());

        System.out.println(this.getOcupaciones());
        System.out.println(this.getAntiguedad());
        System.out.println(this.getHoraDeInicio());
        System.out.println(this.getHoraDeSalida());

        System.out.println(this.getIdUsuario());
        System.out.println(this.getCertificados());

    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public String getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(String ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(int horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public int getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }



}

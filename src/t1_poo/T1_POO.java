/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_poo;

import java.util.Scanner;

/**
 *
 * @author zakkc
 */
public class T1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Alumno alu = new Alumno();
        AlumnoControlador ac = new AlumnoControlador();
        
        
        System.out.println("-----------Registro de Alumnos-----------");
        while(true)
        {
            System.out.println("Ingrese Tipo de Documento (DNI / CARNET)"); String td = sc.nextLine();
        alu.setTipoDocumento(td);
          if(alu.getTipoDocumento() != null) break;
        }
        while(true)
        {
            System.out.println("Ingrese Numero de Documento"); String nd = sc.nextLine();
        alu.setNumeroDocumento(nd);
          if(alu.getNumeroDocumento() != null) break;
        }
        while(true)
        {
        System.out.println("Apellido Paterno:"); String ap=sc.nextLine();
        alu.setApellidoPaterno(ap);
          if(alu.getApellidoPaterno() != null) break;
        }
        while(true)
        {
        System.out.println("Apellido Materno"); String am = sc.nextLine();
        alu.setApellidoMaterno(am);
          if(alu.getApellidoMaterno() != null) break;
        }
        
        while(true)
        {
        System.out.println("Nombre"); String na = sc.nextLine();
        alu.setNombre(na);
          if(alu.getNombre() != null) break;
        }
        
        while (true) {
            try {
                System.out.println("Ingrese la edad del Estudiante"); int ed = Integer.parseInt(sc.nextLine());
                    alu.setEdad(ed);
                if (alu.edadvalida()) break;
                } catch (NumberFormatException ex) {
                System.out.println("Solo números enteros.");
            }
        }
        String nsocio = alu.asignarNivelSocioeconomico(sc);
        alu.setNivelSocioeconomico(nsocio);
        
        String bec = alu.asignarBeca(sc);
        alu.setBeca(bec);
        
        ac.AgregarALumno(alu);
        ac.MostrarAlumno();
    }
    
}

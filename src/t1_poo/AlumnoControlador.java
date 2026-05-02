/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

import java.util.ArrayList;


/**
 *
 * @author zakkc
 */
public class AlumnoControlador {
    public ArrayList<Alumno> listaAlumno = new ArrayList<>();
    
    public AlumnoControlador()
    {
        this.listaAlumno = new ArrayList<>();
    }
    
    public void AgregarALumno(Alumno e)
    {
        listaAlumno.add(e);
    }
    
    public void MostrarAlumno()
    {
        for(Alumno al:listaAlumno)
        {
            al.Mostrar();
        }
    }
    
}

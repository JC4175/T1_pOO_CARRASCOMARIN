/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

import java.util.Scanner;

/**
 *
 * @author zakkc
 */
public class Alumno {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String nivelSocioeconomico;
    private String beca;
    private boolean edadValida;
    
    public boolean edadvalida()
    {
        return edadValida;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        if(tipoDocumento.equalsIgnoreCase("DNI") || tipoDocumento.equalsIgnoreCase("Carnet"))
        {
            this.tipoDocumento = tipoDocumento;
        }
        else
        {
            System.out.println("Ingresar tipo de documento valido");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        try
        {
        if(tipoDocumento.equalsIgnoreCase("DNI")&& numeroDocumento.length() == 8)
        {
            this.numeroDocumento=numeroDocumento;
        }
        else if(tipoDocumento.equalsIgnoreCase("CARNET")&& numeroDocumento.length() == 11)
        {
            this.numeroDocumento=numeroDocumento;
        }
        else
        {
            System.out.println("\"Error numero de doc no valido\"");
        }
        }catch(NullPointerException a)
        {
            System.out.println("Error: Debe Ingresar numeros");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty())
        {
            System.out.println("No puede ser un dato en blanco");
        }
        else if(!nombre.trim().matches("[a-zA-]+"))
        {
            System.out.println("solo se permiten letras");
        }
        else
        {
            this.nombre = nombre;
        }
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if(apellidoPaterno == null && apellidoPaterno.trim().isEmpty())
        {
            System.out.println("No puede ser un dato en blanco");
        }
        else if(!apellidoPaterno.trim().matches("[a-zA-]+"))
        {
            System.out.println("solo se permiten letras");
        }
        else
        {
            this.apellidoPaterno = apellidoPaterno;
        }
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        if(apellidoMaterno == null && apellidoMaterno.trim().isEmpty())
        {
            System.out.println("No puede ser un dato en blanco");
        }
        else if(!apellidoMaterno.trim().matches("[a-zA-]+"))
        {
            System.out.println("solo se permiten letras");
        }
        else
        {
            this.apellidoMaterno = apellidoMaterno;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0 && edad<120)
        {
            this.edad = edad;
            this.edadValida = true;
        }else
        {
            System.out.println("Edad no valida");
            this.edadValida = false;
        }
    }

    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(String nivelSocioeconomico) {
        this.nivelSocioeconomico = nivelSocioeconomico;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }
    
    public void Mostrar()
    {
        System.out.println("Tipo Documento: "+this.tipoDocumento+"| Nro Documento:"+this.numeroDocumento+" |Apellidos y Nombres: "+
        this.apellidoPaterno+" "+this.apellidoMaterno+" "+this.nombre+" | Edad: "+ this.edad+" | Nivel Socioeconomico:"+this.nivelSocioeconomico+
        " | Beca:"+this.beca +"Monto a Pagar: S/. " + CalcularPension());
    }
    
    public String asignarNivelSocioeconomico(Scanner sc) {
        int op;
        while (true) {
            System.out.println("Seleccione nivel socioeconómico:");
            System.out.println("  1. Nivel A  (pensión S/. 500)");
            System.out.println("  2. Nivel B  (pensión S/. 350)");
            System.out.println("  3. Nivel C  (pensión S/. 200)");
            try {
                op = Integer.parseInt(sc.nextLine());
                switch (op) {
                    case 1: return "A";
                    case 2: return "B";
                    case 3: return "C";
                    default: System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }
    
    public String asignarBeca(Scanner sc) {
        int op;
        while (true) {
            System.out.println("Seleccione tipo de beca:");
            System.out.println("  1. Sin beca     (100% de la pensión)");
            System.out.println("  2. Beca parcial (50% de la pensión)");
            System.out.println("  3. Beca total   (No paga)");
            try {
                op = Integer.parseInt(sc.nextLine());
                switch (op) {
                    case 1: return "NINGUNA";
                    case 2: return "PARCIAL";
                    case 3: return "TOTAL";
                    default: System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }
    
    public double CalcularPension()
    {
        double montoBase;
        switch (nivelSocioeconomico) {
            case "A": montoBase = 500.0; break;
            case "B": montoBase = 350.0; break;
            case "C": montoBase = 200.0; break;
            default:  montoBase = 0.0;
        }
        switch (beca) {
            case "PARCIAL": return montoBase * 0.50;
            case "TOTAL":   return 0.0;
            default:        return montoBase;
        }
    }
    
    
}

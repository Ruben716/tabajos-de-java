/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprincipal;

/**
 *
 * @author ACER
 */
public class Persona {
    private String nombre;
    private String dni;
    private String email;

    public Persona(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Email: " + email);
    }
}


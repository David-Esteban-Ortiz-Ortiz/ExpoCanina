/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umariana.exposicioncanina;

/**
 *
 * @author Asus
 */
public class NombreDuplicadoException extends Exception {
    
    public NombreDuplicadoException(){
        super("Ya existe un perro con ese nombre, intentelo nuevamente");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.estud;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Tatiana
 */

@Entity
@Table
@NamedQueries(@NamedQuery(name="Estudiante.getAll",query="SELECT e FROM Estudiante e"))
public class Estudiante implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    
   private int EstudianteId;
    @Column
   private String Nombre;
    @Column
   private String Apellido;
    @Column
   private int AñoNivel;

    public int getEstudianteId() {
        return EstudianteId;
    }

    public void setEstudianteId(int EstudianteId) {
        this.EstudianteId = EstudianteId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getAñoNivel() {
        return AñoNivel;
    }

    public void setAñoNivel(int AñoNivel) {
        this.AñoNivel = AñoNivel;
    }

    public Estudiante(int EstudianteId, String Nombre, String Apellido, int AñoNivel) {
        this.EstudianteId = EstudianteId;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.AñoNivel = AñoNivel;
    }
    
    public Estudiante (){
        
    }
}

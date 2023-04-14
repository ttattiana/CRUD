/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.estud;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tatiana
 */
@Local
public interface EstudianteDaoLocal {

    void addEstudiante(Estudiante estudiante);

    void editEstudiante(Estudiante estudiante);

    void deleteEstudiante(int EstudianteId);

    Estudiante getEstudiante(int EstudianteId);

    List<Estudiante> getAllEstudiantes();

    
    
}

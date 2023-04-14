/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.estud;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tatiana
 */
@Stateless
public class EstudianteDao implements EstudianteDaoLocal{ 
        @PersistenceContext
         private EntityManager em;


    @Override
    public void addEstudiante(Estudiante estudiante) {
        em.persist(estudiante);
    }
    
    
    @Override
    public void editEstudiante(Estudiante estudiante) {
        em.merge(estudiante);
    }

    @Override
    public void deleteEstudiante(int EstudianteId) {
        em.remove(getEstudiante(EstudianteId));
    }

    @Override
    public Estudiante getEstudiante(int EstudianteId) {
        return em.find(Estudiante.class,EstudianteId);
    }

    @Override
    public List<Estudiante> getAllEstudiantes() {
        return em.createNamedQuery("Estudiante.getAll").getResultList();
    }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Formation;

/**
 *
 * @author Ayoub
 */
public interface FormationMetier
{
     public Formation saveFormation(Formation f);
    public List<Formation> listFormations();
    public Formation getFormations(Long id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.FormateurRepository;
import org.GestionFormation.entities.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class FormateurMetierImpl implements FormateurMetier
{
    @Autowired
    private FormateurRepository formateurRepository;

    @Override
    public Formateur saveFormateur(Formateur f)
    {
        return formateurRepository.save(f);
    }

    @Override
    public List<Formateur> listFormateur()
    {
        return formateurRepository.findAll();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ayoub
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
{
    org.GestionFormation.web.RestServices.EvaluationFormationRestServiceIT.class, org.GestionFormation.web.RestServices.SessionFormationRestServiceIT.class, org.GestionFormation.web.RestServices.DocumentRestServiceIT.class, org.GestionFormation.web.RestServices.AbsenceRestServiceIT.class, org.GestionFormation.web.RestServices.RoleUtilisateurRestServiceIT.class, org.GestionFormation.web.RestServices.FormationRestServiceIT.class, org.GestionFormation.web.RestServices.FormateurRestServiceIT.class, org.GestionFormation.web.RestServices.ResponsableFormationRestServiceIT.class, org.GestionFormation.web.RestServices.AdministrateurRestServiceIT.class, org.GestionFormation.web.RestServices.CollaborateurRestServiceIT.class, org.GestionFormation.web.RestServices.UtilisateurRestServiceIT.class
})
public class RestServicesITSuite
{

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }
    
}
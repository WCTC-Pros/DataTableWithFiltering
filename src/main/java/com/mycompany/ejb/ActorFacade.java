/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ejb;

import com.mycompany.entity.Actor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ncummins
 */
@Stateless
public class ActorFacade extends AbstractFacade<Actor>{
    @PersistenceContext(unitName = "com.mycompany_DataTableLab_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActorFacade() {
        super(Actor.class);
    }
    
}

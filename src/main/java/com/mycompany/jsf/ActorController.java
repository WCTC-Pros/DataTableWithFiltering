package com.mycompany.jsf;

import com.mycompany.entity.Actor;
import com.mycompany.ejb.ActorFacade;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;


@Named("actorController")
@SessionScoped
public class ActorController implements Serializable {

    @Inject
    private ActorFacade ejbFacade;

    public ActorController() {
    }

    public List<Actor> getAllActors(){
        return ejbFacade.findAll();
    }
}

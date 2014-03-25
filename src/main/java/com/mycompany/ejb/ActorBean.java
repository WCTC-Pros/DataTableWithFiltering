package com.mycompany.ejb;

import com.mycompany.entity.Actor;
import com.mycompany.jsf.ActorController;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("actorBean")
@SessionScoped
public class ActorBean implements Serializable{
    private List<Actor> actors;
    @Inject
    private ActorController ac;
    
    public ActorBean(){
        
    }
    @PostConstruct
    public void init(){
        actors=ac.getAllActors();
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }    
}

/*
 * Click nbfs://nbhost/SystentityMFileSystentityM/TentityMplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystentityMFileSystentityM/TentityMplates/Classes/Class.java to edit this tentityMplate
 */
package com.mycompany.royalgrepositoryi.ServiceImpl;

import com.mycompany.royalgrepositoryi.Service.RoyalGRepository;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 *
 * @author Marc Apedoh
 */
public class RoyalGRepositoryI<T extends Serializable, K> implements RoyalGRepository<T,K> {

    @PersistenceContext
    protected EntityManager entityM;
    private Class<T> myObjet;

    public RoyalGRepositoryI(Class<T> myObjet) {
        this.myObjet = myObjet;
    }
    
    
    
    @Override
    public void save(T t) {
        assert t!=null;
        try{
            this.entityM.persist(t);
        }catch(EntityExistsException exception){
            System.out.println("Erreur dans votre requête monsieur ou madame reverifier+ "+exception.getMessage());
        }catch(PersistenceException ex){
            System.out.println("il s'agit d'une erreur à l'exécution c'est possiblentityMent pas votre faute! j'ai bien dit peut être hihi!!!");
        }
    }

    @Override
    public List<T> findAll() {
        Query req= this.entityM.createQuery("select t from "+this.myObjet.getSimpleName()+ "t");
        if(req.getResultList()==null){
            System.out.println("Aucun élentityMent trouver en base");
        }
        return req.getResultList();
    }

    @Override
    public T findById(K k) {
        return this.entityM.find(this.myObjet,k);
    }

    @Override
    public void deleteById(K k) {
        assert k!=null;
        this.entityM.remove(this.findById(k));
    }
    
}

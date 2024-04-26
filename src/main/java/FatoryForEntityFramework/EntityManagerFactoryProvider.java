/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FatoryForEntityFramework;

/**
 *
 * @author adral
 */
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Marc_UNIT");

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}

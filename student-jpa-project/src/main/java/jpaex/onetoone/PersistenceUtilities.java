package jpaex.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtilities {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("nexturn26_PU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public static void closeEntityManagerFactory() {
        if (emf != null) {
            emf.close();
        }
    }
}
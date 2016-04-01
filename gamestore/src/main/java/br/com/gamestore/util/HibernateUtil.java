package br.com.gamestore.util;

import br.com.gamestore.model.Acessorio;
import br.com.gamestore.model.Usuario;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author rjs
 */
public class HibernateUtil {

    private HibernateUtil() {
    }

    private static SessionFactory sessionFactory;

//    static {
//        try {
//            // Create the SessionFactory from standard (hibernate.cfg.xml) 
//            // config file.
//            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            // Log the exception. 
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Acessorio.class);
                ac.addAnnotatedClass(Usuario.class);

                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
}

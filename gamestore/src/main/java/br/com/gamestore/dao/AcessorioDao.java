package br.com.gamestore.dao;

import br.com.gamestore.model.Acessorio;
import br.com.gamestore.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Enoque Felipe
 */
public class AcessorioDao {

    public void salvar(Acessorio acessorio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(acessorio);
        t.commit();
    }
}

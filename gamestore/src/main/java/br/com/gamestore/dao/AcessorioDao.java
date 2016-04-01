package br.com.gamestore.dao;

import br.com.gamestore.model.Acessorio;
import br.com.gamestore.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Enoque Felipe
 */
public class AcessorioDao implements GenericDao<Acessorio> {

//    public void salvar(Acessorio acessorio) {
//    Session session = HibernateUtil.getSessionFactory().openSession();
//    Transaction t = session.beginTransaction();
//
//    session.save (acessorio);
//
//    t.commit ();
//    }

    @Override
    public void cadastrar(Acessorio ac) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(ac);
        t.commit();
    }

    @Override
    public void deletar(Acessorio obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Acessorio> getLista(Acessorio obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

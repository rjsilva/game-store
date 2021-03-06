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
    public void cadastrar(Acessorio acessorio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(acessorio);
        t.commit();
    }
    
        public List<Acessorio> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from tbl_Acessorio").list();
        t.commit();
        return lista;
    }

    @Override
    public void deletar(Acessorio acessorio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Acessorio> getLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

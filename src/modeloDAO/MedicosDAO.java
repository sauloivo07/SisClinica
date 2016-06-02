package modeloDAO;

import modeloConexao.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import modeloBeans.Medicos;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Saulo
 */
public class MedicosDAO {
    
    SessionFactory sf = null;
    
    
    public void inserir(Medicos m){
        if(m != null){
            Session sessao = null;
            try {
                sf = HibernateUtil.getSessionFactory();
                sessao = sf.openSession();
                sessao.beginTransaction();
                sessao.save(m);
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Medico Inserido.");
            } catch (Exception e) {
                System.out.println("Não foi possivel inserir " + e.getMessage());
            }
        } else {
            System.out.println("Valor passado como parametro é nulo.");
        }
    }
    
    public void atualizar(Medicos m){
        if(m != null){
            Session sessao = null;
            try {
                sf = HibernateUtil.getSessionFactory();
                sessao = sf.openSession();
                sessao.beginTransaction();
                sessao.update(m);
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Medico Atualizado.");
            } catch (Exception e) {
                System.out.println("Não foi possivel atualizar " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro é nulo.");
        } 
    }
    
    public void deletar(Medicos m){
        if(m != null){
            Session sessao = null;
            try {
                sf = HibernateUtil.getSessionFactory();
                sessao = sf.openSession();
                sessao.beginTransaction();
                sessao.delete(m);
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Medico deletado.");
            } catch (Exception e) {
                System.out.println("Não foi possivel deletar " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro é nulo.");
        } 
    }
    
    public List<Medicos> consultarByNome(JTextField txtNome){
        List<Medicos> lista = new ArrayList<Medicos>();
        Session sessao = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sessao = sf.openSession();
            sessao.beginTransaction();
            
            Criteria crit = sessao.createCriteria(Medicos.class);
            crit.add(Restrictions.like("nome", "%" + txtNome.getText() + "%"));
            lista = crit.list();
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel recuperar Medicos " + e.getMessage());
        }
        
        return lista;
    }
    
    public List<Medicos> consultar(){
        List<Medicos> lista = new ArrayList<Medicos>();
        Session sessao = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sessao = sf.openSession();
            sessao.beginTransaction();
            
            Criteria crit = sessao.createCriteria(Medicos.class);
            lista = crit.list();
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel recuperar Medicos " + e.getMessage());
        }
        
        return lista;
    }
}

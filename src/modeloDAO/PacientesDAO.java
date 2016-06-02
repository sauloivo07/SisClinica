package modeloDAO;

import java.util.ArrayList;
import java.util.List;
import modeloBeans.Bairro;
import modeloBeans.Pacientes;
import modeloConexao.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


public class PacientesDAO {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    
    public void inserir(Pacientes p, String bairro){
        if(p != null){
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                p.setBairro(pesquisaBairro(bairro));
                sessao.save(p);
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Paciente inserido no banco");
            } catch (Exception e) {
                System.out.println("Não foi possivel inserir paciente " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro é vazio");
        }
    }
    
        public void atualizar(Pacientes p){
        if(p != null){
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                sessao.update(p);
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Paciente atualizado no banco");
            } catch (Exception e) {
                System.out.println("Não foi possivel atualizar paciente " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro é vazio");
        }
    }
        
    public void deletar(Pacientes p){
        if(p != null){
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Pacientes.class);
                crit.add(Restrictions.eq("nome", p.getNome()));
                crit.add(Restrictions.eq("rg", p.getRg()));
                crit.setMaxResults(1);
                
                p = (Pacientes) crit.uniqueResult();
                
                sessao.delete(p);
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Paciente deletado do banco");
            } catch (Exception e) {
                System.out.println("Não foi possivel deletar paciente " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro é vazio");
        }
    }
    
        public List<Pacientes> listar(){
            List<Pacientes> lista = new ArrayList<>();
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Pacientes.class);
                lista = crit.list();
                
                sessao.getTransaction().commit();
                sessao.close();
                
            } catch (Exception e) {
                System.out.println("Não foi possivel pesquisar lista de pacientes" + e.getMessage());
            }
            
            return lista;
        }
        
        public Pacientes pesquisarPaciente(String nome, String RG){
            Pacientes p = new Pacientes();
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Pacientes.class);
                crit.add(Restrictions.eq("nome", nome));
                crit.add(Restrictions.eq("rg", RG));
                crit.setMaxResults(1);
                p = (Pacientes) crit.uniqueResult();
                
                sessao.getTransaction().commit();
                sessao.close();
                
            } catch (Exception e) {
                System.out.println("Não foi possivel pesquisar lista de pacientes" + e.getMessage());
            }
            
            return p;
        }
        
        public List<Bairro> listarBairros(){
            List<Bairro> lista = new ArrayList<>();
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Bairro.class);
                crit.addOrder(Order.asc("nome"));
                lista = crit.list();
                
                sessao.getTransaction().commit();
                sessao.close();
                
            } catch (Exception e) {
                System.out.println("Não foi possivel lista de BAIRROS" + e.getMessage());
            }
            
            return lista;
        }
        
        public Bairro pesquisaBairro(String bairro){
            Bairro b = new Bairro();
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Bairro.class);
                crit.add(Restrictions.eq("nome", bairro));
                crit.setMaxResults(1);
                
                b = (Bairro) crit.uniqueResult();
                
                sessao.getTransaction().commit();
                sessao.close();
                
            } catch (Exception e) {
                System.out.println("Não foi possivel lista de BAIRROS" + e.getMessage());
            }
            
            return b;
        }
}

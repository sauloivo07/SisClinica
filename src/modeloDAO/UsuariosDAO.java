package modeloDAO;

import controle.Criptografar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modeloBeans.Usuarios;
import modeloConexao.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Saulo
 */
public class UsuariosDAO {
    
    SessionFactory sf = null;
    Session sessao = null;
    
    public void inserir(Usuarios u){
        if(u != null){
            try {
            sf = HibernateUtil.getSessionFactory();
            sessao = sf.openSession();
            sessao.beginTransaction();
            sessao.save(u);
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Usuario inserido com sucesso.");
            } catch (Exception e) {
                System.out.println("Não foi possivel inserir usuario " + e.getMessage());
            }
        }else{
            System.out.println("Usuario passado como parametro é NULL.");
        }
    }

    public void atualizar(Usuarios u){
        if(u != null){
            try {
            sf = HibernateUtil.getSessionFactory();
            sessao = sf.openSession();
            sessao.beginTransaction();
            sessao.update(u);
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Usuario atualizado com sucesso.");
            } catch (Exception e) {
                System.out.println("Não foi possivel atualizar usuario " + e.getMessage());
            }
        }else{
            System.out.println("Usuario passado como parametro é NULL.");
        }
    }
        
    public void deletar(Usuarios u){
        if(u != null){
            try {
            sf = HibernateUtil.getSessionFactory();
            sessao = sf.openSession();
            sessao.beginTransaction();
            sessao.delete(u);
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Usuario deletado com sucesso.");
            } catch (Exception e) {
                System.out.println("Não foi possivel deletar usuario " + e.getMessage());
            }
        }else{
            System.out.println("Usuario passado como parametro é NULL.");
        }
    }
        
    public List<Usuarios> consultar(){
        List<Usuarios> lista = new ArrayList<Usuarios>();
        try {
        sf = HibernateUtil.getSessionFactory();
        sessao = sf.openSession();
        Criteria crit = sessao.createCriteria(Usuarios.class);
        lista = crit.list();
        if(lista.get(0) == null){
            lista = null;
        }
        return lista;
        } catch (Exception e) {
            System.out.println("Não foi possivel consultar " + e.getMessage());
            return null;
        }
    }
    
    public Usuarios consultaLoginSenha(JTextField txt, JPasswordField pass){
        Usuarios u = new Usuarios();
        Criteria crit;
        
        if(!txt.getText().isEmpty() && !pass.getText().isEmpty()){
            try {
                sf = HibernateUtil.getSessionFactory();
                sessao = sf.openSession();
                sessao.beginTransaction();
               /* Query q =  sessao.createQuery("from Usuarios where usu_login = :login and usu_senha = :senha");
                q.setString("login", txt.getText());
                q.setString("senha", pass.getText());*/
                String crptSenha = Criptografar.encriptografar(pass.getText());
                crit = sessao.createCriteria(Usuarios.class);
                crit.add(Restrictions.eq("login", txt.getText()));
                crit.add(Restrictions.eq("senha", crptSenha));
                crit.setMaxResults(1);
                
                u = (Usuarios) crit.uniqueResult();
                
                sessao.getTransaction().commit();
                sessao.close();
                
                return u;
                
            } catch (Exception e) {
                System.out.println("Não foi possivel realizar consulta de login e senha " + e.getMessage());
                return null;
            }
        } else{
            System.out.println("Valores passados por parametros estão vazios");
            return null;
        }
        
    }
    
    public Usuarios consultaLoginSenha(String txt, String pass){
        Usuarios u = new Usuarios();
        Criteria crit;
        
        if(!txt.isEmpty() && !pass.isEmpty()){
            try {
                sf = HibernateUtil.getSessionFactory();
                sessao = sf.openSession();
                sessao.beginTransaction();
               /* Query q =  sessao.createQuery("from Usuarios where usu_login = :login and usu_senha = :senha");
                q.setString("login", txt.getText());
                q.setString("senha", pass.getText());*/
                String crptSenha = Criptografar.encriptografar(pass);
                crit = sessao.createCriteria(Usuarios.class);
                crit.add(Restrictions.eq("login", txt));
                //crit.add(Restrictions.eq("senha", crptSenha));
                crit.setMaxResults(1);
                
                u = (Usuarios) crit.uniqueResult();
                
                sessao.getTransaction().commit();
                sessao.close();
                if(u.getNome().equals("")){
                    u = null;
                }
                return u;
                
            } catch (Exception e) {
                System.out.println("Não foi possivel realizar consulta login e senha " + e.getMessage());
                return null;
            }
        } else{
            System.out.println("Valores passados por parametros estão vazios");
            return null;
        }
        
    }
    
}

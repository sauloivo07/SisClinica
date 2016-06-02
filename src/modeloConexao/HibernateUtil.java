package modeloConexao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Saulo
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public void fechaConexao(SessionFactory sf){
        if(sf != null){
            sf.close();
            System.out.println("Session Factory fexado");
        } else {
            System.out.println("Não foi possivel fechar Sessao Factory");
        }
    }
    
    public void fechaConexao(Session sessao){
        if(sessao != null){
            sessao.close();
            System.out.println("Sessao fexada");
        } else {
            System.out.println("Não foi possivel fechar Sessao");
        }
    }
}

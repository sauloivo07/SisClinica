/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.Agenda;
import modeloBeans.Medicos;
import modeloBeans.Pacientes;
import modeloConexao.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Saulo
 */
public class AgendaDAO {
    //Agenda a = new Agenda();
    
    SessionFactory sf = HibernateUtil.getSessionFactory();
    private List<Agenda> listaAgenda = new ArrayList<>();
    
    public void inserir(Agenda a){
        if(a != null){
            try {
            Session sessao = sf.openSession();
            sessao.beginTransaction();
            sessao.save(a);
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Agenda inserida com sucesso!");
            } catch (Exception e) {
                System.out.println("Não foi possivel inserir agenda " + e.getMessage());
            }
        } else {
            System.out.println("Valor passado como parametro é vazio");
        }
    }
    public void atualizar(Agenda a){
        if(a != null){
            try {
            Session sessao = sf.openSession();
            sessao.beginTransaction();
            sessao.update(a);
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Agenda inserida com sucesso!");
            } catch (Exception e) {
                System.out.println("Não foi possivel inserir agenda " + e.getMessage());
            }
        } else {
            System.out.println("Valor passado como parametro é vazio");
        }
    }
    
    public Medicos searchMedico(String nomeMedico){
        Medicos m = null;
        if(!nomeMedico.equals("Selecione")){
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();

                Criteria crit = sessao.createCriteria(Medicos.class);
                crit.add(Restrictions.eq("nome", nomeMedico));
                crit.setMaxResults(1);
                
                m = new Medicos();
                m = (Medicos) crit.uniqueResult();

                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Medico encontrado");
            } catch (Exception e) {
                System.out.println("Não foi possivel recuperar medico " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro não valido");
        }
        return m;
    }
    
    public Pacientes searchPaciente(String nomePaciente){
        Pacientes p = null;
        if(!nomePaciente.isEmpty()){
            try {
                Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Pacientes.class);
                crit.add(Restrictions.eq("nome", nomePaciente));
                crit.setMaxResults(1);
                
                p = new Pacientes();
                p = (Pacientes) crit.uniqueResult();
                
                sessao.getTransaction().commit();
                sessao.close();
                System.out.println("Paciente encontrado");
            } catch (Exception e) {
                System.out.println("Não foi possivel encontrar paciente " + e.getMessage());
            }
        } else{
            System.out.println("Valor passado como parametro é nulo");
        }
        return p;
    }
    
    public List<Agenda> listar(){
        try {
            Session sessao = sf.openSession();
            sessao.beginTransaction();
            
            Criteria crit = sessao.createCriteria(Agenda.class);
            listaAgenda = crit.list();
            
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Agendamento de consultas retornado");
            
            return listaAgenda;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            //System.out.println("Não foi possivel retornar agenda" + e.getMessage());
        }
    }

    public List<Agenda> listar(String paciente, String medico, String turno, String situacao, Date date1, Date date2) {
        List<Agenda> listaAux = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1, dt2;
        try {
           Session sessao = sf.openSession();
                sessao.beginTransaction();
                
                Criteria crit = sessao.createCriteria(Agenda.class);
                crit.createCriteria("codPaciente", "p");
                crit.createCriteria("codMedico", "m");
                
                if (paciente != null) crit.add(Restrictions.ilike("p.nome", paciente + "%"));
                if (medico != null) crit.add(Restrictions.eq("m.nome", medico));
                if (turno != null) crit.add(Restrictions.eq("turno", turno));
                if (situacao != null) crit.add(Restrictions.eq("status", situacao));
                
                listaAgenda = crit.list();
            
                if(date1 != null && date2 != null){
                    for (Agenda a : listaAgenda) {
                        //JOptionPane.showMessageDialog(null, dt1);
                        if(a.getData().after(date1) && a.getData().before(date2)){
                            //JOptionPane.showMessageDialog(null, a.getData());
                            listaAux.add(a);
                        }
                    }
                    //listaAgenda.clear();
                    listaAgenda = listaAux;
                }
                
            sessao.getTransaction().commit();
            sessao.close();
            System.out.println("Dados recuperados");
            
            return listaAgenda;
        } catch (Exception e) {
            System.out.println("Não foi possivel retornar agenda " + e.getMessage());
            //e.printStackTrace();
            return null;
            
        }
    }
    
}

package modeloBeans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Agenda")
public class Agenda implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToOne
    @JoinColumn (name = "agenda_codMedico")
    private Medicos codMedico;
    
    @ManyToOne
    @JoinColumn (name = "agenda_codPaciente")
    private Pacientes codPaciente;
    
    @Column (name = "agenda_turno")
    private String turno;
    @Column (name = "agenda_data")
    private Date data;
    @Column (name = "agenda_status")
    private String status;
    @Column (name = "agenda_motivo")
    private String motivo;

    public Agenda(int id, Medicos codMedico, Pacientes codPaciente, String turno, Date data, String status, String motivo) {
        this.id = id;
        this.codMedico = codMedico;
        this.codPaciente = codPaciente;
        this.turno = turno;
        this.data = data;
        this.status = status;
        this.motivo = motivo;
    }
    
    public Agenda() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicos getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(Medicos codMedico) {
        this.codMedico = codMedico;
    }

    public Pacientes getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(Pacientes codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
    
}

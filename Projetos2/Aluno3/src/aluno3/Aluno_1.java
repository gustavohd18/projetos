/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maivo
 */
@Entity
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno_1.findAll", query = "SELECT a FROM Aluno_1 a")
    , @NamedQuery(name = "Aluno_1.findById", query = "SELECT a FROM Aluno_1 a WHERE a.id = :id")
    , @NamedQuery(name = "Aluno_1.findByNome", query = "SELECT a FROM Aluno_1 a WHERE a.nome = :nome")
    , @NamedQuery(name = "Aluno_1.findByP1", query = "SELECT a FROM Aluno_1 a WHERE a.p1 = :p1")
    , @NamedQuery(name = "Aluno_1.findByP2", query = "SELECT a FROM Aluno_1 a WHERE a.p2 = :p2")
    , @NamedQuery(name = "Aluno_1.findByP3", query = "SELECT a FROM Aluno_1 a WHERE a.p3 = :p3")
    , @NamedQuery(name = "Aluno_1.findByMe", query = "SELECT a FROM Aluno_1 a WHERE a.me = :me")
    , @NamedQuery(name = "Aluno_1.findByMatricula", query = "SELECT a FROM Aluno_1 a WHERE a.matricula = :matricula")})
public class Aluno_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "p1")
    private Float p1;
    @Column(name = "p2")
    private Float p2;
    @Column(name = "p3")
    private Float p3;
    @Column(name = "me")
    private Float me;
    @Column(name = "matricula")
    private String matricula;

    public Aluno_1() {
    }

    public Aluno_1(Integer id) {
        this.id = id;
    }

    public Aluno_1(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getP1() {
        return p1;
    }

    public void setP1(Float p1) {
        this.p1 = p1;
    }

    public Float getP2() {
        return p2;
    }

    public void setP2(Float p2) {
        this.p2 = p2;
    }

    public Float getP3() {
        return p3;
    }

    public void setP3(Float p3) {
        this.p3 = p3;
    }

    public Float getMe() {
        return me;
    }

    public void setMe(Float me) {
        this.me = me;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno_1)) {
            return false;
        }
        Aluno_1 other = (Aluno_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aluno3.Aluno_1[ id=" + id + " ]";
    }
    
}

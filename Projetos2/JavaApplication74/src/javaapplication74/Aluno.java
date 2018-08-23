/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author maivo
 */
@Entity
@Table(name = "aluno", catalog = "teste", schema = "")
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")
    , @NamedQuery(name = "Aluno.findById", query = "SELECT a FROM Aluno a WHERE a.id = :id")
    , @NamedQuery(name = "Aluno.findByNome", query = "SELECT a FROM Aluno a WHERE a.nome = :nome")
    , @NamedQuery(name = "Aluno.findByP1", query = "SELECT a FROM Aluno a WHERE a.p1 = :p1")
    , @NamedQuery(name = "Aluno.findByP2", query = "SELECT a FROM Aluno a WHERE a.p2 = :p2")
    , @NamedQuery(name = "Aluno.findByP3", query = "SELECT a FROM Aluno a WHERE a.p3 = :p3")
    , @NamedQuery(name = "Aluno.findByMe", query = "SELECT a FROM Aluno a WHERE a.me = :me")
    , @NamedQuery(name = "Aluno.findByMatricula", query = "SELECT a FROM Aluno a WHERE a.matricula = :matricula")})
public class Aluno implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

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

    public Aluno() {
    }

    public Aluno(Integer id) {
        this.id = id;
    }

    public Aluno(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Float getP1() {
        return p1;
    }

    public void setP1(Float p1) {
        Float oldP1 = this.p1;
        this.p1 = p1;
        changeSupport.firePropertyChange("P1", oldP1, p1);
    }

    public Float getP2() {
        return p2;
    }

    public void setP2(Float p2) {
        Float oldP2 = this.p2;
        this.p2 = p2;
        changeSupport.firePropertyChange("P2", oldP2, p2);
    }

    public Float getP3() {
        return p3;
    }

    public void setP3(Float p3) {
        Float oldP3 = this.p3;
        this.p3 = p3;
        changeSupport.firePropertyChange("P3", oldP3, p3);
    }

    public Float getMe() {
        return me;
    }

    public void setMe(Float me) {
        Float oldMe = this.me;
        this.me = me;
        changeSupport.firePropertyChange("me", oldMe, me);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        String oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
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
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication74.Aluno[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

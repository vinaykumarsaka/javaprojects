/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

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
 * @author vinaykumar
 */
@Entity
@Table(name = "fee_report", catalog = "studentfee", schema = "")
@NamedQueries({
    @NamedQuery(name = "FeeReport_1.findAll", query = "SELECT f FROM FeeReport_1 f")
    , @NamedQuery(name = "FeeReport_1.findById", query = "SELECT f FROM FeeReport_1 f WHERE f.id = :id")
    , @NamedQuery(name = "FeeReport_1.findByName", query = "SELECT f FROM FeeReport_1 f WHERE f.name = :name")
    , @NamedQuery(name = "FeeReport_1.findByPassword", query = "SELECT f FROM FeeReport_1 f WHERE f.password = :password")
    , @NamedQuery(name = "FeeReport_1.findByEmail", query = "SELECT f FROM FeeReport_1 f WHERE f.email = :email")
    , @NamedQuery(name = "FeeReport_1.findByContactno", query = "SELECT f FROM FeeReport_1 f WHERE f.contactno = :contactno")})
public class FeeReport_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "contactno")
    private String contactno;

    public FeeReport_1() {
    }

    public FeeReport_1(Integer id) {
        this.id = id;
    }

    public FeeReport_1(Integer id, String name, String password, String email, String contactno) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.contactno = contactno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        String oldContactno = this.contactno;
        this.contactno = contactno;
        changeSupport.firePropertyChange("contactno", oldContactno, contactno);
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
        if (!(object instanceof FeeReport_1)) {
            return false;
        }
        FeeReport_1 other = (FeeReport_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "student.FeeReport_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

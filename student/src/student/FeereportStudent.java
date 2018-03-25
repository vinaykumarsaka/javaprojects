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
@Table(name = "feereport_student", catalog = "studentfee", schema = "")
@NamedQueries({
    @NamedQuery(name = "FeereportStudent.findAll", query = "SELECT f FROM FeereportStudent f")
    , @NamedQuery(name = "FeereportStudent.findByRollno", query = "SELECT f FROM FeereportStudent f WHERE f.rollno = :rollno")
    , @NamedQuery(name = "FeereportStudent.findByName", query = "SELECT f FROM FeereportStudent f WHERE f.name = :name")
    , @NamedQuery(name = "FeereportStudent.findByEmail", query = "SELECT f FROM FeereportStudent f WHERE f.email = :email")
    , @NamedQuery(name = "FeereportStudent.findByCourse", query = "SELECT f FROM FeereportStudent f WHERE f.course = :course")
    , @NamedQuery(name = "FeereportStudent.findByFee", query = "SELECT f FROM FeereportStudent f WHERE f.fee = :fee")
    , @NamedQuery(name = "FeereportStudent.findByPaid", query = "SELECT f FROM FeereportStudent f WHERE f.paid = :paid")
    , @NamedQuery(name = "FeereportStudent.findByDue", query = "SELECT f FROM FeereportStudent f WHERE f.due = :due")
    , @NamedQuery(name = "FeereportStudent.findByAddress", query = "SELECT f FROM FeereportStudent f WHERE f.address = :address")
    , @NamedQuery(name = "FeereportStudent.findByCity", query = "SELECT f FROM FeereportStudent f WHERE f.city = :city")
    , @NamedQuery(name = "FeereportStudent.findByState", query = "SELECT f FROM FeereportStudent f WHERE f.state = :state")
    , @NamedQuery(name = "FeereportStudent.findByCountry", query = "SELECT f FROM FeereportStudent f WHERE f.country = :country")
    , @NamedQuery(name = "FeereportStudent.findByContactno", query = "SELECT f FROM FeereportStudent f WHERE f.contactno = :contactno")})
public class FeereportStudent implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rollno")
    private Integer rollno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "course")
    private String course;
    @Basic(optional = false)
    @Column(name = "fee")
    private int fee;
    @Basic(optional = false)
    @Column(name = "paid")
    private int paid;
    @Basic(optional = false)
    @Column(name = "due")
    private int due;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "contactno")
    private String contactno;

    public FeereportStudent() {
    }

    public FeereportStudent(Integer rollno) {
        this.rollno = rollno;
    }

    public FeereportStudent(Integer rollno, String name, String email, String course, int fee, int paid, int due, String address, String city, String state, String country, String contactno) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.course = course;
        this.fee = fee;
        this.paid = paid;
        this.due = due;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.contactno = contactno;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        Integer oldRollno = this.rollno;
        this.rollno = rollno;
        changeSupport.firePropertyChange("rollno", oldRollno, rollno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        int oldFee = this.fee;
        this.fee = fee;
        changeSupport.firePropertyChange("fee", oldFee, fee);
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        int oldPaid = this.paid;
        this.paid = paid;
        changeSupport.firePropertyChange("paid", oldPaid, paid);
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        int oldDue = this.due;
        this.due = due;
        changeSupport.firePropertyChange("due", oldDue, due);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
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
        hash += (rollno != null ? rollno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeereportStudent)) {
            return false;
        }
        FeereportStudent other = (FeereportStudent) object;
        if ((this.rollno == null && other.rollno != null) || (this.rollno != null && !this.rollno.equals(other.rollno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "student.FeereportStudent[ rollno=" + rollno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

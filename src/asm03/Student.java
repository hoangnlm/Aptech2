/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm03;

import java.io.Serializable;

/**
 *
 * @author Hoang
 */
public class Student implements Serializable {

    private String firstName, lastName, contact, address, quali, spec, enroll, hobbies, sport;

    public Student() {

    }

    public Student(String firstName, String lastName, String contact, String address, String quali, String spec, String enroll, String hobbies, String sport) throws Exception {
        setFirstName(firstName);
        setLastName(lastName);
        setContact(contact);
        setAddress(address);
        setQuali(quali);
        setSpec(spec);
        setEnroll(enroll);
        setHobbies(hobbies);
        setSport(sport);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getQuali() {
        return quali;
    }

    public String getSpec() {
        return spec;
    }

    public String getEnroll() {
        return enroll;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getSport() {
        return sport;
    }

    public void setFirstName(String firstName) throws Exception {
        if (firstName.trim().isEmpty()) {
            throw new Exception("Fist name cannot be empty!");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws Exception {
        if (lastName.trim().isEmpty()) {
            throw new Exception("Last name cannot be empty!");
        }
        this.lastName = lastName;
    }

    public void setContact(String contact) throws Exception {
        if (contact.trim().isEmpty()) {
            throw new Exception("Contact cannot be empty!");
        }
        this.contact = contact;
    }

    public void setAddress(String address) throws Exception {
        if (address.trim().isEmpty()) {
            throw new Exception("Address cannot be empty!");
        }
        this.address = address;
    }

    public void setQuali(String quali) throws Exception {
        if (quali.trim().isEmpty()) {
            throw new Exception("Qualifications cannot be empty!");
        }
        this.quali = quali;
    }

    public void setSpec(String spec) throws Exception {
        if (spec.trim().isEmpty()) {
            throw new Exception("Specialization cannot be empty!");
        }
        this.spec = spec;
    }

    public void setEnroll(String enroll) throws Exception {
        if (enroll.trim().isEmpty()) {
            throw new Exception("Enroll cannot be empty!");
        }
        this.enroll = enroll;
    }

    public void setHobbies(String hobbies) throws Exception {
        if (hobbies.trim().isEmpty()) {
            throw new Exception("Hobbies cannot be empty!");
        }
        this.hobbies = hobbies;
    }

    public void setSport(String sport) throws Exception {
        if (sport.trim().isEmpty()) {
            throw new Exception("Sports cannot be empty!");
        }
        this.sport = sport;
    }

}

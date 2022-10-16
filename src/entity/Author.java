/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author spetu
 */
public class Author {
    
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstname() {
        return firstName;
    }
    
    public Author(){
    }

    public Author(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "\n\t\t\t  Author {" 
                + " Name: " + firstName + "|"
                + " LastName: " + lastName + "|"
                + " BirthYear: " + birthYear + "}\n\t\t\t";
    }
    
}

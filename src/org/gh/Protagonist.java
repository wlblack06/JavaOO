//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Protagonist extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String motivation;
    
    // set grade
    public void setMotivation(String motivation){
        this.motivation = motivation;
    }
    // get grade
    public String getMotivation(){
        return this.motivation;
    }
    
    // constructor called to create a new protagonist object
    //  See it's usage in RunMe
    public Protagonist(String name, String motivation){
        super(name);
        this.setMotivation(motivation);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a Protagonist, I want the name and grade to print
        return "Protagonist details from PrintMe() - " + this.getName()+ " - "+this.getMotivation();
    }
}

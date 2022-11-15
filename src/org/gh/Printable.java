package org.gh;

// an interace is a "special" class that allows us to implement common language
// which can be used in all classes which implmeent the interface

public interface Printable{
    // notice there are no implementation details.  The interface promotes polymorphism
    //  This is the OO principle where I can use common terms to interact with different classes differntly
    // See the Teacher and Student classes for implementation details of printMe()
    public String printMe();

}

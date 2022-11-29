package org.gh;

public class PokemonTrainer extends Person implements Printable{

    private String pokemonCaught;
    
    public void setPokemonCaught(String pokemonCaught){
        this.pokemonCaught = pokemonCaught;
    }
    public String getpokemonCaught(){
        return this.pokemonCaught;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public PokemonTrainer(String name, String PokemonTrainer){
        super(name);
        this.setPokemonCaught(pokemonCaught);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Pokemon Trainer details from PrintMe() - " + this.getName()+ " - "+this.getpokemonCaught();
    }
}

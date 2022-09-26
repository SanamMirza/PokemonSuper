public class FirePokemon extends PokemonSuper {
    private String trainer;
    private double weight;

    public FirePokemon(String name, int hp, String food, String trainer, double weight) {
        super(name, hp, food);
        this.trainer = trainer;
        this.weight = weight;
    }

    public String getTrainer() {
        return trainer;
    }

    public double getWeight() {
        return weight;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eats() {

    }

    @Override
    public void speaks() {
        System.out.println(getName() + " said CHARMANDER CHARMANDER!! ");

    }

    public void flameThrower(){
        System.out.println(getName() + " uses his powerfull FLAMETHROWER!!" );
    }

    public void weight(){
        System.out.println(getName() + " is " + this.getWeight() + "cm.");
    }
    public void trainer(){
        System.out.println(getName() + "'s trainer is " + getTrainer() + ".");
    }
}

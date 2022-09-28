public class ElectricPokemon extends PokemonSuper {

    private String lightningColor;
    private String habbit;

    public ElectricPokemon(String name, int hp, String food, String lightningColor, String habbit) {
        super(name, hp, food);
        this.lightningColor = lightningColor;
        this.habbit = habbit;
    }

    public String getLightningColor() {
        return lightningColor;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setLightningColor(String lightningColor) {
        this.lightningColor = lightningColor;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + this.getFood());
    }

    @Override
    public void speaks () {

    }

    public void thunderPunch(){
        System.out.println(getName() + " strikes a THUNDERPUNCH!!");
    }

    public void lightningColor(){
        System.out.println("When " + getName() + " is angry, his lightning color turns " + getLightningColor()+".");
    }

    public void habbit(){
        System.out.println(getName() + getHabbit() + " when he is nervous.");
    }
}



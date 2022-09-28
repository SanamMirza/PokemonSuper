public class WaterPokemon extends PokemonSuper {
    private String sound;
    private String appearanceGlasses;


    public WaterPokemon(String name, int hp, String food, String sound, String appearanceGlasses) {
        super(name, hp, food);
        this.sound = sound;
        this.appearanceGlasses = appearanceGlasses;
    }


    public String getSound() {
        return sound;
    }

    public String getAppearanceGlasses() {
        return appearanceGlasses;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setAppearanceGlasses(String appearanceGlasses) {
        this.appearanceGlasses = appearanceGlasses;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats a lot of pokeplants.");
    }

    @Override
    public void speaks() {
        System.out.println(this.getName() + " said SQUIRTLE SQUIRTLE!! ");

    }

    public void hydroCanon(){

        System.out.println(getName()+ " throws a big punch with his HydroCANON!!");
    }

    public void sound(){
        System.out.println(getName() + " made a " + getSound() + " sound.");
    }

    public void appearance(){
        System.out.println(getName() + " has big " + getAppearanceGlasses() + ".");
    }
}


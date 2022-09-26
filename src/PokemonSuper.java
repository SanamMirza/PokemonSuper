public abstract class PokemonSuper {

    private String name;
    private int hp;
    private String food;


    public PokemonSuper(String name, int hp, String food) {
        this.name = name;
        this.hp = hp;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void eats();

    public abstract void speaks();
}


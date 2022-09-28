public class GrassPokemon extends PokemonSuper {
    private int height;
    private String favoriteSong;


    public GrassPokemon(String name, int hp, String food, int height, String favoriteSong) {
        super(name, hp, food);
        this.height = height;
        this.favoriteSong = favoriteSong;
    }

    public int getHeight() {
        return height;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    @Override
    public void eats() {

    }

    @Override
    public void speaks() {
        System.out.println(this.getName() + " said SAUR SAUR!! ");

    }

    public void leafStorm(){
        System.out.println(getName() + " attacks with his powerfull LEAFSTORM!!");
    }

    public void height(){
        System.out.println(getName() + " is only " + getHeight() + "cm.");
    }

    public void favoriteSong(){
        System.out.println(getName() + " likes to listen to " + getFavoriteSong() + ", when he wants to go to sleep.");
    }
}



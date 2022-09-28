public class Main {

    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 60, "pokepeppers", "Ash", 8.5);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 44, "pokeplants","sqrrrl sqrrrl","black sunglasses");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 50,"pokegrass", 70, "The Jigglypuff song");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 60, "pokebrocks", "red", "jumps");


        pikachu.thunderPunch();
        bulbasaur.leafStorm();
        charmander.weight();
        charmander.trainer();
        pikachu.lightningColor();
        bulbasaur.favoriteSong();
        squirtle.sound();

    }
}

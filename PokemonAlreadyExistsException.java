public class PokemonAlreadyExistsException extends Exception {
    public PokemonAlreadyExistsException() {
        super("Error! Pokemon already exists in box!");
    }

    public PokemonAlreadyExistsException(String message) {
        super(message);
    }
    
}

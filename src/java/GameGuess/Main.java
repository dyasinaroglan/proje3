package java.GameGuess;

public class Main {


    /*
     Main methodunda
     İlk olarak randomGenerator method'undan random sayıyı alın
     Sonra LetsGuess method unu çağırın.
     randomGenerator,  LetsGuess method'unun parametresidir
     */
    public static void main(String[] args) {
        GuessGame g1 = new GuessGame();

        g1.letsGuess(g1.randomGenerator());
    }


}

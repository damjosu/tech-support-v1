import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private ArrayList<String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        responses = new ArrayList<>();
        responses.add("That sounds interesting. Tell me more...");
        responses.add("continue");
        responses.add("keep on");
        responses.add("go on");
        responses.add("I see");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int aleatorio = rnd.nextInt(5);
        String response = responses.get(aleatorio);
        return response;
    }
}

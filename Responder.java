import java.util.HashSet;
import java.util.HashMap;
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
    private HashMap<String, String> faq;
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
        faq = new HashMap<>();
        faq.put("Hola", "Hello");
        faq.put("How", "you should google it.");
        faq.put("finish", "Good work");
        faq.put("Bye", "Bye");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> answers)
    {
        String response = null;
        boolean existe = false;
        int i = 0;
        String found = null;

        for (String answer : answers) {
            if (found == null && (faq.containsKey(answer))) {
                found = faq.get(answer);
                existe = true;
            } 
        }
        response = found;
        if (!existe) {
            int aleatorio = rnd.nextInt(5);
            response = responses.get(aleatorio);
        }
        return response;
    }
}

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MadLib {
    
    private String story;
    
    /**
     * This creates a new MadLib object and reads the
     * story from the given file.
     * @param filename the name of the MadLib file
     * @throws IOException if something goes wrong
     */
    public MadLib(String filename) throws IOException {        
        InputStream fis = new FileInputStream(filename);
        // TODO: I know better than this
        byte [] data = new byte[fis.available()];
        fis.read(data);
        fis.close();
        story = new String(data);        
    }
    
    /**
     * This method returns the list of prompts from the
     * given story.
     * TODO: cache this ... only need to do this once
     * TODO: check for errors in format
     * @return the prompts
     */
    public List<String> getPrompts() {
        List<String> ret = new ArrayList<String>();
        int pos = 0;
        while(true) {
            int i = story.indexOf('_',pos);
            if(i<0) return ret;
            int j = story.indexOf('_',i+1);
            String prompt = story.substring(i+1,j);
            ret.add(prompt);
            //System.out.println(prompt); 
            pos = j + 1;
        }        
    }
    
    /**
     * This method returns the story with the user inputs filled in.
     * TODO: check for errors in format
     * TODO: use a string builder
     * @param fillins the map of prompt:input
     * @return the constructed story
     */
    public String makeStory(Map<String,String> fillins) {
        int pos = 0;
        String ret = ""; //
        
        while(true) {
            int i = story.indexOf('_',pos);
            if(i<0) {
                ret = ret + story.substring(pos);
                return ret;
            }
            ret = ret + story.substring(pos,i);
            int j = story.indexOf('_',i+1);
            String prompt = story.substring(i+1,j);
            String inp = fillins.get(prompt);
            ret = ret + inp;
            pos = j + 1;
        }
        
    }
    
    private static Map<String,String> askUser(List<String> prompts) {
        
        Map<String,String> ret = new HashMap<String,String>();
        Scanner scan = new Scanner(System.in);
        
        for(String prompt : prompts) {
            System.out.print("Give me a word for '"+prompt+"' :");
            String inp = scan.nextLine();
            ret.put(prompt, inp);
            //System.out.println("::"+prompt+":"+inp+"::");
        }
        
        scan.close();        
        return ret;
    }
    
    public static void main(String [] args) throws IOException {
        
        System.out.println("Welcome to Mad Libs!");
        
        MadLib mad = new MadLib("MadLib.txt");
        
        List<String> prompts = mad.getPrompts();
        
        Map<String,String> fillins = askUser(prompts);
        
        String story = mad.makeStory(fillins);
        
        System.out.println(story);
        
    }

}

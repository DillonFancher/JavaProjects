import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.ArrayList;


/**
 * Created by daffancher on 5/19/14.
 */


public class TextAnalytics {

    public static void main(String[] args){

        ArrayList<Tweet> twitterData = new ArrayList<Tweet>();
        twitterData = parseTweets();

        if(twitterData.size() != 0)System.out.println(twitterData.size());
    }

    public static ArrayList<Tweet> parseTweets(){

        BufferedReader br = null;
        JSONParser parser = new JSONParser();
        ArrayList<Tweet> parsedTweets = new ArrayList<Tweet>();

        try{
            String currentTweet;
            br = new BufferedReader(new FileReader("/Users/daffancher/Desktop/SmallTweets.json"));

            while ((currentTweet = br.readLine()) != null){

                Object tweetJSON;
                Tweet newTweet = new Tweet();
                try{
                    tweetJSON = parser.parse(currentTweet);
                    JSONObject tweet = (JSONObject) tweetJSON;

                    String tweetText = (String) tweet.get("text");

                    JSONObject location = (JSONObject) tweet.get("coordinates");
                    JSONArray latlon = (JSONArray) location.get("coordinates");

                    newTweet.setCoordinates(latlon);
                    newTweet.setText(tweetText);

                    parsedTweets.add(newTweet);


                }
                catch (ParseException e){
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(br != null) br.close();
            }
            catch(IOException ex){
               ex.printStackTrace();
            }
        }
        return parsedTweets;
    }
}

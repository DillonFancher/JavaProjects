import org.json.simple.JSONArray;

/**
 * Created by daffancher on 5/19/14.
 */
public class Tweet {

    private double[] geoTag = new double[2];
    private String text = null;

    public double[] getCoordinates(){
        return geoTag;
    }

    public String getText(){
        return text;
    }

    //Stays in GeoJSON format, lon first, lat second
    public void setCoordinates(JSONArray latlon){
        geoTag[0] = new Double(latlon.get(0).toString());
        geoTag[1] = new Double(latlon.get(1).toString());
    }

    public void setText(String text){
        this.text = text;
    }

}

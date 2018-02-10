package models;

/**
 * Created by seteg on 09/02/2018.
 */

public class Pokemon {

    private String numOfPokemon;
    private String name;
    private String url;


    public String getNumOfPokemon() {
        String [] urlPartes = url.split("/");
        return urlPartes[urlPartes.length -1];
    }

    public void setNumOfPokemon(String number) {
        this.numOfPokemon = numOfPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

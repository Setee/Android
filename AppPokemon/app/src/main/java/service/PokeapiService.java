package service;

import models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by seteg on 09/02/2018.
 */

public interface PokeapiService {

    @GET("pokemon") //parte de la url que cambia
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

}

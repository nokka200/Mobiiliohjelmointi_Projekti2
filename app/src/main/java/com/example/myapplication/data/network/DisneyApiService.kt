package com.example.myapplication.com.example.myapplication.data.network

import com.example.myapplication.com.example.myapplication.data.model.Disney
import retrofit2.http.GET

data class DisneyResponse(
    val disney: List<Disney>
)

interface DisneyApiService {
    @GET("173d78a2-9ec1-472d-9f3e-3f5ea3501e70")

    suspend fun getDisney(): List<Disney>
}

// Osoite https://run.mocky.io/v3/173d78a2-9ec1-472d-9f3e-3f5ea3501e70
/**
 * [
 *   {
 *     "name": "Mickey Mouse",
 *     "species": "Mouse",
 *     "residence": "Disneyland",
 *     "occupation": "Entertainer",
 *     "catchphrase": "Hot dog!"
 *   },
 *   {
 *     "name": "Minnie Mouse",
 *     "species": "Mouse",
 *     "residence": "Disneyland",
 *     "occupation": "Entertainer",
 *     "catchphrase": "Oh, Mickey!"
 *   },
 *   {
 *     "name": "Donald Duck",
 *     "species": "Duck",
 *     "residence": "Duckburg",
 *     "occupation": "Entertainer",
 *     "catchphrase": "Woo-hoo!"
 *   },
 *   {
 *     "name": "Daisy Duck",
 *     "species": "Duck",
 *     "residence": "Duckburg",
 *     "occupation": "Entertainer",
 *     "catchphrase": "Oh, Donald!"
 *   },
 *   {
 *     "name": "Goofy",
 *     "species": "Goof",
 *     "residence": "Disneyland",
 *     "occupation": "Entertainer",
 *     "catchphrase": "Gawrsh!"
 *   },
 *   {
 *     "name": "Pluto",
 *     "species": "Dog",
 *     "residence": "Disneyland",
 *     "occupation": "Pet",
 *     "catchphrase": "(Barks)"
 *   }
 * ]
 */
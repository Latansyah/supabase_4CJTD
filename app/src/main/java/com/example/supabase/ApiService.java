package com.example.supabase;



import java.util.ArrayList;
 import okhttp3.Response;
 import retrofit2.Call;
 import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;


/**
 * Created on : October/05/2021
 * Author     : Latansyah Maulana Virnandani
 * Company    : Polinema
 * Project    : RestApiApp
 */
// step ke 4 bikin interface API service
public interface ApiService {
    @Headers({
            "Cache-Control: max-age=640000",
            "apikey: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMzNTk1NjM5LCJleHAiOjE5NDkxNzE2Mzl9.oscFx49rS31P2GK0fvtBnY1-hjj0aKk2uRPSmkqkboI",
              "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMzNTk1NjM5LCJleHAiOjE5NDkxNzE2Mzl9.oscFx49rS31P2GK0fvtBnY1-hjj0aKk2uRPSmkqkboI"
    })
    @GET("v1/todo")
    Call<ArrayList<Todo>> requestListTodo(
            @Query("select") String value
    );
}
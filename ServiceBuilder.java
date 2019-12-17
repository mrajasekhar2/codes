package mobiroad.com.retrofit.services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceBuilder {

    private static final String Url = "http://192.168.42.208:9000";//local ip adress of localhost.ipv4

    private static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder client = new OkHttpClient.Builder().addInterceptor(interceptor);


    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Url)
            .addConverterFactory(GsonConverterFactory.create()).client(client.build()).build();



    public static <S> S builderService(Class<S> serviceType) {

        return retrofit.create(serviceType);
    }


}

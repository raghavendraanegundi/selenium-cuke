package com.browserstack;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Raghavendra.A on 06-05-2017.
 */
public class JavaHttpRequest {


    public static void main(String[] args){

        OkHttpClient client = new OkHttpClient();
        String id="695";
        String url="https://quickbooks.api.intuit.com/v3/company/123145773434929/customer/"+id+"?minorversion=6";

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("authorization", "OAuth oauth_consumer_key=\"qyprdrnHDh4cj9cPs3gTVan9tOvlP9\",oauth_token=\"lvprd1wnBa6mwM2XqsP9RwX4Csrnu2rSuZv6Zjv9tc6pHcnC\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"1494096166\",oauth_nonce=\"Ov1FXs\",oauth_version=\"1.0\",oauth_signature=\"IM33iWjT5seR5C%2FEULnFVKAJCKc%3D\"")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "d1284cc3-b657-9146-d707-eaf87a1941b1")
                .addHeader("accept", "application/xml")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.code());
            System.out.println(response.body().contentType());
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

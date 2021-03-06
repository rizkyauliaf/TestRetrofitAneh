package com.example.testretrofitaneh;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {

    @GET("siswa")
    Call<List<MahasiswaResponseModel>> getAllMahasiwa();

   //disini trdpt post siswa yg digunakan untuk pengiriman data
    @FormUrlEncoded
    @POST("siswa")
    Call<Void> setPost(
            @Field("id_siswa") String id_siswa,
            @Field("nama") String nama,
            @Field("alamat") String alamat,
            @Field("jenis_kelamin") String jenis_kelamin,
            @Field("no_telp") String no_telp
    );
    //metod put Berfungsi untuk mengubah data siswa mulai dr nama,alamt,jk,notelp
    @FormUrlEncoded
    @PUT("siswa")
    Call<Void> editPost(
            @Field("id_siswa") String id_siswa,
            @Field("nama") String nama,
            @Field("alamat") String alamat,
            @Field("jenis_kelamin") String jenis_kelamin,
            @Field("no_telp") String no_telp
    );
}

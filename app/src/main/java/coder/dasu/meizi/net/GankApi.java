package coder.dasu.meizi.net;

import coder.dasu.meizi.net.response.GankDataResponse;
import coder.dasu.meizi.net.response.GankDayResponse;
import coder.dasu.meizi.net.response.GankHistoryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by dasu on 2016/8/25.
 */
public interface GankApi {

    /**
     * 默认一次加载的数量
     */
    int DEFAULT_COUNT = 10;

    /**
     * 获取发布过干货的日期
     */
    @GET("day/history")
    Call<GankHistoryResponse> getGankDay();

    /**
     * 获取指定type类型的data数据
     */
    @GET("data/{type}/{count}/{page}")
    Call<GankDataResponse> getData(@Path("type") String type, @Path("count") int count, @Path("page") int page);

    /**
     * 获取指定日期的每日干货
     */
    @GET("day/{y}/{M}/{d}")
    Call<GankDayResponse> getDayGankData(@Path("y") String year, @Path("M") String month, @Path("d") String day);
}

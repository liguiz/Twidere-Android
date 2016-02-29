package org.mariotaku.twidere.api.statusnet.api;

import org.mariotaku.restfu.annotation.method.GET;
import org.mariotaku.restfu.annotation.param.Query;
import org.mariotaku.twidere.api.statusnet.model.StatusNetConfig;
import org.mariotaku.twidere.api.twitter.TwitterException;
import org.mariotaku.twidere.api.twitter.model.Paging;
import org.mariotaku.twidere.api.twitter.model.ResponseList;
import org.mariotaku.twidere.api.twitter.model.Status;

/**
 * Created by mariotaku on 16/2/27.
 */
public interface StatusNetResources {

    @GET("/statusnet/config.json")
    StatusNetConfig getConfig() throws TwitterException;

    @GET("/search.json")
    ResponseList<Status> searchStatuses(@Query("q") String query, @Query Paging paging) throws TwitterException;

}
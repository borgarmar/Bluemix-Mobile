
package com.ibm.mobileappbuilder.businessdirectory20150916145512.ds;
import java.net.URL;
import com.ibm.mobileappbuilder.businessdirectory20150916145512.R;
import ibmmobileappbuilder.ds.RestService;
import ibmmobileappbuilder.util.StringUtils;

/**
 * "RestaurantsDSService" REST Service implementation
 */
public class RestaurantsDSService extends RestService<RestaurantsDSServiceRest>{

    public static RestaurantsDSService getInstance(){
          return new RestaurantsDSService();
    }

    private RestaurantsDSService() {
        super(RestaurantsDSServiceRest.class);

    }

    @Override
    public String getServerUrl() {
        return "https://ibm-pods.buildup.io";
    }

    @Override
    protected String getApiKey() {
        return "A2InvAsJ";
    }

    @Override
    public URL getImageUrl(String path){
        return StringUtils.parseUrl("https://ibm-pods.buildup.io/app/57d12b711b391b03007f95ef",
                path,
                "apikey=A2InvAsJ");
    }

}


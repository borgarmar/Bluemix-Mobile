
package com.ibm.mobileappbuilder.businessdirectory20150916145512.ds;
import java.net.URL;
import com.ibm.mobileappbuilder.businessdirectory20150916145512.R;
import ibmmobileappbuilder.ds.RestService;
import ibmmobileappbuilder.util.StringUtils;

/**
 * "GymsScreen1DSService" REST Service implementation
 */
public class GymsScreen1DSService extends RestService<GymsScreen1DSServiceRest>{

    public static GymsScreen1DSService getInstance(){
          return new GymsScreen1DSService();
    }

    private GymsScreen1DSService() {
        super(GymsScreen1DSServiceRest.class);

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


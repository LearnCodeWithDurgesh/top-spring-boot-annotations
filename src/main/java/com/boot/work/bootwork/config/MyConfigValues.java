package com.boot.work.bootwork.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfigValues {

    @Value("${app.name}")
    private   String appName;
    @Value("${app.port}")
    private  String appPort;
    @Value("${app.database}")
    private  String appDb;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppPort() {
        return appPort;
    }

    public void setAppPort(String appPort) {
        this.appPort = appPort;
    }

    public String getAppDb() {
        return appDb;
    }

    public void setAppDb(String appDb) {
        this.appDb = appDb;
    }
}

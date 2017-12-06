package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by XiuYin.Cui on 2017/12/4.
 */
public class MongoUtil {

    private String host;
    private String port;
    private String database;
    private String username;
    private String password;

    public MongoUtil(String host, String port, String database,String username, String password) {
        this.host = host;
        this.port = port;
        this.database=database;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "MongoUtil{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", database='" + database + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

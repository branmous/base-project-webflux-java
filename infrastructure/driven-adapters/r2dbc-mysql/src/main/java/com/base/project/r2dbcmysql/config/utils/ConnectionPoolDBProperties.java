package com.base.project.r2dbcmysql.config.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConnectionPoolDBProperties {
    private int acquireRetry;
    private int minIdle;
    private int maxIdleTime;
    private int backgroundEvictionInterval;
    private String validationQuery;
}

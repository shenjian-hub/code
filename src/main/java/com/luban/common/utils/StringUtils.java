package com.luban.common.utils;

import java.util.UUID;

/**
 * @author luban
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils{


    /**
     * 生成uuid(32位)
     * @return
     */
    public static String generateUUid(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return uuid;
    }
}

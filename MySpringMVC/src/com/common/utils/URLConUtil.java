package com.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.log4j.Logger;

import com.common.constants.UserUrlCon;



public class URLConUtil {
    public static Logger logger = Logger.getLogger(SparkAPI.class);
    
    /**
     * 	云点播
     * @param URI
     * @param params
     * @return
     */
    public static String cretrieve(String URI, Map<String, String> params) {
    	//System.currentTimeMillis()获取当前时间戳
        String u = URI + "?" + QueryStringUtil.createHashedQueryString(params, System.currentTimeMillis(), UserUrlCon.C_USER_KEY);

        logger.info("retrieve " + u);

        try {
            URL url = new URL(u);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(8000);
            conn.setReadTimeout(60000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));

            StringBuffer result = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();
            return result.toString();
        } catch (MalformedURLException e) {
            logger.error("trigger失败：" + u);
        } catch (IOException e) {
            logger.error("trigger失败：" + u);
        }
        return null;
    }
    
    /**
     * 	云直播
     * @param URI
     * @param params
     * @return
     */
    public static String lretrieve(String URI, Map<String, String> params) {
    	//System.currentTimeMillis()获取当前时间戳
        String u = URI + "?" + QueryStringUtil.createHashedQueryString(params, System.currentTimeMillis(), UserUrlCon.L_USER_KEY);

        logger.info("retrieve " + u);

        try {
            URL url = new URL(u);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(8000);
            conn.setReadTimeout(60000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));

            StringBuffer result = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();
            return result.toString();
        } catch (MalformedURLException e) {
            logger.error("trigger失败：" + u);
        } catch (IOException e) {
            logger.error("trigger失败：" + u);
        }
        return null;
    }
}

package com.persistence.dao;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;



/**
 * Created by Administrator on 2018/11/28.
 */
@RestController
public class HelloSpringBoot {



    public ResponseEntity getEmployeedsdsss()
    {
        String param = "location=CN101010100&key=562f49571e3e4562bd49c32a95bf946e";
        StringBuilder sb = new StringBuilder();
        InputStream is = null;
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            //接口地址
            //https://free-api.heweather.com/s6/weather/forecast?location=CN101330101&key=562f49571e3e4562bd49c32a95bf946e
          //  https://free-api.heweather.com/s6/weather/now?
            String url = "https://free-api.heweather.com/s6/weather/now?";
            URL uri = new URL(url);

            HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("POST");
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(10000);
            connection.setRequestProperty("accept", "*/*");
            //发送参数
            connection.setDoOutput(true);
            out = new PrintWriter(connection.getOutputStream());
            out.print(param);
            out.flush();
            //接收结果
            is = connection.getInputStream();
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));


            String line;
            //缓冲逐行读取
            while ( ( line = br.readLine() ) != null ) {

                sb.append(line);
            }

            System.out.println(sb.toString());
        } catch ( Exception ignored ) {
        } finally {
            //关闭流
            try {
                if(is!=null){
                    is.close();
                }
                if(br!=null){
                    br.close();
                }
                if (out!=null){
                    out.close();
                }
            } catch ( Exception ignored ) {}
        }

        return ResponseEntity.ok(sb.toString());
    }

}

package com.roku.cloudgo.DAO.JSONDAO;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.*;

@Repository
public class JsonDao {
    public JSONObject readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            Resource resource =new ClassPathResource(fileName);

            Reader reader = new InputStreamReader(resource.getInputStream(),"UTF-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            reader.close();
            jsonStr = sb.toString();
            return JSONObject.parseObject(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

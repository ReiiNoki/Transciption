package com.iflytek.lfasr.demo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.io.*;

import java.util.List;

public class JsonToTxt {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        List<VoiceRecord> records;
        try {
            reader = new BufferedReader(new FileReader("D:\\output\\test.json"));
            StringBuffer stringBuffer = new StringBuffer();
            while (reader.ready()) {
                stringBuffer.append(reader.readLine() + "\n");
            }
            System.out.println(stringBuffer.toString());
            records = JSONObject.parseObject(stringBuffer.toString(), new TypeReference<List<VoiceRecord>>(){});
        } finally {
            reader.close();
        }

        BufferedWriter writer = null;
        File file = new File("d:\\output\\test.txt");
        //如果文件不存在，则新建一个
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //写入
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,false), "UTF-8"));
            for (VoiceRecord voiceRecord : records) {
                writer.write(voiceRecord.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件写入成功！");
    }
}

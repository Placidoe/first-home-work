package com.lx.utils;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

import static com.hankcs.hanlp.corpus.tag.Nature.e;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2024/9/12 下午10:06
 **/
@Slf4j
public class TxtIOUtils {

    static public String readTxt(String filepath) throws IOException {
        File file = new File(filepath);
        if (!file.exists()) {
            file.createNewFile();
        }
        StringBuilder res = new StringBuilder();
        try(
                FileReader fileReader = new FileReader(filepath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {

            String line;
            while((line=bufferedReader.readLine())!=null){
                res.append(line);
            }
        } catch (IOException e) {
            log.error("打开或读取文件错误");
        }finally {
            log.info("文件读取结束");
        }
        return res.toString();
    }

    static public boolean writeTxt(String content,String filepath) throws IOException {
        File file = new File(filepath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try(
                final FileWriter fileWriter = new FileWriter(filepath,true);
                final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write(content);
        } catch (Exception ex) {
            log.error("打开或写入文件错误");
        }finally {
            log.info("文件写入结束");
        }
        return true;
    }


}

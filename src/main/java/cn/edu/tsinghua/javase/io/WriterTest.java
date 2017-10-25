package cn.edu.tsinghua.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//基于 字符 的输出流
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("test1");
            writer.write("中文");
            writer.flush();//缓存的内容写到硬盘
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer != null){
                try {
                    writer.close();//如果释放了资源  不用调用write.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
package com.daqi.decorate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        创建新的文件
        FileOutputStream stream = new FileOutputStream(new File("F:/ccc.txt"));

        ProgressOutputStream gos = new ProgressOutputStream(stream);
        LogOutputStream sos = new LogOutputStream(gos);


//        在文本里写入内容
        sos.write("hahahhahahah".getBytes());
//        关闭流
        sos.close();
    }
}

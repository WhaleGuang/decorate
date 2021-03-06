package com.daqi.decorate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ProgressOutputStream extends OutputStream {
    private OutputStream os;

    public ProgressOutputStream(OutputStream outputStream){
        this.os = outputStream;
    }

    @Override
    public void write(int b) throws IOException{
        System.out.println(">-");
        this.os.write(b);
    }
}

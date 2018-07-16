package com.lv.javase.practice.IO;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: lvrongzhuan
 * @Description:IO流
 * @Date: 2018/5/28 19:09
 * @Version: 1.0
 * modified by:
 */
public class JavaIoTest {
    @Test
    public void testIo() throws FileNotFoundException {
        System.out.println(DateTimeFormatter.ofPattern("yyyymmddhhmmss").format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMddhhmmss").format(LocalDateTime.now()));
    }
}

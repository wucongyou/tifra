package com.wucongyou.tifra.ioc.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:04
 */
public class IOUtil {

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String readAll(Reader input) throws IOException {
        BufferedReader br = new BufferedReader(input);
        int c;
        char[] buf = new char[8];
        StringBuilder sb = new StringBuilder();
        while ((c = br.read(buf)) != -1) {
            for (int i = 0; i < c; i++) {
                sb.append(buf[i]);
            }
        }
        return sb.toString();
    }
}

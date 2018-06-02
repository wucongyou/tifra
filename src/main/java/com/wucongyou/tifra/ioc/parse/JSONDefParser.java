package com.wucongyou.tifra.ioc.parse;

import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wucongyou.tifra.ioc.exception.ParseException;
import com.wucongyou.tifra.ioc.io.Resource;
import com.wucongyou.tifra.ioc.util.IOUtil;

/**
 * @author congyou.wu
 * @since 2018-06-02 14:50
 */
public class JSONDefParser implements Parser {

    private static final Gson GSON = new GsonBuilder().create();

    public IOCConf parse(Resource resource) {
        Reader input = null;
        try {
            input = resource.reader();
            String content = IOUtil.readAll(input);
            return GSON.fromJson(content, IOCConf.class);
        } catch (IOException e) {
            throw new ParseException("failed to parse input resource", e);
        } finally {
            IOUtil.closeQuietly(input);
        }
    }
}

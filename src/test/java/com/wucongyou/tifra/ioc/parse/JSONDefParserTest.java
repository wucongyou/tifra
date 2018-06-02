package com.wucongyou.tifra.ioc.parse;

import org.junit.Test;

import com.wucongyou.tifra.ioc.io.ClasspathFileResource;
import com.wucongyou.tifra.ioc.io.Resource;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:24
 */
public class JSONDefParserTest {

    @Test
    public void parse() {
        Parser parser = new JSONDefParser();
        Resource resource = new ClasspathFileResource("bean.json");
        IOCConf conf = parser.parse(resource);
        System.out.println(conf);
    }
}

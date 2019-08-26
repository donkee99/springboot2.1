package com.donkee;

import com.donkee.comm.BookProperties;
import com.donkee.comm.OtherProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${book.title}")
    private String title;
    @Value("${msg.info}")
    private String info;
    @Resource
    private BookProperties properties;
    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testSingle() {
        System.out.println("info:"+info);
        System.out.println("title:"+title);
        System.out.println("title:"+properties.getTitle());
        Assert.assertEquals(title,"纯洁的微笑");
    }

    @Test
    public void testMore() throws Exception {
        System.out.println("title:"+properties.getTitle());
        System.out.println("description:"+properties.getDescription());
    }

    @Test
    public void testOther() throws Exception {
        System.out.println("title:"+otherProperties.getTitle());
        System.out.println("blog:"+otherProperties.getBlog());
    }

}

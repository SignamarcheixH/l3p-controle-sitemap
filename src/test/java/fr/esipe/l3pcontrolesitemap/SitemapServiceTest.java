package fr.esipe.l3pcontrolesitemap;

import org.junit.Assert;
import org.junit.Test;
import service.Sitemap;
import service.SitemapService;

public class SitemapServiceTest {
    private SitemapService sitemapService = new SitemapService();

    @Test
    public void xml2java_nominal(){
        //GIVEN
        String xml = getClass().getResourceAsStream("/sitemap.xml").toString();
        //WHEN
        Sitemap actual = sitemapService.xml2java(xml);
        //THEN
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void java2xml_nominal(){
        //GIVEN
        Sitemap sitemap  = new Sitemap();
        //WHEN
        String actual = sitemapService.java2xml(sitemap);
        //THEN
        Assert.assertEquals(expected, actual);
    }
}

package service;

import org.springframework.stereotype.Component;

import javax.xml.bind.*;
import java.io.File;

import java.io.StringReader;
import java.util.List;

@Component
public class SitemapService {

    public Sitemap xml2java(String xml) {
        try
        {

            JAXBContext jaxbContext = JAXBContext.newInstance(Sitemap.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Sitemap sitemap = (Sitemap) jaxbUnmarshaller.unmarshal(new StringReader(xml));
            return sitemap;
        } catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }


    public String  java2xml(Sitemap sitemap) {
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Sitemap.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("resources/sitemap.xml");
            jaxbMarshaller.marshal(sitemap, file);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return getClass().getResourceAsStream("resources/sitemap.xml").toString();
    }
}

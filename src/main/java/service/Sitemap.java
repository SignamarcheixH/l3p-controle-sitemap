package service;//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.04.16 à 05:06:39 PM CEST 
//


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlset">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="url">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="xlmns" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "urlset"
})
@XmlRootElement(name = "sitemap")
public class Sitemap {

    @XmlElement(required = true)
    protected Sitemap.Urlset urlset;

    /**
     * Obtient la valeur de la propriété urlset.
     * 
     * @return
     *     possible object is
     *     {@link Sitemap.Urlset }
     *     
     */
    public Sitemap.Urlset getUrlset() {
        return urlset;
    }

    /**
     * Définit la valeur de la propriété urlset.
     * 
     * @param value
     *     allowed object is
     *     {@link Sitemap.Urlset }
     *     
     */
    public void setUrlset(Sitemap.Urlset value) {
        this.urlset = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="url">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="xlmns" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "url"
    })
    public static class Urlset {

        @XmlElement(required = true)
        protected Sitemap.Urlset.Url url;
        @XmlAttribute(name = "xlmns")
        protected String xlmns;

        /**
         * Obtient la valeur de la propriété url.
         * 
         * @return
         *     possible object is
         *     {@link Sitemap.Urlset.Url }
         *     
         */
        public Sitemap.Urlset.Url getUrl() {
            return url;
        }

        /**
         * Définit la valeur de la propriété url.
         * 
         * @param value
         *     allowed object is
         *     {@link Sitemap.Urlset.Url }
         *     
         */
        public void setUrl(Sitemap.Urlset.Url value) {
            this.url = value;
        }

        /**
         * Obtient la valeur de la propriété xlmns.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXlmns() {
            return xlmns;
        }

        /**
         * Définit la valeur de la propriété xlmns.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXlmns(String value) {
            this.xlmns = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "loc",
            "lastmod"
        })
        public static class Url {

            @XmlElement(required = true)
            protected String loc;
            @XmlElement(required = true)
            protected String lastmod;

            /**
             * Obtient la valeur de la propriété loc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoc() {
                return loc;
            }

            /**
             * Définit la valeur de la propriété loc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoc(String value) {
                this.loc = value;
            }

            /**
             * Obtient la valeur de la propriété lastmod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastmod() {
                return lastmod;
            }

            /**
             * Définit la valeur de la propriété lastmod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastmod(String value) {
                this.lastmod = value;
            }

        }

    }

}

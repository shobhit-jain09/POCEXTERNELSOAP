//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.03 at 05:56:47 PM IST 
//


package com.example.howtodoinjava.schemas.school;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Completed" type="{http://xmlns3.bayer.com/ProcessedMCMPService}mcmpRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Errored" type="{http://xmlns3.bayer.com/ProcessedMCMPService}mcmpRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InProgess" type="{http://xmlns3.bayer.com/ProcessedMCMPService}mcmpRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataArea", propOrder = {
    "completed",
    "errored",
    "inProgess"
})
public class DataArea {

    @XmlElement(name = "Completed")
    protected List<McmpRecord> completed;
    @XmlElement(name = "Errored")
    protected List<McmpRecord> errored;
    @XmlElement(name = "InProgess")
    protected List<McmpRecord> inProgess;

    /**
     * Gets the value of the completed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompleted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link McmpRecord }
     * 
     * 
     */
    public List<McmpRecord> getCompleted() {
        if (completed == null) {
            completed = new ArrayList<McmpRecord>();
        }
        return this.completed;
    }

    /**
     * Gets the value of the errored property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errored property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrored().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link McmpRecord }
     * 
     * 
     */
    public List<McmpRecord> getErrored() {
        if (errored == null) {
            errored = new ArrayList<McmpRecord>();
        }
        return this.errored;
    }

    /**
     * Gets the value of the inProgess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inProgess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInProgess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link McmpRecord }
     * 
     * 
     */
    public List<McmpRecord> getInProgess() {
        if (inProgess == null) {
            inProgess = new ArrayList<McmpRecord>();
        }
        return this.inProgess;
    }

}

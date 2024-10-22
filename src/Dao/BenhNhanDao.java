/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import model.BenhNhan;
/**
 *
 * @author ducta
 */
public class BenhNhanDao {
    public static void main(String[] args){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            
            Element BenhNhan = doc.createElement("BenhNhan");
            doc.appendChild(BenhNhan);
            
            TransformerFactory tff = TransformerFactory.newInstance();
            try {
                Transformer tf = tff.newTransformer();
                tf.setOutputProperty(OutputKeys.INDENT, "yes");
                tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult("src/XML/BenhNhan.xml");
                try {
                    tf.transform(source, result);
                    System.out.println("Ghi file thanh cong");
                } catch (TransformerException ex) {
                    Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writeExam(Document doc, Element BenhNhan, BenhNhan bn) {
        Element Id = doc.createElement("Id");
        Element name = doc.createElement("name");
        Element age = doc.createElement("age");
        Element diachi = doc.createElement("diachi");
        Element phone = doc.createElement("phone");
        
        Id.appendChild(name);
        Id.appendChild(age);
        Id.appendChild(diachi);
        Id.appendChild(phone);
        BenhNhan.appendChild(Id);
    }
}

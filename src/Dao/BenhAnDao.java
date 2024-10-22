package Dao;

import model.BenhAn;
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
import java.io.File;
import java.util.Date;

public class BenhAnDao {

    public void writeExam(BenhAn ba) {
    try {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc;

        File xmlFile = new File("src/XML/BenhAn.xml");
        if (xmlFile.exists()) {
            // Nếu tệp đã tồn tại, tải nó
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
        } else {
            // Nếu tệp không tồn tại, tạo mới
            doc = db.newDocument();
            Element rootElement = doc.createElement("BenhAns");
            doc.appendChild(rootElement);
        }

        // Tạo phần tử BenhAn
        Element benhAnElement = doc.createElement("BenhAn");

        // Tạo các phần tử con
        Element idElement = doc.createElement("Id");
        idElement.setTextContent(String.valueOf(ba.getID()));
        Element trieuChungElement = doc.createElement("TrieuChung");
        trieuChungElement.setTextContent(ba.getTrieuChung());
        Element chanDoanElement = doc.createElement("ChanDoan");
        chanDoanElement.setTextContent(ba.getChanDoan());
        Element chiDinhElement = doc.createElement("ChiDinh");
        chiDinhElement.setTextContent(ba.getChiDinh());
        Element ketLuanElement = doc.createElement("KetLuan");
        ketLuanElement.setTextContent(ba.getKetLuan());
        Element donThuocElement = doc.createElement("DonThuoc");
        donThuocElement.setTextContent(ba.getDonThuoc());
        Element ngayKhamElement = doc.createElement("NgayKham");
        ngayKhamElement.setTextContent(ba.getNgayKhamString()); // Sử dụng phương thức để định dạng ngày

        // Thêm các phần tử con vào BenhAn
        benhAnElement.appendChild(idElement);
        benhAnElement.appendChild(trieuChungElement);
        benhAnElement.appendChild(chanDoanElement);
        benhAnElement.appendChild(chiDinhElement);
        benhAnElement.appendChild(ketLuanElement);
        benhAnElement.appendChild(donThuocElement);
        benhAnElement.appendChild(ngayKhamElement);

        // Thêm BenhAn vào tài liệu
        doc.getDocumentElement().appendChild(benhAnElement);

        // Ghi lại vào tệp XML
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(xmlFile);
        tf.transform(source, result);
        System.out.println("Ghi file thành công");

    } catch (ParserConfigurationException ex) {
        Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
    } catch (TransformerConfigurationException ex) {
        Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
    } catch (TransformerException ex) {
        Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(BenhAnDao.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}

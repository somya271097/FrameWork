package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchingDtaFromPDF {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("./src/test/resources/multipage-pdf.pdf");
		PDDocument pdDoc = PDDocument.load(file);
		
		int Pages=pdDoc.getNumberOfPages();//print number of pages present in pdf
		//System.out.println(Pages);
		
		PDFTextStripper data = new PDFTextStripper();
		String read = data.getText(pdDoc);//to read the entire pdf
		// System.out.println(read);
		
		//data.setStartPage(3);
		//String pageData = data.getText(pdDoc);//start reading from particular page and followed
		//System.out.println(pageData);
		
		data.setStartPage(3);//start reading ffrom 3 and read 4 also as it ends
		data.setEndPage(4);
		String pageData = data.getText(pdDoc);
		System.out.println(pageData);
		
	}

}

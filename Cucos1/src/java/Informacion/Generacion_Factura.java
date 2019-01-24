/*
 *
 */
package Informacion;


import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Maicol Pulido
 */
public class Generacion_Factura {
   
    public void GenerarPDF() throws FileNotFoundException, IOException {                                         
        
        String ruta= "C:\\Users\\Maicol Pulido\\Downloads\\factura";
        String[] texto = generarContenido();
        String contenido = "Factura de compra\n" + "ID: " + texto[3]  + "\nNombre: " + texto[0]
                +"\nTelefono: "  + texto[1] + "\nDireccion: " + texto[2] + "\nArticulo: " + texto[6] 
                + "\nCantidad: " + texto[7] + "\nValor unitario: " + texto[4] + "\nTotal: " + texto[5];
        try
        {
            FileOutputStream archivo= new FileOutputStream(ruta + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
        
        } catch(Exception e){
            System.out.println("ERROR!!!, No se  pudo general el PDF : "+ e);
        } 
    }
    
    private String[] generarContenido() throws FileNotFoundException, IOException
    {
        Guardar guardar = new Guardar();
        String texto = guardar.leer();
        
        String[] array1 = texto.split("\n");
        
        String[] contenido = array1[array1.length - 1].split(";");
        
        return contenido;
    }
}

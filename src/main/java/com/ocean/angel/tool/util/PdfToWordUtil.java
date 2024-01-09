package com.ocean.angel.tool.util;

import com.aspose.pdf.DocSaveOptions;
import com.aspose.pdf.Document;

/**
 * PDF文件转Word
 */
public class PdfToWordUtil {

    /**
     * PDF转Word方法
     * @param pdfFilePath 源文件路径
     * @param wordFilePath 目标文件路径
     */
    public static void handler(String pdfFilePath, String wordFilePath) {
        Document pdfDocument = new Document(pdfFilePath);
        DocSaveOptions saveOptions = new DocSaveOptions();
        saveOptions.setFormat(DocSaveOptions.DocFormat.DocX);
        pdfDocument.save(wordFilePath, saveOptions);
    }

}

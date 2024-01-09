package com.ocean.angel.tool.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class PdfToWordUtilTest {

    @Test
    void handler() {

        // 系统根目录
        String rootDir = System.getProperty("user.dir");

        // PDF文件位置
        String sourcePath = rootDir + "\\src\\main\\resources\\pdf\\11.pdf";

        // PDF转成word文件存放的位置
        String targetPath = rootDir + "\\src\\main\\resources\\word\\11.docx";

        try {
            long startTime = System.currentTimeMillis();
            PdfToWordUtil.handler(sourcePath, targetPath);
            long endTime = System.currentTimeMillis();
            log.info("PDF转word成功， 耗时{}秒", (endTime - startTime) / 1000);
        } catch (Exception e) {
            log.info("PdfToWordUtil.handler() error. {}", e.getMessage(), e);
        }
    }
}
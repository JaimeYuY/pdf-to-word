# 使用Aspose.PDF将PDF文件转成Word
Aspose.PDF是一个功能强大的Java库，用于处理PDF文件。它提供了广泛的功能，包括创建、操作和转换 PDF 文档，以及提取文本、图像和元数据等。
## 使用 Aspose.PDF，你可以做以下事情
1. PDF文档创建和操作： 创建新的PDF文档、编辑和修改现有的PDF文件，添加、删除和更新页面、文本、图像、链接等。
2. PDF转换： 将PDF文件转换为其他格式，比如将 PDF 转为 Word、Excel、HTML、图像等。
3. PDF提取和编辑： 从PDF中提取文本内容、图像、元数据等信息，并且可以进行编辑和处理。
4. PDF加密和安全性： 添加密码保护、数字签名以及其他安全功能以保护 PDF 文件。

## 使用指南
1. 引入本地/lib/aspose-pdf-23.1.jar包，可以使用如下maven指令：
```agsl
mvn install:install-file -Dfile=D:\my\study\pdf-to-word\lib\aspose-pdf-23.1.jar -DgroupId=com.aspose -DartifactId=aspose-pdf -Dversion=23.1 -Dpackaging=jar
```
将改路径D:\my\study\pdf-to-word\lib\aspose-pdf-23.1.jar替换成自己的aspose-pdf-23.1.jar文件路径

2. 将aspose-pdf jar包引入到pom中，如下：
```agsl
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-pdf</artifactId>
    <version>23.1</version>
</dependency>
```
3. 设置PDF文件位置，设置生成Word文件的位置，运行PdfToWordUtilTest.handler()方法，执行PDF转word操作。
4. 查看生成的word文件

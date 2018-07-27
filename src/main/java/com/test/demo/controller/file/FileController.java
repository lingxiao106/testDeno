package com.test.demo.controller.file;

import org.apache.commons.io.IOUtils;
import org.apache.tomcat.jni.FileInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
@RequestMapping("/file")
public class FileController {

    private String path = "D:\\";

    @PostMapping("/upload")
    public String upload(MultipartFile file) throws Exception {
        File localFile = new File(path, file.getOriginalFilename());

        file.transferTo(localFile);

        return "下载成功";
    }

    @GetMapping("/download/{id}")
    public void downLoad(@PathVariable String id, HttpServletResponse response, HttpServletRequest request) {
        try (InputStream is = new FileInputStream(new File(path, id + ".jpg")); OutputStream os = response.getOutputStream()) {
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=" + id + ".jpg");
            IOUtils.copy(is,os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.duiya.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUpload {

    @RequestMapping("/fileUpload")
    public Map<String, Object> fileUpload(MultipartFile filename) throws Exception{
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("/Users/duiya/123.png"));
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "ok");
        return map;

    }
}

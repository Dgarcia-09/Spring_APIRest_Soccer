package com.in5bm.soccerfieldmanager.services;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryService {


    @Autowired
    private Cloudinary cloudinary;

    public Map<String, Object> uploadImg(MultipartFile file, String folder) throws IOException{
        String orginalFileName = file.getOriginalFilename();

        if(orginalFileName == null){
            throw new IllegalArgumentException("El archivo no puede estar nulo");
        }

        //Foto.|png, jpg
        String newName = orginalFileName.substring(0, orginalFileName.lastIndexOf('.'));

        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        String fileName = newName + "_" + timestamp;

        @SuppressWarnings("uncheked")

        Map<String, Object> uploadResult = ( Map<String, Object>) cloudinary.uploader().upload(file.getBytes(), ObjectUtils.asMap(
            "folder", folder,
            "public_id", fileName


        ));

        Return uploadResult;
        
    }

}

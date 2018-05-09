/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 2/25/2018
 * Time: 11:29 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;

@RestController
@RequestMapping("/api/tillboxweb/fileAttachment/")
@Api(description = "Author: Salahin")
public class FileUploaderController {

    //@PostMapping("/image")
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam("file") MultipartFile file)
    {
        if (!file.isEmpty())
        {
            String name = file.getOriginalFilename();
            try
            {
                byte[] bytes = file.getBytes();
                Files.write(new File(name).toPath(), bytes);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return "redirect:/fileUpload";
    }
}

package com.cmk.currency.finance.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ReadBuildService {

    public void readBuildID() throws IOException
    {
        Resource resource = new ClassPathResource("classpath:\\temp\\exchange\\buildID.txt");
        InputStream inputStream = resource.getInputStream();

        try {
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            String data = new String(bdata, StandardCharsets.UTF_8);
            System.out.println("Data:   "+data);
        } catch (IOException e) {
            System.out.println("IOException"+ e);
        }
    }
}

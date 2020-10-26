package com.cmk.currency.finance.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ReadBuildService {

    void readBuildID() throws IOException
    {
    Resource resource = new ClassPathResource("classpath:\\temp\\exchange\\buildID.txt");
    InputStream inputStream = resource.getInputStream();
    }
}

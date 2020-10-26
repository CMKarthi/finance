package com.cmk.currency.finance;

import com.cmk.currency.finance.service.ReadBuildService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FinanceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FinanceApplication.class, args);
		ReadBuildService readBuildService = new ReadBuildService();
		readBuildService.readBuildID();
	}

}

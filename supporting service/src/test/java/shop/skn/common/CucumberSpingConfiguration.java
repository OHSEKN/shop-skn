package shop.skn.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.skn.SupportingServiceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingServiceApplication.class })
public class CucumberSpingConfiguration {}

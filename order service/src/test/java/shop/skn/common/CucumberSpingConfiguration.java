package shop.skn.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.skn.OrderServiceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderServiceApplication.class })
public class CucumberSpingConfiguration {}

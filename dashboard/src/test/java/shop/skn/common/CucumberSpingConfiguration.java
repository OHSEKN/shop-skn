package shop.skn.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.skn.DashboardApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboardApplication.class })
public class CucumberSpingConfiguration {}

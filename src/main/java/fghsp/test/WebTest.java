package fghsp.test;

import java.sql.Statement;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class WebTest {

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	ReadData connServer = new ReadData();
		Statement statement = connServer.getDatabaseConnection(
				"jdbc:sqlserver://RMUMCSHSQL4\\INST3;databaseName=TST_FGHR_SolutionMap;integratedSecurity=true;", "",
				"");
        return connServer.getSolutionData(statement);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebTest.class, args);
    }
}
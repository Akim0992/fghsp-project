//package fghsp.test;
//
//import java.sql.Statement;
//
//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;
//
//
//@Controller
//@EnableAutoConfiguration
//public class WebTest {
//
//    @RequestMapping("/getSolution")
//    @ResponseBody
//    String home() {
//    	ReadData connServer = new ReadData();
//		Statement statement = connServer.getDatabaseConnection(
//				"jdbc:sqlserver://RMUMCSHSQL4\\INST3;databaseName=TST_FGHR_SolutionMap;integratedSecurity=true;", "",
//				"");
//        return connServer.getSolutionData(statement);
//    }
//    
//    @RequestMapping(value = "/getComponentDataForTable" , params = {"id"})
//    @ResponseBody
//    String getComponentDataForTable(@RequestParam(value = "id") String id) {
//    	
//    	ReadData connServer = new ReadData();
//		Statement statement = connServer.getDatabaseConnection(
//				"jdbc:sqlserver://RMUMCSHSQL4\\INST3;databaseName=TST_FGHR_SolutionMap;integratedSecurity=true;", "",
//				"");
//        return connServer.getComponentDataForTable(statement, id);
//    }
//    
//    @RequestMapping(value = "/getSolutionContacts" , params = {"id"})
//    @ResponseBody
//    String getSolutionContacts(@RequestParam(value = "id") String id) {
//    	
//    	ReadData connServer = new ReadData();
//		Statement statement = connServer.getDatabaseConnection(
//				"jdbc:sqlserver://RMUMCSHSQL4\\INST3;databaseName=TST_FGHR_SolutionMap;integratedSecurity=true;", "",
//				"");
//        return connServer.getSolutionContacts(statement, id);
//    }
//    
//    @RequestMapping(value = "/getComponentContacts" , params = {"id"})
//    @ResponseBody
//    String getComponentContacts(@RequestParam(value = "id") String id) {
//    	
//    	ReadData connServer = new ReadData();
//		Statement statement = connServer.getDatabaseConnection(
//				"jdbc:sqlserver://RMUMCSHSQL4\\INST3;databaseName=TST_FGHR_SolutionMap;integratedSecurity=true;", "",
//				"");
//        return connServer.getComponentContacts(statement, id);
//    }
//    
////    
////    public static void main(String[] args) throws Exception {
////        SpringApplication.run(WebTest.class, args);
////    }
//}
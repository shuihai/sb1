//package xiaoming.sb1.test;
//
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@WebAppConfiguration
//public class ControllerTest {
//
//    @Autowired
//    WebApplicationContext wac;
//
//    public MockMvc mvc;
//
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
//    }
//
//
//    @Test
//    public void getColNameUserCountTest() {
//        RequestBuilder request = null;
//        request = MockMvcRequestBuilders.post("/ajaxtest/test4") ;
//        try {
//            mvc.perform(request)
//                    .andExpect(MockMvcResultMatchers.status().isOk())
//                     .andExpect(MockMvcResultMatchers.jsonPath("$.data" ).value("[{\"colid\":\"000000010001000500260017\",\"colName\":\"视频窗\",\"num\":170318}]") );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void getVodNameUserCountTest() {
//        RequestBuilder request = null;
//        request = MockMvcRequestBuilders.post("/getVodNameUserCount").param("begintime", "20180801")
//                .param("endtime", "20180816")
//                .param("colName", "视频窗");
//        try {
//            mvc.perform(request)
//                    .andExpect(MockMvcResultMatchers.status().isOk())
//                    .andExpect(MockMvcResultMatchers.jsonPath("$"  ) .value("[{\"colid\":\"000000010001000500260017\",\"colName\":\"视频窗\",\"num\":170318}]") );
//
////                    .andExpect(MockMvcResultMatchers.jsonPath("$.result.length()" ).value("12567"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}

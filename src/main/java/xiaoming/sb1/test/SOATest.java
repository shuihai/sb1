//package xiaoming.sb1.test;
//
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
////用于普通springmvc（非springboot）框架的测试
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:appServlet/servlet-context.xml"})
//public class SOATest {
//
//    @Autowired
//    WebApplicationContext context;
//
//    //虚拟MVC请求，获取得到处理结果
//    MockMvc mockMvc;
//
//    @Before
//    public void initMokcMvc() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//
//    @Test
//    public void testPage() throws Exception {
//        //模拟请求，得到返回值
//        MvcResult mvcResult =mockMvc.perform(MockMvcRequestBuilders.get("/SOAManager/getFacttabel_Result").param("factName","NEW")
//                .param("start","0")
//                .param("length","10"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.data[1].FID").value(436))
//                .andReturn();
//        System.out.println(mvcResult.getResponse().getContentAsString());
//    }
//
//
//}

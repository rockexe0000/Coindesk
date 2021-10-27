package com.coindesk.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@AutoConfigureMockMvc
class CoinDeskControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void testGetCurrentPrice() throws Exception {
    mockMvc.perform(get("/coindesk/show").accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()).andDo(print());
  }

  @Test
  void testGetTransformCurrentPrice() throws Exception {
    mockMvc.perform(get("/coindesk/transform").accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()).andDo(print());
  }

}

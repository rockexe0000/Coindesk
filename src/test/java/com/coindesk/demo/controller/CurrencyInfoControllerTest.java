package com.coindesk.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
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
class CurrencyInfoControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void testAddCurrencyInfo() throws Exception {
    mockMvc
        .perform(post("/currencyinfo/add").content("{\"code\":\"TEST\",\"name\":\"測試\"}")
            .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()).andDo(print());
  }

  @Test
  void testGetCurrencyInfo() throws Exception {

    mockMvc
        .perform(post("/currencyinfo/add").content("{\"code\":\"TEST2\",\"name\":\"測試2\"}")
            .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()).andDo(print());

    mockMvc.perform(get("/currencyinfo/get").param("id", "2")).andExpect(status().isOk())
        .andDo(print());
  }

  @Test
  void testGetAllCurrencyInfo() throws Exception {
    mockMvc.perform(get("/currencyinfo/getall")).andExpect(status().isOk()).andDo(print());
  }

  @Test
  void testModifyCurrencyInfo() throws Exception {
    mockMvc
        .perform(put("/currencyinfo/modify").content("{\"id\":1,\"code\":\"GBP\",\"name\":\"測試\"}")
            .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()).andDo(print());
  }

  @Test
  void testDeleteCurrencyInfo() throws Exception {

    mockMvc
        .perform(post("/currencyinfo/add").content("{\"code\":\"TEST\",\"name\":\"測試\"}")
            .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk()).andDo(print());

    mockMvc.perform(delete("/currencyinfo/delete").param("id", "1")).andExpect(status().isOk())
        .andDo(print());
  }

}

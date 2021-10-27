package com.coindesk.demo.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.coindesk.demo.service.CoinDeskService;

@SpringBootTest
class CoinDeskServiceImplTest {
  @Autowired
  CoinDeskService coinDeskService;

  @Test
  void testCallCoinDeskApi() {
    System.out.println(coinDeskService.callCoinDeskApi());
  }

}

package com.coindesk.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coindesk.demo.service.CoinDeskService;
import com.coindesk.demo.vo.CurrentPrice;
import com.coindesk.demo.vo.CurrentPriceResponse;

@RestController
@RequestMapping("coindesk")
public class CoinDeskController {
  @Autowired
  private CoinDeskService coinDeskService;

  @GetMapping("show")
  public CurrentPriceResponse getCurrentPrice() {
    return coinDeskService.callCoinDeskApi();
  }

  @GetMapping("transform")
  public CurrentPrice getTransformCurrentPrice() {
    return coinDeskService.findCurrentPrice();
  }

}

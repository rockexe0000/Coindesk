package com.coindesk.demo.service;

import com.coindesk.demo.vo.CurrentPrice;
import com.coindesk.demo.vo.CurrentPriceResponse;

public interface CoinDeskService {

  CurrentPrice getCurrentPrice();

  CurrentPriceResponse callCoinDeskApi();

}

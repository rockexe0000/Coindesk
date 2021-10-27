package com.coindesk.demo.service.impl;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.coindesk.demo.entity.CurrencyInfo;
import com.coindesk.demo.service.CoinDeskService;
import com.coindesk.demo.service.CurrencyInfoService;
import com.coindesk.demo.vo.CurrentPrice;
import com.coindesk.demo.vo.CurrentPriceResponse;
import com.coindesk.demo.vo.Price;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CoinDeskServiceImpl implements CoinDeskService {
  @Autowired
  private CurrencyInfoService currencyInfoService;
  @Value("${url}")
  private String url;

  @Override
  public CurrentPrice getCurrentPrice() {
    CurrentPriceResponse resp = callCoinDeskApi();
    CurrentPrice currentPrice = null;
    try {
      currentPrice = convert(resp);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return currentPrice;
  }

  @Override
  public CurrentPriceResponse callCoinDeskApi() {
    HttpClient httpClient = HttpClients.createDefault();
    HttpResponse httpResponse = null;
    String result = "";
    HttpGet httpGet = new HttpGet(url);
    CurrentPriceResponse resp = null;
    try {
      httpResponse = httpClient.execute(httpGet);
      HttpEntity httpEntity = httpResponse.getEntity();
      if (httpEntity != null) {
        result = EntityUtils.toString(httpEntity, "utf-8");
      }
      ObjectMapper mapper = new ObjectMapper();
      resp = mapper.readValue(result, CurrentPriceResponse.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return resp;
  }

  private CurrentPrice convert(CurrentPriceResponse resp) throws ParseException {
    CurrentPrice currentPrice = new CurrentPrice();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
    currentPrice.setUpdateTime(df.parse(resp.getTime().getUpdatedISO()));
    List<Price> list = new LinkedList<>();
    for (CurrencyInfo currencyInfo : currencyInfoService.findAll()) {
      Price price = new Price();
      switch (currencyInfo.getCode()) {
        case "USD":
          if (resp.getBpi().getUsd() != null) {
            // price.setId(currencyInfo.getId());
            price.setCode(currencyInfo.getCode());
            price.setName(currencyInfo.getName());
            price.setPrice(resp.getBpi().getUsd().getRate_float());
            list.add(price);
          }
          break;
        case "GBP":
          if (resp.getBpi().getGbp() != null) {
            // price.setId(currencyInfo.getId());
            price.setCode(currencyInfo.getCode());
            price.setName(currencyInfo.getName());
            price.setPrice(resp.getBpi().getGbp().getRate_float());
            list.add(price);
          }
          break;
        case "EUR":
          if (resp.getBpi().getEur() != null) {
            // price.setId(currencyInfo.getId());
            price.setCode(currencyInfo.getCode());
            price.setName(currencyInfo.getName());
            price.setPrice(resp.getBpi().getEur().getRate_float());
            list.add(price);
          }
          break;
      }
    }
    currentPrice.setPriceList(list);
    return currentPrice;
  }

}

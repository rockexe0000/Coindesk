package com.coindesk.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.coindesk.demo.entity.CurrencyInfo;
import com.coindesk.demo.service.CurrencyInfoService;

@RestController
@RequestMapping("currencyinfo")
public class CurrencyInfoController {
  @Autowired
  private CurrencyInfoService currencyInfoService;

  @PostMapping("add")
  public CurrencyInfo addCurrencyInfo(@RequestBody CurrencyInfo currencyInfo) {
    return currencyInfoService.addCurrencyInfo(currencyInfo);
  }

  @GetMapping("get")
  public CurrencyInfo getCurrencyInfo(@RequestParam(required = true) Integer id) {
    return currencyInfoService.getCurrencyInfo(id);
  }

  @GetMapping("getall")
  public List<CurrencyInfo> getAllCurrencyInfo() {
    return currencyInfoService.getAllCurrencyInfo();
  }

  @PutMapping("modify")
  public CurrencyInfo modifyCurrencyInfo(@RequestBody CurrencyInfo currencyInfo) {
    return currencyInfoService.modifyCurrencyInfo(currencyInfo);
  }

  @DeleteMapping("delete")
  public String deleteCurrencyInfo(@RequestParam(required = true) Integer id)
      throws IllegalAccessException {
    currencyInfoService.deleteCurrencyInfo(id);
    return "Success";
  }
}

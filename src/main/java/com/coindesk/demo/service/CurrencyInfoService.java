package com.coindesk.demo.service;

import java.util.List;
import com.coindesk.demo.entity.CurrencyInfo;

public interface CurrencyInfoService {

  /**
   * 新增幣別信息
   * 
   * @param currencyInfo
   * @return
   */
  CurrencyInfo addCurrencyInfo(CurrencyInfo currencyInfo);

  /**
   * 查詢幣別信息
   * 
   * @param id
   * @return
   */
  CurrencyInfo getCurrencyInfo(int id);

  /**
   * 查詢所有幣別信息
   * 
   * @return
   */
  List<CurrencyInfo> getAllCurrencyInfo();

  /**
   * 修改幣別信息
   * 
   * @param currencyInfo
   * @return
   */
  CurrencyInfo modifyCurrencyInfo(CurrencyInfo currencyInfo);

  /**
   * 刪除幣別信息
   * 
   * @param id
   * @return
   * @throws IllegalAccessException
   */
  void deleteCurrencyInfo(Integer id) throws IllegalAccessException;

  /**
   * 依code查詢幣別信息
   * 
   * @param code
   * @return
   */
  CurrencyInfo findCurrencyInfoByCode(String code);

  /**
   * 查詢所有幣別信息
   * 
   * @return
   */
  List<CurrencyInfo> findAll();

}

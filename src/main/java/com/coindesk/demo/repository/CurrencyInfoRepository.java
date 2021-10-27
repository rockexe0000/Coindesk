package com.coindesk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coindesk.demo.entity.CurrencyInfo;

@Repository
public interface CurrencyInfoRepository extends JpaRepository<CurrencyInfo, Integer>{

	/**
	 * 依幣別代碼查詢
	 * 
	 * @param code
	 * @return
	 */
	CurrencyInfo findByCode(String code);

}

package com.cognizant.ormlearn.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;
@Repository
public interface StockRepository extends CrudRepository<Stock, String> {
	
	List<Stock> findByCodeAndDateBetween(String code,Date dt1,Date dt2);
	List<Stock> findByCodeAndCloseGreaterThan(String code,BigDecimal close);
	List<Stock> findTop3ByOrderByVolumeDesc();
	List<Stock> findTop3ByCodeOrderByClose(String code);
	
}



/*@Query(value="select * from stock where st_code='FB' and st_date between '2019-09-01' and '2019-09-30'",nativeQuery=true)
public List<Stock> findByDate();
@Query(value="select * from stock where st_code='GOOGL' and st_close>1250",nativeQuery=true)
public List<Stock> findByGoogle();
@Query(value="select * from stock order by st_volume desc limit 3",nativeQuery=true)
public List<Stock> findMax();
@Query(value="select * from stock where st_code='NFLX' order by st_close limit 3",nativeQuery=true)
public List<Stock> findLowest();*/

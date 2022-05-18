package cn.keyrisk.ftp.v1;


import static cn.keyrisk.ftp.v1.Errors.OK;

import cn.keyrisk.ftp.service.CurrencyService;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ftp/currency")
public class CurrencyControl {

  final CurrencyService service;

  public CurrencyControl(CurrencyService service) {
    this.service = service;
  }

  @GetMapping()
  public ResponseWrapper<Currency> queryAll(@RequestParam Map<String,String> map,
      Pageable pageable){
    Utils.purify(map);
    Page<Currency> datas = service.search(map, pageable);
    return ResponseWrapper.<Currency>builder().build(datas);
  }

  @PutMapping()
  public ResponseWrapper<Currency> saveCurrency(@RequestBody Currency currency){

    service.save(currency);

    return ResponseWrapper.empty(OK,"执行成功!");
  }

  @PatchMapping("{id}")
  public ResponseWrapper<Currency> updateCurrency(@PathVariable("id") Long id, @RequestBody Currency currency){
    Currency data = service.load(id);
    if(data == null){
      return null;
    }
    if(currency.getIsoCurrencyCd() != null){
      data.setIsoCurrencyCd(currency.getIsoCurrencyCd());
    }
    if(currency.getCurrencyName() != null){
      data.setCurrencyName(currency.getCurrencyName());
    }
    if(currency.getStatus() != null){
      data.setCurrencyStatusCd(currency.getStatus());
    }
    if(currency.getReportingFlg() != null){
      data.setReportingFlg(currency.getReportingFlg());
    }
    service.save(data);

    return ResponseWrapper.empty(OK,"执行成功!");
  }


  @PatchMapping("status")
  public ResponseWrapper<Currency> updateCurrency(@RequestBody CurrencyBatchPartialUpdateRequest req){

    for (Long id : req.getIds()) {
      Currency data = service.load(id);
      data.setCurrencyStatusCd(req.getData().getStatus());
      service.save(data);
    }
    return ResponseWrapper.empty(OK,"执行成功!");
  }

}

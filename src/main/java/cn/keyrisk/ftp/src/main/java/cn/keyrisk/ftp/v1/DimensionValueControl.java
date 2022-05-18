package cn.keyrisk.ftp.v1;

import static cn.keyrisk.ftp.v1.Errors.OK;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.keyrisk.ftp.service.DimensionValueService;


@RestController
@RequestMapping("/ftp/dimensionValue")
public class DimensionValueControl {

  private final DimensionValueService service;

  public DimensionValueControl(DimensionValueService service) {
    this.service = service;
  }



  @PutMapping()
  public ResponseWrapper<DimensionValue> saveDimensionValue(@RequestBody DimensionValue dimensionValue){

    service.save(dimensionValue);

    return ResponseWrapper.empty(OK,"执行成功!");
  }

  /**
   * 查询维度值列表
   * @param
   * @return
   */
  @GetMapping
  public ResponseWrapper<DimensionValue> queryDimensionValues(@RequestParam Map<String,String> map,final Pageable pageable){
    Utils.purify(map);
    Page<DimensionValue> data = service.search(map, pageable);
    return ResponseWrapper.<DimensionValue>builder().build(data);
  }

  /**
   * 修改
   * @param id
   * @param req
   * @return
   */
  @PatchMapping("{id}")
  public ResponseWrapper<DimensionValue> updateDimensionValue(@PathVariable("id") Long id,@RequestBody DimensionValue req){
    DimensionValue dimensionValue = service.load(id);
    if(dimensionValue == null){
      return ResponseWrapper.empty(1001,"执行失败!");
    }
    if(req.getDimensionValueId() != null){
      dimensionValue.setDimensionValueId(req.getDimensionValueId());
    }
    if(req.getDimensionValueName() != null){
      dimensionValue.setDimensionValueName(req.getDimensionValueName());
    }
    service.save(dimensionValue);
    return ResponseWrapper.empty(OK,"执行成功!");
  }

  /**
   * 删除
   * @param ids
   * @return
   */
  @DeleteMapping("{ids}")
  public ResponseWrapper<DimensionValue> delDimensionValue(@PathVariable("ids") final Long[] ids){
    for (Long id : ids) {
      service.del(id);
    }
    return ResponseWrapper.empty(OK,"执行成功!");
  }




}

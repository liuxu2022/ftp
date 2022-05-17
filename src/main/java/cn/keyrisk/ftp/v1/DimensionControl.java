package cn.keyrisk.ftp.v1;


import static cn.keyrisk.ftp.v1.Errors.OK;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
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
import cn.keyrisk.ftp.service.DimensionService;


@RestController
@RequestMapping("/ftp/dimension")
public class DimensionControl {


  private final DimensionService service;

  public DimensionControl(DimensionService service) {
    this.service = service;
  }



  @PutMapping
  public ResponseWrapper<Dimension> saveDimension(@RequestBody Dimension dimension){

    service.save(dimension);

    return ResponseWrapper.empty(OK,"执行成功!");
  }

  /**
   * 修改
   * @param id
   * @param req
   * @return
   */
  @PatchMapping("{id}")
  public ResponseWrapper<Dimension> updateDimension(@PathVariable("id") Long id,@RequestBody Dimension req){
    Dimension dimension = service.load(id);
    if(dimension == null){
      return ResponseWrapper.empty(1001,"执行失败!");
    }
    if(req.getDimensionId() != null){
      dimension.setDimensionId(req.getDimensionId());
    }
    if(req.getDimensionName() != null){
      dimension.setDimensionName(req.getDimensionName());
    }
    if(req.getDimensionDesc() != null){
      dimension.setDimensionDesc(req.getDimensionDesc());
    }
    if(req.getDimensionColumn() != null){
      dimension.setDimensionColumn(req.getDimensionColumn());
    }
    if(req.getDimensionColumnName() != null){
      dimension.setDimensionColumnName(req.getDimensionColumnName());
    }
    if(req.getIsInternal() != null){
      dimension.setIsInternal(req.getIsInternal());
    }
    if(req.getIsEditable() != null){
      dimension.setIsEditable(req.getIsEditable());
    }

    service.save(dimension);
    return ResponseWrapper.empty(OK,"执行成功!");
  }
  
  @GetMapping
  public ResponseWrapper<Dimension> query(@RequestParam Map<String,String> map, Pageable pageable){
    Utils.purify(map);
    Page<Dimension> datas = service.search(map, pageable);
    return ResponseWrapper.<Dimension>builder().build(datas);
  }

  /**
   * 删除
   * @param ids
   * @return
   */
  @DeleteMapping("{ids}")
  public ResponseWrapper<Dimension> delDimension(@PathVariable("ids") final Long[] ids){
    for (Long id : ids) {
      service.del(id);
    }
    return ResponseWrapper.empty(OK,"执行成功!");
  }


}

package cn.keyrisk.ftp.v1;


import static cn.keyrisk.ftp.v1.Errors.OK;

import cn.keyrisk.ftp.service.DimensionMapService;
import cn.keyrisk.ftp.service.DimensionService;
import java.util.Map;
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


@RestController
@RequestMapping("/ftp/dimensionMap")
public class DimensionMapControl {


  private final DimensionMapService service;

  public DimensionMapControl(DimensionMapService service) {
    this.service = service;
  }



  @PutMapping
  public ResponseWrapper<DimensionMap> saveDimensionMap(@RequestBody DimensionMap dimensionMap){

    service.save(dimensionMap);

    return ResponseWrapper.empty(OK,"执行成功!");
  }

  /**
   * 修改
   * @param id
   * @param req
   * @return
   */
  @PatchMapping("{id}")
  public ResponseWrapper<DimensionMap> updateDimensionMap(@PathVariable("id") Long id,@RequestBody DimensionMap req){
    DimensionMap dimensionMap = service.load(id);
    if(dimensionMap == null){
      return ResponseWrapper.empty(1001,"执行失败!");
    }

    if(req.getDimMapId() != null){
      dimensionMap.setDimMapId(req.getDimMapId());
    }
    if(req.getDimMapName() != null){
      dimensionMap.setDimMapName(req.getDimMapName());
    }
    if(req.getDimMapDesc() != null){
      dimensionMap.setDimMapDesc(req.getDimMapDesc());
    }
    if(req.getDimensionId() != null){
      dimensionMap.setDimensionId(req.getDimensionId());
    }
    if(req.getDimensionHierarchyId() != null){
      dimensionMap.setDimensionHierarchyId(req.getDimensionHierarchyId());
    }
    if(req.getLegalEntityId() != null){
      dimensionMap.setLegalEntityId(req.getLegalEntityId());
    }
    if(req.getConfigureFlag() != null){
      dimensionMap.setConfigureFlag(req.getConfigureFlag());
    }

    service.save(dimensionMap);
    return ResponseWrapper.empty(OK,"执行成功!");
  }
  
  @GetMapping
  public ResponseWrapper<DimensionMap> query(@RequestParam Map<String,String> map, Pageable pageable){
    Utils.purify(map);
    Page<DimensionMap> datas = service.search(map, pageable);
    return ResponseWrapper.<DimensionMap>builder().build(datas);
  }

  /**
   * 删除
   * @param ids
   * @return
   */
  @DeleteMapping("{ids}")
  public ResponseWrapper<DimensionMap> delDimensionMap(@PathVariable("ids") final Long[] ids){
    for (Long id : ids) {
      service.del(id);
    }
    return ResponseWrapper.empty(OK,"执行成功!");
  }


}

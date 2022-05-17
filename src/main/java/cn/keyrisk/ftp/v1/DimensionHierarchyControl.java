package cn.keyrisk.ftp.v1;

import static cn.keyrisk.ftp.v1.Errors.OK;

import cn.keyrisk.ftp.service.DimensionHierarchyService;
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
@RequestMapping("/ftp/dimensionHierarchy")
public class DimensionHierarchyControl {

  private final DimensionHierarchyService service;

  public DimensionHierarchyControl(DimensionHierarchyService service) {
    this.service = service;
  }


  @PutMapping
  public ResponseWrapper<DimensionHierarchy> save(@RequestBody DimensionHierarchy dimensionHierarchy){
    service.save(dimensionHierarchy);
    return ResponseWrapper.empty(OK,"执行成功!");
  }

  @GetMapping("{id}")
  public ResponseWrapper<DimensionHierarchy> query(@PathVariable("id") Long id){
    DimensionHierarchy data = service.load(id);
    return ResponseWrapper.<DimensionHierarchy>builder().build(data);
  }

  @GetMapping
  public ResponseWrapper<DimensionHierarchy> queryAll(@RequestParam Map<String,String> map,
      Pageable pageable){
    Utils.purify(map);
    Page<DimensionHierarchy> datas = service.search(map, pageable);
    return ResponseWrapper.<DimensionHierarchy>builder().build(datas);
  }

  /**
   * 修改
   * @param id
   * @param req
   * @return
   */
  @PatchMapping("{id}")
  public ResponseWrapper<DimensionHierarchy> updateDimensionHierarchy(@PathVariable("id") Long id,@RequestBody DimensionHierarchy req){
    DimensionHierarchy dimensionHierarchy = service.load(id);
    if(dimensionHierarchy == null){
      return ResponseWrapper.empty(1001,"执行失败!");
    }
    if(req.getDimensionId() != null){
      dimensionHierarchy.setDimensionId(req.getDimensionId());
    }
    if(req.getDimensionName() != null){
      dimensionHierarchy.setDimensionName(req.getDimensionName());
    }
    if(req.getDimensionHierarchyId() != null){
      dimensionHierarchy.setDimensionHierarchyId(req.getDimensionHierarchyId());
    }
    if(req.getDimensionHierarchyName() != null){
      dimensionHierarchy.setDimensionHierarchyName(req.getDimensionHierarchyName());
    }
    if(req.getDimensionHierarchyDesc() != null){
      dimensionHierarchy.setDimensionHierarchyDesc(req.getDimensionHierarchyDesc());
    }
    service.save(dimensionHierarchy);
    return ResponseWrapper.empty(OK,"执行成功!");
  }

  /**
   * 删除
   * @param ids
   * @return
   */
  @DeleteMapping("{ids}")
  public ResponseWrapper<DimensionHierarchy> delDimensionHierarchy(@PathVariable("ids") final Long[] ids){
    for (Long id : ids) {
      service.del(id);
    }
    return ResponseWrapper.empty(OK,"执行成功!");
  }




}

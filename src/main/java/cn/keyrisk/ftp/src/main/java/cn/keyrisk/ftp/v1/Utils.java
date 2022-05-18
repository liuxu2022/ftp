package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionValueEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class Utils {

  public static void purify(Map<String, String> map) {
    Map<String, String> newMap = new HashMap<>();
    for (Entry<String, String> entry : map.entrySet()) {
      //去除以page开头的参数
      if (!entry.getKey().startsWith("page") && entry.getValue() != null && entry.getValue() != "") {
        newMap.put(entry.getKey(), entry.getValue());
      }
    }
    map.clear();
    map.putAll(newMap);
  }

  public static Specification<?> findAny(Map<String, String> map){
    return (root,query,cb) -> {
      List<Predicate> predicateList = new ArrayList<>();
      for (Entry<String, String> entry : map.entrySet()) {
        Predicate pre = cb.equal(root.get(entry.getKey()), entry.getValue());
        predicateList.add(pre);
      }
      return cb.and(predicateList.toArray(new Predicate[0]));
    };
  }


}

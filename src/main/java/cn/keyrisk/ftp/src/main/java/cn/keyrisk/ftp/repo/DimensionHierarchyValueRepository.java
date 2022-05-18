package cn.keyrisk.ftp.repo;

import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;
import cn.keyrisk.ftp.entity.DimensionHierarchyValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionHierarchyValueRepository extends JpaRepository<DimensionHierarchyValueEntity,Long>,
    JpaSpecificationExecutor<DimensionHierarchyValueEntity> {

}

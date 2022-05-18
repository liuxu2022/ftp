package cn.keyrisk.ftp.repo;

import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionHierarchyRepository extends JpaRepository<DimensionHierarchyEntity,Long>,
    JpaSpecificationExecutor<DimensionHierarchyEntity> {

}

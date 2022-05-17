package cn.keyrisk.ftp.repo;

import cn.keyrisk.ftp.entity.DimensionValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionValueRepository extends JpaRepository<DimensionValueEntity,Long>,
    JpaSpecificationExecutor<DimensionValueEntity> {

}




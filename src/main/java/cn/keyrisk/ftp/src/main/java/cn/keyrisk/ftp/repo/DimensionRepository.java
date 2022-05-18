package cn.keyrisk.ftp.repo;

import cn.keyrisk.ftp.entity.DimensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionRepository extends JpaRepository<DimensionEntity,Long>,
    JpaSpecificationExecutor<DimensionEntity> {

}

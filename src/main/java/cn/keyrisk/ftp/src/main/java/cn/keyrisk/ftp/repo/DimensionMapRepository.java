package cn.keyrisk.ftp.repo;

import cn.keyrisk.ftp.entity.DimensionEntity;
import cn.keyrisk.ftp.entity.DimensionMapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionMapRepository extends JpaRepository<DimensionMapEntity,Long>,
    JpaSpecificationExecutor<DimensionMapEntity> {

}

package cn.keyrisk.ftp.repo;

import cn.keyrisk.ftp.entity.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyEntity,Long>,
    JpaSpecificationExecutor<CurrencyEntity> {

}

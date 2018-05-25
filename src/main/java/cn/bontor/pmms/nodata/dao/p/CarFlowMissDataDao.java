package cn.bontor.pmms.nodata.dao.p;

import cn.bontor.pmms.nodata.entity.p.CarFlowMissData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface CarFlowMissDataDao extends JpaRepository<CarFlowMissData, Long> {

    CarFlowMissData getBySiteIdOrderByTheLastPassTimeDesc(@Param("siteId") int siteId);
}

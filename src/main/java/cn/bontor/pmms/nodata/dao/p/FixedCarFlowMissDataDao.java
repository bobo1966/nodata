package cn.bontor.pmms.nodata.dao.p;

import cn.bontor.pmms.nodata.entity.p.FixedCarFlowMissData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixedCarFlowMissDataDao extends JpaRepository<FixedCarFlowMissData,Long> {
    FixedCarFlowMissData getBySiteIdOrderByTheLastPassTimeDesc(int siteId);
}

package cn.bontor.pmms.nodata.dao.s;

import cn.bontor.pmms.nodata.entity.s.CarFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

import java.util.List;

@Component
public interface CarFlowDao extends JpaRepository<CarFlow, Long> {

    @Query(value = "select DISTINCT a.RecordID,a.SiteID,a.Lane,a.PassTime,a.RegMark from CarFlow a,(select  SiteID,max(PassTime) PassTime from CarFlow group by SiteID) b where a.SiteID = b.SiteID and a.PassTime = b.PassTime order by a.RecordID,a.SiteID,a.Lane,a.PassTime,a.RegMark ", nativeQuery = true)
    public List<CarFlow> getCarFlowList();
}

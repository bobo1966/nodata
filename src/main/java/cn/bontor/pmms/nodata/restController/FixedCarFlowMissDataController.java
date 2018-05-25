package cn.bontor.pmms.nodata.restController;

import cn.bontor.pmms.nodata.dao.p.FixedCarFlowMissDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FixedCarFlowMissDataController {

    @Autowired
    private FixedCarFlowMissDataDao fixedCarFlowMissDataDao;

    @ResponseBody
    @RequestMapping("/getFixedCarFlow")
    public String getdata2(int siteId){
        return fixedCarFlowMissDataDao.getBySiteIdOrderByTheLastPassTimeDesc(siteId).toString();
    }
}

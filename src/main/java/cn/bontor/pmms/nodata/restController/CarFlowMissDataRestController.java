package cn.bontor.pmms.nodata.restController;

import cn.bontor.pmms.nodata.dao.p.CarFlowMissDataDao;
import cn.bontor.pmms.nodata.dao.s.CarFlowDao;
import cn.bontor.pmms.nodata.entity.s.CarFlow;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarFlowMissDataRestController {

    @Autowired
    private CarFlowMissDataDao carFlowMissDataDao;

    @Autowired
    private CarFlowDao dao;

    @ResponseBody
    @RequestMapping("/getdata")
    public String get(){
        List<CarFlow> list = dao.getCarFlowList();
        System.out.println(list.size());
        return null;
        //return carFlowMissDataDao.getBySiteIdOrderByTheLastPassTimeDesc(siteId).toString();
    }
}

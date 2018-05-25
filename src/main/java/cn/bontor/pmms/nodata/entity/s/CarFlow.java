package cn.bontor.pmms.nodata.entity.s;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 61.248上的Carflow表对应的实体类
 */
@Data
@Entity
@Table(name = "carflow")
public class CarFlow {
    /**
     * 记录id
     */
    @Id
    private int RecordID;

//    /**
//     * 站点id
//     */
//    @Column(name = "siteID")
//    private int siteid;

//    /**
//     * 线
//     */
//    @Column(name="lane")
//    private int lane;

    /**
     * 通过时间
     */
    @Column(name = "passtime")
    private Date passtime;

    /**
     * 车牌号
     */
    @Column(name = "regmark")
    private String regmark;

//    /**
//     * 车牌颜色
//     */
//    @Column(name = "regColor")
//    private String regcolor;
//
//    @Column(name = "regCondition")
//    private int regcondition;

//    @Column(name = "envFlagLimite")
//    private int EnvflagLimite;
//
//    @Column(name = "tailNumLimite")
//    private int TailNumLimite;

//    @Column(name = "isHandle")
//    private int ishandle;

//    public CarFlow(int recordid, int siteid, int lane, Date passtime, String regmark, String regcolor, int regcondition) {
//        recordid = recordid;
//        this.siteid = siteid;
//        this.lane = lane;
//        this.passtime = passtime;
//        this.regmark = regmark;
//        this.regcolor = regcolor;
//        this.regcondition = regcondition;
//        //this.ishandle = ishandle;
//    }

    public CarFlow() {
    }
}

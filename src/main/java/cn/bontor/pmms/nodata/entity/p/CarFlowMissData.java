package cn.bontor.pmms.nodata.entity.p;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
public class CarFlowMissData {
    @Id
    @GeneratedValue
    private Long id;

    /**
     *站点id
     */
    @Column(name = "siteId",nullable =true)
    private Integer siteId;

    /**
     * 站点名
     */
    @Column(name = "siteName",nullable = true)
    private String siteName;

    /**
     * 最新一条记录的时间
     */
    @Column(name = "theLastPassTime",nullable = true)
    private Date theLastPassTime;

    /**
     * 阈值
     */
    @Column(name = "thresholdValue",nullable = true)
    private String thresholdValue;

    /**
     * 状态（0-正常，1-异常）
     */
    @Column(name = "status" ,nullable = false)
    private Integer status;

    /**
     * 是否已发送报警状态
     */
    @Column(name="isSendMessageStatus",nullable = false)
    private Integer isSendMessageStatus;

    public CarFlowMissData() {

    }

    public CarFlowMissData(Integer siteId, String siteName, Date theLastPassTime, String thresholdValue, Integer status, Integer isSendMessageStatus) {
        this.siteId = siteId;
        this.siteName = siteName;
        this.theLastPassTime = theLastPassTime;
        this.thresholdValue = thresholdValue;
        this.status = status;
        this.isSendMessageStatus = isSendMessageStatus;
    }
}

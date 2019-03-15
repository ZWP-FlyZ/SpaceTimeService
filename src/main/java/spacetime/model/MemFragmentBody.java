package spacetime.model;


import java.util.List;


/**
 * Created by zwp12 on 2017/2/15.
 */


public class MemFragmentBody {

  
    private Long id;
  
    private String fId ;        //Fragment id

  
    private String uId;         //user id

    private String cTime;       //create time;
    private Integer tFLag;      //time flag
    private String sTime;       //start time;
    private String eTime;       //end time;
    private Double slTime;      //
    private Double elTime;      //

    private String ftDetail;//时间描述

    private Double fLatitude;   //relation Latitude
    private Double fLongitude;  //relation Longitude
    private String fpDetail;    //relation location detail
    private Integer coFlag;     //cell
    private Integer cellX;      //cellX
    private Integer cellY;      //cellY

   
    private String fTitle;      // title of the memory fragment
    private String bodyItemsJSON ;
   
    private List<BodyItem> bodyItemList;
   
    public MemFragmentBody(Long id,  String fId, String uId,
            String cTime, Integer tFLag, String sTime, String eTime, Double slTime,
            Double elTime, String ftDetail, Double fLatitude, Double fLongitude,
            String fpDetail, Integer coFlag, Integer cellX, Integer cellY,
          String fTitle, String bodyItemsJSON) {
        this.id = id;
        this.fId = fId;
        this.uId = uId;
        this.cTime = cTime;
        this.tFLag = tFLag;
        this.sTime = sTime;
        this.eTime = eTime;
        this.slTime = slTime;
        this.elTime = elTime;
        this.ftDetail = ftDetail;
        this.fLatitude = fLatitude;
        this.fLongitude = fLongitude;
        this.fpDetail = fpDetail;
        this.coFlag = coFlag;
        this.cellX = cellX;
        this.cellY = cellY;
        this.fTitle = fTitle;
        this.bodyItemsJSON = bodyItemsJSON;
    }
  
    public MemFragmentBody() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getcTime() {
		return cTime;
	}

	public void setcTime(String cTime) {
		this.cTime = cTime;
	}

	public Integer gettFLag() {
		return tFLag;
	}

	public void settFLag(Integer tFLag) {
		this.tFLag = tFLag;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String geteTime() {
		return eTime;
	}

	public void seteTime(String eTime) {
		this.eTime = eTime;
	}

	public Double getSlTime() {
		return slTime;
	}

	public void setSlTime(Double slTime) {
		this.slTime = slTime;
	}

	public Double getElTime() {
		return elTime;
	}

	public void setElTime(Double elTime) {
		this.elTime = elTime;
	}

	public String getFtDetail() {
		return ftDetail;
	}

	public void setFtDetail(String ftDetail) {
		this.ftDetail = ftDetail;
	}

	public Double getfLatitude() {
		return fLatitude;
	}

	public void setfLatitude(Double fLatitude) {
		this.fLatitude = fLatitude;
	}

	public Double getfLongitude() {
		return fLongitude;
	}

	public void setfLongitude(Double fLongitude) {
		this.fLongitude = fLongitude;
	}

	public String getFpDetail() {
		return fpDetail;
	}

	public void setFpDetail(String fpDetail) {
		this.fpDetail = fpDetail;
	}

	public Integer getCoFlag() {
		return coFlag;
	}

	public void setCoFlag(Integer coFlag) {
		this.coFlag = coFlag;
	}

	public Integer getCellX() {
		return cellX;
	}

	public void setCellX(Integer cellX) {
		this.cellX = cellX;
	}

	public Integer getCellY() {
		return cellY;
	}

	public void setCellY(Integer cellY) {
		this.cellY = cellY;
	}

	public String getfTitle() {
		return fTitle;
	}

	public void setfTitle(String fTitle) {
		this.fTitle = fTitle;
	}

	public String getBodyItemsJSON() {
		return bodyItemsJSON;
	}

	public void setBodyItemsJSON(String bodyItemsJSON) {
		this.bodyItemsJSON = bodyItemsJSON;
	}

	public List<BodyItem> getBodyItemList() {
		return bodyItemList;
	}

	public void setBodyItemList(List<BodyItem> bodyItemList) {
		this.bodyItemList = bodyItemList;
	}
   
   
}

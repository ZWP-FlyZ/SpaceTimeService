package spacetime.model;



/**
 * Created by zwp12 on 2017/2/15.
 */


public class MemFragmentHead implements Cloneable {
    
    private Long id;

   
    private String fId;
   
    private String uId;
  
    private String fTitle;

    private String cTime;
    private String ftDetail;
    private Double slTime;

    private String fpDetail;
    private Integer fFlag;
   
    public MemFragmentHead(Long id, String fId,  String uId,
            String fTitle, String cTime, String ftDetail, Double slTime,
            String fpDetail, Integer fFlag) {
        this.id = id;
        this.fId = fId;
        this.uId = uId;
        this.fTitle = fTitle;
        this.cTime = cTime;
        this.ftDetail = ftDetail;
        this.slTime = slTime;
        this.fpDetail = fpDetail;
        this.fFlag = fFlag;
    }

	public MemFragmentHead() {
		// TODO Auto-generated constructor stub
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

	public String getfTitle() {
		return fTitle;
	}

	public void setfTitle(String fTitle) {
		this.fTitle = fTitle;
	}

	public String getcTime() {
		return cTime;
	}

	public void setcTime(String cTime) {
		this.cTime = cTime;
	}

	public String getFtDetail() {
		return ftDetail;
	}

	public void setFtDetail(String ftDetail) {
		this.ftDetail = ftDetail;
	}

	public Double getSlTime() {
		return slTime;
	}

	public void setSlTime(Double slTime) {
		this.slTime = slTime;
	}

	public String getFpDetail() {
		return fpDetail;
	}

	public void setFpDetail(String fpDetail) {
		this.fpDetail = fpDetail;
	}

	public Integer getfFlag() {
		return fFlag;
	}

	public void setfFlag(Integer fFlag) {
		this.fFlag = fFlag;
	}
    
    
}

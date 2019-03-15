package spacetime.model;


/**
 * Created by zwp12 on 2017/2/15.
 */

public class SpaceCell {
    
    private Long id;

   
    private String ceId;
    private Integer cellX;
    private Integer cellY;

    private String ceTime;//kai tuo shi jian
    private String uId;// kai tuo yong hu
    private String uNickName;
    
   


	private Integer btCount;
    private Integer mR;
    private Integer mB;
    private Integer mG;

    private String ceDownTime;
    private Double ceDownLTime;
    private String ceUpTime;
    private Double ceUpLTime;

    private Integer nearFlag;

  
    public SpaceCell(Long id, String ceId, Integer cellX, Integer cellY,
            String ceTime, String uId, String uNickName, Integer btCount,
            Integer mR, Integer mB, Integer mG, String ceDownTime,
            Double ceDownLTime, String ceUpTime, Double ceUpLTime,
            Integer nearFlag) {
        this.id = id;
        this.ceId = ceId;
        this.cellX = cellX;
        this.cellY = cellY;
        this.ceTime = ceTime;
        this.uId = uId;
        this.uNickName = uNickName;
        this.btCount = btCount;
        this.mR = mR;
        this.mB = mB;
        this.mG = mG;
        this.ceDownTime = ceDownTime;
        this.ceDownLTime = ceDownLTime;
        this.ceUpTime = ceUpTime;
        this.ceUpLTime = ceUpLTime;
        this.nearFlag = nearFlag;
    }

    public String getuNickName() {
		return uNickName;
	}


	public void setuNickName(String uNickName) {
		this.uNickName = uNickName;
	}
    
    
    public SpaceCell() {
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCeId() {
		return ceId;
	}


	public void setCeId(String ceId) {
		this.ceId = ceId;
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


	public String getCeTime() {
		return ceTime;
	}


	public void setCeTime(String ceTime) {
		this.ceTime = ceTime;
	}


	public String getuId() {
		return uId;
	}


	public void setuId(String uId) {
		this.uId = uId;
	}


	public Integer getBtCount() {
		return btCount;
	}


	public void setBtCount(Integer btCount) {
		this.btCount = btCount;
	}


	public Integer getmR() {
		return mR;
	}


	public void setmR(Integer mR) {
		this.mR = mR;
	}


	public Integer getmB() {
		return mB;
	}


	public void setmB(Integer mB) {
		this.mB = mB;
	}


	public Integer getmG() {
		return mG;
	}


	public void setmG(Integer mG) {
		this.mG = mG;
	}


	public String getCeDownTime() {
		return ceDownTime;
	}


	public void setCeDownTime(String ceDownTime) {
		this.ceDownTime = ceDownTime;
	}


	public Double getCeDownLTime() {
		return ceDownLTime;
	}


	public void setCeDownLTime(Double ceDownLTime) {
		this.ceDownLTime = ceDownLTime;
	}


	public String getCeUpTime() {
		return ceUpTime;
	}


	public void setCeUpTime(String ceUpTime) {
		this.ceUpTime = ceUpTime;
	}


	public Double getCeUpLTime() {
		return ceUpLTime;
	}


	public void setCeUpLTime(Double ceUpLTime) {
		this.ceUpLTime = ceUpLTime;
	}


	public Integer getNearFlag() {
		return nearFlag;
	}


	public void setNearFlag(Integer nearFlag) {
		this.nearFlag = nearFlag;
	}

  



}

package spacetime.model;



/**
 * Created by zwp12 on 2017/2/16.
 */


public class UserInfo {

    
    private Long id;
   
    private String uId;
    private String uNickName;
    private String uPassword;
    private Integer uSex;
    private String uBri;
    private String uSign;

    private Integer cellX;
    private Integer cellY;

    private String crTime;
    private String crDesc;
    
    private Integer campFlag;

    private String lRecJson ;
    private String gRecJson;
   
    public UserInfo(Long id, String uId, String uNickName, String uPassword,
            Integer uSex, String uBri, String uSign, Integer cellX, Integer cellY,
            Integer campFlag, String lRecJson, String gRecJson) {
        this.id = id;
        this.uId = uId;
        this.uNickName = uNickName;
        this.uPassword = uPassword;
        this.uSex = uSex;
        this.uBri = uBri;
        this.uSign = uSign;
        this.cellX = cellX;
        this.cellY = cellY;
        this.campFlag = campFlag;
        this.lRecJson = lRecJson;
        this.gRecJson = gRecJson;
    }
   
    public UserInfo() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuNickName() {
		return uNickName;
	}

	public void setuNickName(String uNickName) {
		this.uNickName = uNickName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Integer getuSex() {
		return uSex;
	}

	public void setuSex(Integer uSex) {
		this.uSex = uSex;
	}

	public String getuBri() {
		return uBri;
	}

	public void setuBri(String uBri) {
		this.uBri = uBri;
	}

	public String getuSign() {
		return uSign;
	}

	public void setuSign(String uSign) {
		this.uSign = uSign;
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

	public Integer getCampFlag() {
		return campFlag;
	}

	public void setCampFlag(Integer campFlag) {
		this.campFlag = campFlag;
	}

	public String getlRecJson() {
		return lRecJson;
	}

	public void setlRecJson(String lRecJson) {
		this.lRecJson = lRecJson;
	}

	public String getgRecJson() {
		return gRecJson;
	}

	public void setgRecJson(String gRecJson) {
		this.gRecJson = gRecJson;
	}

	public String getCrTime() {
		return crTime;
	}

	public void setCrTime(String crTime) {
		this.crTime = crTime;
	}

	public String getCrDesc() {
		return crDesc;
	}

	public void setCrDesc(String crDesc) {
		this.crDesc = crDesc;
	}
    
	
	
     

}

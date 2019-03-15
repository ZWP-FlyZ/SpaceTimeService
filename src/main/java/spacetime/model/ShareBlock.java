package spacetime.model;



/**
 * Created by zwp12 on 2017/2/15.
 */

public class ShareBlock {
   
    private Long id;
  
    private String sId;

    private String ceId;
    private Integer sFlag;
    private String sTime;
    private Integer pokerCount;
    private Integer dpokerCount;
    private String uId;
    private String uNickName;

    private String sData1;
    private String sData2;
    private String sData3;

   
    public ShareBlock(Long id, String sId, Integer sFlag, String sTime,
            Integer pokerCount, Integer dpokerCount, String uId, String uNickName,
            String sData1, String sData2, String sData3) {
        this.id = id;
        this.sId = sId;
        this.sFlag = sFlag;
        this.sTime = sTime;
        this.pokerCount = pokerCount;
        this.dpokerCount = dpokerCount;
        this.uId = uId;
        this.uNickName = uNickName;
        this.sData1 = sData1;
        this.sData2 = sData2;
        this.sData3 = sData3;
    }
  
    public ShareBlock() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public Integer getsFlag() {
		return sFlag;
	}

	public void setsFlag(Integer sFlag) {
		this.sFlag = sFlag;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public Integer getPokerCount() {
		return pokerCount;
	}

	public void setPokerCount(Integer pokerCount) {
		this.pokerCount = pokerCount;
	}

	public Integer getDpokerCount() {
		return dpokerCount;
	}

	public void setDpokerCount(Integer dpokerCount) {
		this.dpokerCount = dpokerCount;
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

	public String getsData1() {
		return sData1;
	}

	public void setsData1(String sData1) {
		this.sData1 = sData1;
	}

	public String getsData2() {
		return sData2;
	}

	public void setsData2(String sData2) {
		this.sData2 = sData2;
	}

	public String getsData3() {
		return sData3;
	}

	public void setsData3(String sData3) {
		this.sData3 = sData3;
	}

	public String getCeId() {
		return ceId;
	}

	public void setCeId(String ceId) {
		this.ceId = ceId;
	}
    
    
    
    

}

package spacetime.model;



import java.util.List;


/**
 * Created by zwp12 on 2017/2/15.
 */

public class MemChain {

   
    private Long id;

  
    private String chId;
   
    private String uId;

    private String chName;
    private String chDetail;

    private String scTime;
    private Double cslTime;

    private String seTime;
    private Double celTime;

    private Integer chFlag;

    private String chTime;
    private String chContextJSON;

   
    private List<MemFragmentHead> chContext;

   
    public MemChain(Long id, String chId,  String uId, String chName,
            String chDetail, String scTime, Double cslTime, String seTime,
            Double celTime, Integer chFlag, String chTime, String chContextJSON) {
        this.id = id;
        this.chId = chId;
        this.uId = uId;
        this.chName = chName;
        this.chDetail = chDetail;
        this.scTime = scTime;
        this.cslTime = cslTime;
        this.seTime = seTime;
        this.celTime = celTime;
        this.chFlag = chFlag;
        this.chTime = chTime;
        this.chContextJSON = chContextJSON;
    }

   
    public MemChain() {
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getChId() {
		return chId;
	}


	public void setChId(String chId) {
		this.chId = chId;
	}


	public String getuId() {
		return uId;
	}


	public void setuId(String uId) {
		this.uId = uId;
	}


	public String getChName() {
		return chName;
	}


	public void setChName(String chName) {
		this.chName = chName;
	}


	public String getChDetail() {
		return chDetail;
	}


	public void setChDetail(String chDetail) {
		this.chDetail = chDetail;
	}


	public String getScTime() {
		return scTime;
	}


	public void setScTime(String scTime) {
		this.scTime = scTime;
	}


	public Double getCslTime() {
		return cslTime;
	}


	public void setCslTime(Double cslTime) {
		this.cslTime = cslTime;
	}


	public String getSeTime() {
		return seTime;
	}


	public void setSeTime(String seTime) {
		this.seTime = seTime;
	}


	public Double getCelTime() {
		return celTime;
	}


	public void setCelTime(Double celTime) {
		this.celTime = celTime;
	}


	public Integer getChFlag() {
		return chFlag;
	}


	public void setChFlag(Integer chFlag) {
		this.chFlag = chFlag;
	}


	public String getChTime() {
		return chTime;
	}


	public void setChTime(String chTime) {
		this.chTime = chTime;
	}


	public String getChContextJSON() {
		return chContextJSON;
	}


	public void setChContextJSON(String chContextJSON) {
		this.chContextJSON = chContextJSON;
	}


	public List<MemFragmentHead> getChContext() {
		return chContext;
	}


	public void setChContext(List<MemFragmentHead> chContext) {
		this.chContext = chContext;
	}

  
}

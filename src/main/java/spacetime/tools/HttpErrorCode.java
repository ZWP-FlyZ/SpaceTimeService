package spacetime.tools;

public class HttpErrorCode {
	
	/*
	 * 注册时使用
	 */
	public final static int LOGON_USER_NAME_ERR = 101;
	public final static int LOGON_USER_NAME_OK = 100;
	public final static int LOGON_REG_OK = 102;
	public final static int LOGON_REG_ERR = 103;
	
	
	/*
	 * 登录时使用
	 */
	public final static int LOGIN_OK = 104;
	public final static int LOGIN_PASS_ERR = 105;
	public final static int LOGIN_UN_ERR = 106;

	
	/*
	 * 更改用户信息时使用
	 */
	
	public final static int UPDATE_USER_INFO_OK = 10;
	public final static int UPDATE_USER_INFO_ERR = 11;
	
	/**
	 * 同步数据时使用
	 */
	public final static int UPLOAD_MEM_CHAIN_OK = 14;
    public final static int UPLOAD_MEM_CHAIN_ERR = 15;
    public final static int CANCEL_UPLOAD_MEM_CHAIN_OK = 16;
    public final static int CANCEL_UPLOAD_MEM_CHAIN_ERR = 17;
    public final static int UPLOAD_MEM_BODY_OK = 18;
    public final static int UPLOAD_MEM_BODY_ERR = 19;
    public final static int CANCEL_UPLOAD_MEM_BODY_OK = 20;
    public final static int CANCEL_UPLOAD_MEM_BODY_ERR = 21;
    
    
    public final static int UPLOAD_SHARE_BLOCK_OK = 22;
    public final static int UPLOAD_SHARE_BLOCK_ERR = 23;
    public final static int CANCEL_UPLOAD_SHARE_BLOCK_OK = 24;
    public final static int CANCEL_UPLOAD_SHARE_BLOCK_ERR = 25;
    
    
    public final static int CRT_SPACE_CELL_OK = 26;
    public final static int CRT_SPACE_CELL_ERR = 27;
    
	
}

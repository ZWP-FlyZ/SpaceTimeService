package spacetime.control;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import spacetime.model.MemChain;
import spacetime.model.MemFragmentBody;
import spacetime.model.MemFragmentHead;
import spacetime.model.ShareBlock;
import spacetime.model.SpaceCell;
import spacetime.model.UserInfo;
import spacetime.server.DataService;
import spacetime.tools.HttpErrorCode;
import spacetime.tools.IDCreater;




@Controller
@RequestMapping("/")
public class MyControl {
		
	@Autowired
	DataService dataService;
	
	private Gson gson = new Gson();
	
	
	public final static int  OP_OK = 1;
	
	
	@RequestMapping("/i.zwp")
	@ResponseBody
	public String indexw(ModelMap map,String uName){
		 
		System.err.println(""+uName);
		return uName;
	}
	
	
	@RequestMapping("/check.do")
	@ResponseBody
	public int checkName(String uNickName){		 
		if(dataService.checkNickName(uNickName)){
			return HttpErrorCode.LOGON_USER_NAME_OK;
		}else
			return HttpErrorCode.LOGON_USER_NAME_ERR;
	}
	
	@RequestMapping(value = "/logon.do", method = RequestMethod.POST)
	@ResponseBody
	public UserInfo logOn(String userInfoJson){
		 UserInfo info = gson.fromJson(userInfoJson
                 ,new TypeToken<UserInfo>(){}.getType());
		
		if(dataService.logOnUser(info)==OP_OK){
			info.setId((long)HttpErrorCode.LOGON_REG_OK);
		}else{
			info.setId((long)HttpErrorCode.LOGON_REG_ERR);
		}
		info.setuPassword(null);
		return info;
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	@ResponseBody
	public UserInfo logIn(String uNickName,String uPasswordE){
			System.err.println("logon name"+uNickName);
			System.err.println("logon pse"+uPasswordE);
			UserInfo userinfo = dataService.getUserByNickName(uNickName);
			System.err.println(gson.toJson(userinfo));
			if(userinfo==null||!userinfo.getuPassword().equals(uPasswordE)){
				userinfo = new UserInfo();
				userinfo.setId((long)HttpErrorCode.LOGIN_PASS_ERR);
			}else
				userinfo.setId((long)HttpErrorCode.LOGIN_OK);
			
			
			userinfo.setuPassword(null);
		return userinfo;
	}
	
	
	@RequestMapping(value = "/get_cell_info.do", method = RequestMethod.GET)
	@ResponseBody
	public SpaceCell cellInfo(Integer cellX,Integer cellY){
			SpaceCell cell = 
					dataService.getSpaceCell(IDCreater.getCEID(cellX, cellY));
			if(cell==null||cell.getCeId()==null)
				cell = new SpaceCell();
		return cell;	
	}
	
	
	@RequestMapping(value = "/crt_space_cell.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer createSpaceCell(Integer cellX,Integer cellY,
			String uId,String uNickName){
			
		if(dataService.createSpaceCell(cellX, cellY, uId, uNickName))
			return HttpErrorCode.CRT_SPACE_CELL_OK;
		else
			return HttpErrorCode.CRT_SPACE_CELL_ERR;
	}
	
	
	
	
	@RequestMapping(value = "/get_user_info.do", method = RequestMethod.GET)
	@ResponseBody
	public UserInfo userInfo(String uId){
			System.err.println("uId  "+uId);
	        UserInfo userInfo = dataService.getUserByUID(uId);
		return userInfo;	
	}
	
	
	@RequestMapping(value = "/user_mem_chains.do", method = RequestMethod.GET)
	@ResponseBody
	public List<MemChain> memChainsByUID(String uId){
		System.err.println("uId "+uId);
		List<MemChain> chains = dataService.getMemChainByUid(uId);
		if(chains==null) chains = new ArrayList<MemChain>();
		return chains;	
	}
	
	@RequestMapping(value = "/user_mem_bodies.do", method = RequestMethod.GET)
	@ResponseBody
	public List<MemFragmentBody> memBodiesByUID(String uId){
		System.err.println("uId "+uId);
		List<MemFragmentBody> bodies = 
				dataService.getMemBodiesByUid(uId);
		if(bodies==null) bodies = new ArrayList<MemFragmentBody>();
		return bodies;	
	}
	
	
	
	@RequestMapping(value = "/set_user_info.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer updateUserInfo(UserInfo userInfo){
		
		System.err.println("userinfo "+new Gson().toJson(userInfo));
		int status =  dataService.updateUserInfoMoreData(userInfo);
		if(status==OP_OK)
		    return HttpErrorCode.UPDATE_USER_INFO_OK;
		else
			return HttpErrorCode.UPDATE_USER_INFO_ERR;
	}
	
	
	
	
	
	
	@RequestMapping(value = "/get_share_blocks.do", method = RequestMethod.GET)
	@ResponseBody
	public List<ShareBlock> shareBlocks(Integer cellX,Integer cellY, Integer index){
			System.err.println("X"+cellX);
			System.err.println("Y"+cellY);
			System.err.println("index"+index);
		return dataService.getShareBlock(IDCreater.getCEID(cellX, cellY), index);	
	}
	
	@RequestMapping(value = "/dl_mem_heads.do", method = RequestMethod.GET)
	@ResponseBody
	public List<MemFragmentHead> dlMemHead(String jsonFids){
			List<MemFragmentHead> heads = new ArrayList<MemFragmentHead>();
			System.err.println(jsonFids);
			List<String> fIds = new Gson().fromJson(jsonFids,
					new TypeToken<List<String>>(){}.getType());
			for(String fId:fIds){
				System.err.println(fId);
				MemFragmentHead head = new MemFragmentHead();
				head.setfId(fId);
				head.setuId("UID_UD2312");
				head.setfTitle("hello world!");
				head.setcTime(getTimeNow());
				head.setfFlag(0x012);
				heads.add(head);
			}
		return heads;	
	}
	
	@RequestMapping(value = "/dl_mem_chains.do", method = RequestMethod.GET)
	@ResponseBody
	public List<MemChain> dlMemChains(String jsonChids){
			List<MemChain> chains = new ArrayList<MemChain>();
			System.err.println(jsonChids);
			List<String> chIds = new Gson().fromJson(jsonChids,
					new TypeToken<List<String>>(){}.getType());
			for(String chId:chIds){
				System.err.println(chId);
				MemChain chain = new MemChain();
				chain.setChId(chId);
				chain.setChName("remember");
				chain.setChTime(getTimeNow());
				chain.setuId("UID_UD2312");
				chains.add(chain);
			}
		return chains;	
	}
	
	
	@RequestMapping(value = "/upload_mem_chain.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer upLoadMemChain(String memChainJson){
		MemChain chain = new Gson().fromJson(memChainJson,
				new TypeToken<MemChain>(){}.getType());
		int state = dataService.synMemChain(chain);
		if(state==OP_OK)
			return HttpErrorCode.UPLOAD_MEM_CHAIN_OK;
		else
			return HttpErrorCode.UPLOAD_MEM_CHAIN_ERR;	
	}
	
	@RequestMapping(value = "/cancel_mem_chain.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer cancelUpLoadMemChain(String chId){
		
		int state = dataService.cancelSynMemChain(chId);
			return HttpErrorCode.CANCEL_UPLOAD_MEM_CHAIN_OK;
		
	}
	
	
	@RequestMapping(value = "/upload_mem_body.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer upLoadMemBody(String memBodyJson){
		MemFragmentBody body = new Gson().fromJson(memBodyJson,
				new TypeToken<MemFragmentBody>(){}.getType());
		
		int state = dataService.synMemBody(body);
		if(state==OP_OK)
			return HttpErrorCode.UPLOAD_MEM_BODY_OK;
		else
			return HttpErrorCode.UPLOAD_MEM_BODY_ERR;	
	}
	
	@RequestMapping(value = "/cancel_upload_mem_body.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer cancelUpLoadMemBody(String fId){
		
			//dataService.isContainMemBody(fId);
			return HttpErrorCode.CANCEL_UPLOAD_MEM_BODY_OK;
	}
	
	@RequestMapping(value = "/mem_fgt_body.do", method = RequestMethod.GET)
	@ResponseBody
	public MemFragmentBody getMemBody(String fId){		
			//dataService.isContainMemBody(fId);
			return dataService.getFgtBody(fId);
	}
	
	
	
	@RequestMapping(value = "/upload_share_block.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer upLoadShareBlock(String shareBlockJson){
		System.err.println(shareBlockJson);
		
		
		ShareBlock body = new Gson().fromJson(shareBlockJson,
				new TypeToken<ShareBlock>(){}.getType());
		if(body==null)
			System.err.println("shareblock is null");
		
		int state = dataService.insertShareBlock(body);
		if(state==OP_OK)
			return HttpErrorCode.UPLOAD_SHARE_BLOCK_OK;
		else
			return HttpErrorCode.UPLOAD_SHARE_BLOCK_ERR;	
	}
	
	@RequestMapping(value = "/cancel_upload_share_block.do", method = RequestMethod.GET)
	@ResponseBody
	public Integer cancelShareBlock(String sId,String ceId){
		
			
				dataService.deleteShareBlock(sId, ceId);
			
				return HttpErrorCode.CANCEL_UPLOAD_SHARE_BLOCK_OK;		
	}
	
	
	
	

	public String getTimeNow(){
		Date d = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateNowStr = sdf.format(d);  
		return dateNowStr;
	}
	
	
	
	
}

package spacetime.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spacetime.dao.SpaceTimeDao;
import spacetime.model.MemChain;
import spacetime.model.MemFragmentBody;
import spacetime.model.ShareBlock;
import spacetime.model.SpaceCell;
import spacetime.model.UserInfo;
import spacetime.tools.IDCreater;
import spacetime.tools.TimeTools;

@Service
public class DataService {

	@Autowired
	SpaceTimeDao stDao;
	
	public boolean checkNickName(String uNickName){
		return stDao.checkNickName(uNickName)==0;
	}
	
	
	@Transactional
	public synchronized Integer logOnUser(UserInfo userInfo){
		
		String ceId = IDCreater.getCEID(userInfo.getCellX(), userInfo.getCellY());
		SpaceCell cell = stDao.getSpaceCellByceId(ceId);
		userInfo.setuId(IDCreater.getUID());
		userInfo.setCrTime(TimeTools.getNow());
		if(cell==null){
			cell = new SpaceCell();
			cell.setCeId(ceId);
			cell.setCellX(userInfo.getCellX());
			cell.setCellY(userInfo.getCellY());
			cell.setCeTime(TimeTools.getNow());
			cell.setuId(userInfo.getuId());
			cell.setuNickName(userInfo.getuNickName());
			cell.setBtCount(1);
			cell.setNearFlag(0);
			userInfo.setCampFlag(0);
			stDao.addSpaceCell(cell);
		}else{
			userInfo.setCampFlag(cell.getBtCount()%3);
			updateSpaceCellbtCInc(cell.getCeId());
		}
		return stDao.addUser(userInfo);
	}
	
	public UserInfo getUserByNickName(String uNickName){
		return stDao.getUserInfoByNickName(uNickName);
	}
	
	public UserInfo getUserByUID(String uId){
		return stDao.getUserInfoByuId(uId);
	}
	
	public Integer updateSpaceCellbtCInc(String ceId){
		return stDao.updateSpaceCellBtCountInc(ceId);
	}
	
	public List<MemChain> getMemChainByUid(String uId){
		return stDao.getMemChiansByUid(uId);
	}
	
	public List<MemFragmentBody> getMemBodiesByUid(String uId){
		return stDao.getMemBodiesByUid(uId);
	}
	
	public Integer updateUserInfoMoreData(UserInfo userInfo){
		return stDao.updateUserInfo(userInfo);
	}
	
	@Transactional
	public Integer synMemChain(MemChain chain){
		int c = stDao.isContainMemChain(chain.getChId());
		if(c==1)
			stDao.deleteMemChainByChId(chain.getChId());	
		return stDao.insertMemChain(chain);
	}
	
	public Integer cancelSynMemChain(String  chId){
		return stDao.deleteMemChainByChId(chId);
	}
	
	@Transactional
	public Integer synMemBody(MemFragmentBody body){
		int c = stDao.isContainMemBody(body.getfId());
		if(c==0)
			stDao.insertMemBody(body);	
		return 1;
	}
	
	
	public boolean isContainMemBody(String  fId){
		return stDao.isContainMemBody(fId)==1;
	}
	
	
	public MemFragmentBody getFgtBody(String fId){
		return stDao.getMemFragmentBodyByfId(fId);
	}
	

	@Transactional
	public Integer insertShareBlock(ShareBlock block){
		UserInfo info = 
				stDao.getUserInfoByuId(block.getuId());
		SpaceCell cell = 
				stDao.getSpaceCellByceId(block.getCeId());
		MemChain chain = null;
		MemFragmentBody body = null;
		int t=0;
		
		if(block.getsFlag()==0){
				body = stDao.getMemFragmentBodyByfId(block.getsId());
				System.err.println(1);
		}
		else{
			chain = stDao.getMemChainByChId(block.getsId());
			System.err.println(2);
		}
		
		if(info.getCampFlag()==0){
			t = cell.getmR()==null?0:cell.getmR();
			cell.setmR(++t);
			System.err.println(3);
		}else if(info.getCampFlag()==1){
			t = cell.getmG()==null?0:cell.getmG();
			cell.setmG(++t);
			System.err.println(4);
		}else if(info.getCampFlag()==2){
			t = cell.getmB()==null?0:cell.getmB();
			cell.setmB(++t);
			System.err.println(5);
		}
		
		if(cell.getCeDownTime()==null||
				cell.getCeUpTime()==null){
			if(block.getsFlag()==0){
				cell.setCeDownLTime(body.getSlTime());
				cell.setCeDownTime(body.getFtDetail());
				cell.setCeUpLTime(body.getSlTime());
				cell.setCeUpTime(body.getFtDetail());
			}else{
				cell.setCeDownLTime(chain.getCslTime());
				cell.setCeDownTime(chain.getScTime());
				cell.setCeUpLTime(chain.getCelTime());
				cell.setCeUpTime(chain.getSeTime());
			}
			System.err.println(6);
		}else if(block.getsFlag()==0){
			String tmpTime = body.getFtDetail();
			Double tmpLtime = body.getSlTime();
			if(cell.getCeDownLTime()>tmpLtime){
				cell.setCeDownLTime(tmpLtime);
				cell.setCeDownTime(tmpTime);
				System.err.println(7);
			}
			if(cell.getCeUpLTime()<tmpLtime){
				cell.setCeUpLTime(tmpLtime);
				cell.setCeUpTime(tmpTime);
				System.err.println(8);
			}
		}else{
			String tmpTime =chain.getScTime();
			Double tmpLtime = chain.getCslTime();
			if(cell.getCeDownLTime()>tmpLtime){
				cell.setCeDownLTime(tmpLtime);
				cell.setCeDownTime(tmpTime);
				System.err.println(7);
			}
			
			tmpTime =chain.getSeTime();
			tmpLtime = chain.getCelTime();
			if(cell.getCeUpLTime()<tmpLtime){
				cell.setCeUpLTime(tmpLtime);
				cell.setCeUpTime(tmpTime);
				System.err.println(8);
			}
		}
		System.err.println(9);
		
		stDao.updateSpaceCellOther(cell);
		System.err.println(10);
		return stDao.insertShareBlock(block);
	}
	
	public Integer deleteShareBlock(String sId,String ceId){
		return stDao.deleteShareBlock(sId, ceId);
	}
	
	public SpaceCell  getSpaceCell(String ceId){
		return stDao.getSpaceCellByceId(ceId);
	}
	
	public synchronized  boolean createSpaceCell(Integer cellX,Integer cellY,
			String uId,String uNickName){
		
		String ceId = IDCreater.getCEID(cellX, cellY);
		SpaceCell cell = stDao.getSpaceCellByceId(ceId);
		if(cell!=null&&cell.getCeId()!=null)
			return false;
		else{
			cell = new SpaceCell();
			cell.setCeId(ceId);
			cell.setCellX(cellX);
			cell.setCellY(cellY);
			cell.setCeTime(TimeTools.getNow());
			cell.setuId(uId);
			cell.setuNickName(uNickName);
			cell.setBtCount(0);
			cell.setNearFlag(0);
			stDao.addSpaceCell(cell);
			return true;
		}
	}
	
	
	public List<ShareBlock> getShareBlock(String ceId,Integer index){
		return stDao.getShareBlocksByceId(ceId, index);
	}
	
}

package spacetime.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import spacetime.model.MemChain;
import spacetime.model.MemFragmentBody;
import spacetime.model.ShareBlock;
import spacetime.model.SpaceCell;
import spacetime.model.UserInfo;

public interface SpaceTimeDao {
	
	public Integer checkNickName(@Param("uNickName")String uNickName);
	//used for log in
	public UserInfo getUserInfoByNickName(@Param("uNickName")String uNickName);
	public UserInfo getUserInfoByuId(@Param("uId")String uId);
	public Integer 	addUser(@Param("userInfo")UserInfo userInfo);
	
	public SpaceCell getSpaceCellByceId(@Param("ceId")String ceId);
	public Integer 	addSpaceCell(@Param("cell")SpaceCell cell);
	public Integer updateSpaceCellBtCountInc(@Param("ceId")String ceId);
	public Integer updateSpaceCellOther(@Param("cell")SpaceCell cell);
	
	
	public List<MemChain> getMemChiansByUid(@Param("uId")String uId);
	public List<MemFragmentBody> getMemBodiesByUid(@Param("uId")String uId);
	public Integer updateUserInfo(@Param("userInfo")UserInfo userInfo);

	public Integer insertMemChain(@Param("chain")MemChain chain);
	public MemChain getMemChainByChId(@Param("chId")String chId);
	public Integer deleteMemChainByChId(@Param("chId")String chId);
	public Integer  isContainMemChain(@Param("chId")String chId);
	
	public Integer insertMemBody(@Param("body")MemFragmentBody body);
	public MemFragmentBody getMemFragmentBodyByfId(@Param("fId")String fId);
	public Integer isContainMemBody(@Param("fId")String fId);
	
	public Integer insertShareBlock(@Param("block")ShareBlock block);
	public Integer deleteShareBlock(@Param("sId")String sId,@Param("ceId")String ceId);
	public List<ShareBlock> getShareBlocksByceId(@Param("ceId")String ceId,
													@Param("index")Integer index);
	
	
}

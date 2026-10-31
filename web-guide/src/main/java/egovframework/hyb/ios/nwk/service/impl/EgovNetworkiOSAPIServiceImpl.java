/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.hyb.ios.nwk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.hyb.ios.nwk.service.EgovNetworkiOSAPIService;
import egovframework.hyb.ios.nwk.service.NetworkiOSAPIVO;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.cmmn.exception.BaseRuntimeException;

/**  
 * @Class Name : EgovSampleServiceImpl.java
 * @Description : EgovNetworkAPIServiceImpl Class
 * @Modification Information  
 * @
 * @  수정일       수정자                   수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012.05.14    서준식                   최초생성
 * @ 2012.08.01    이해성        DeviceAPIGuide Network Info
 * 
 * @author 디바이스 API 실행환경 개발팀
 * @since 2012. 05.14
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */

@Service("EgovNetworkiOSAPIService")
public class EgovNetworkiOSAPIServiceImpl extends EgovAbstractServiceImpl implements EgovNetworkiOSAPIService {
	
	/** NetworkAPIDAO */
    @Resource(name="NetworkiOSAPIDAO")
    private NetworkiOSAPIDAO networkiOSAPIDAO;

	/**
	 * 네트워크 정보를 등록한다.
	 * @param vo - 등록할 정보가 담긴 NetworkAPIVO
	 * @return 등록 결과
	 */
    public int insertNetworkInfo(NetworkiOSAPIVO vo) {	
    	return (Integer)networkiOSAPIDAO.insertNetworkInfo(vo);  
    }

    /**
	 * 네트워크 정보를 수정한다.
	 * @param vo - 수정할 정보가 담긴 NetworkAPIVO
	 * @return void형
	 */
    public int updateNetworkInfo(NetworkiOSAPIVO vo) {
    	return (Integer)networkiOSAPIDAO.updateNetworkInfo(vo);
    }

    /**
	 * 네트워크 정보를 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 NetworkAPIVO
	 * @return void형 
	 */
    public int deleteNetworkInfo(NetworkiOSAPIVO vo) {
    	return (Integer)networkiOSAPIDAO.deleteNetworkInfo(vo);
    }

    /**
	 * 네트워크 정보를 조회한다.
	 * @param vo - 조회할 정보가 담긴 NetworkAPIVO
	 * @return 조회한 네트워크 정보
	 */
    public NetworkiOSAPIVO selectNetworkInfo(NetworkiOSAPIVO vo) {
    	NetworkiOSAPIVO resultVO = networkiOSAPIDAO.selectNetworkInfo(vo);
        if (resultVO == null) {
            throw new BaseRuntimeException(processException("info.nodata.msg"));
        }
        return resultVO;
    }

    /**
	 * 네트워크 정보 목록을 조회한다.
	 * @param VO - 조회할 정보가 담긴 NetworkAPIVO
	 * @return 네트워크 정보 목록
	 */
    public List<?> selectNetworkInfoList(NetworkiOSAPIVO vo) {
        return networkiOSAPIDAO.selectNetworkInfoList(vo);
    }

    /**
	 * 네트워크 정보 총 갯수를 조회한다.
	 * @param VO - 조회할 정보가 담긴 NetworkAPIVO
	 * @return 네트워크 정보 총 갯수
	 */
    public int selectNetworkInfoListTotCnt(NetworkiOSAPIVO vo) {
		return networkiOSAPIDAO.selectNetworkInfoListTotCnt(vo);
	}
    
}

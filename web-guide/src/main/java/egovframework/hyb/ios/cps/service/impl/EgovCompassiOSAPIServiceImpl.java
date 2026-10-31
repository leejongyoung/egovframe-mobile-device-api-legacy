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
package egovframework.hyb.ios.cps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.hyb.ios.cps.service.CompassiOSAPIDefaultVO;
import egovframework.hyb.ios.cps.service.CompassiOSAPIVO;
import egovframework.hyb.ios.cps.service.EgovCompassiOSAPIService;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.cmmn.exception.BaseRuntimeException;

/**  
 * @Class Name : EgovCompassiOSAPIServiceImpl.java
 * @Description : EgovCompassiOSAPIServiceImpl Class
 * @Modification Information  
 * @
 * @  수정일         수정자                 수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012.07.23    서형주                  최초생성
 *   2012.08.27    서준식             iOS용 패키지로 변경 
 * 
 * @author Device API 실행환경팀
 * @since 2012. 07. 30
 * @version 1.0
 * @see
 * 
 */

@Service("EgovCompassiOSAPIService")
public class EgovCompassiOSAPIServiceImpl extends EgovAbstractServiceImpl implements EgovCompassiOSAPIService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EgovCompassiOSAPIServiceImpl.class);
	
	/** CompassiOSAPIDAO */
    @Resource(name="CompassiOSAPIDAO")
    private CompassiOSAPIDAO compassAPIDAO;

	/**
	 * 방향 정보를 등록한다.
	 * @param vo - 등록할 정보가 담긴 CompassiOSAPIVO
	 * @return 등록 결과
	 */
    public int insertCompassInfo(CompassiOSAPIVO vo) {
    	LOGGER.debug(vo.toString());
    	
    	return compassAPIDAO.insertCompassInfo(vo);    	
    }

    /**
	 * 방향 정보를 수정한다.
	 * @param vo - 수정할 정보가 담긴 CompassiOSAPIVO
	 * @return void형
	 */
    public void updateCompassInfo(CompassiOSAPIVO vo) {
    	compassAPIDAO.updateCompassInfo(vo);
    }

    /**
	 * 방향 정보를 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 CompassiOSAPIVO
	 * @return void형 
	 */
    public int deleteCompassInfo(CompassiOSAPIVO vo) {
    	return compassAPIDAO.deleteCompassInfo(vo);
    }

    /**
	 * 방향 정보를 조회한다.
	 * @param vo - 조회할 정보가 담긴 CompassiOSAPIVO
	 * @return 조회한 방향 정보
	 */
    public CompassiOSAPIVO selectCompassInfo(CompassiOSAPIVO vo) {
    	CompassiOSAPIVO resultVO = compassAPIDAO.selectCompassInfo(vo);
        if (resultVO == null) {
            throw new BaseRuntimeException(processException("info.nodata.msg"));
        }
        return resultVO;
    }

    /**
	 * 방향 정보 목록을 조회한다.
	 * @param VO - 조회할 정보가 담긴 CompassiOSAPIDefaultVO
	 * @return 방향 정보 목록
	 */
    public List<?> selectCompassInfoList(CompassiOSAPIDefaultVO searchVO) {
        return compassAPIDAO.selectCompassInfoList(searchVO);
    }

    /**
	 * 방향 정보 총 갯수를 조회한다.
	 * @param VO - 조회할 정보가 담긴 CompassiOSAPIDefaultVO
	 * @return 방향 정보 총 갯수
	 */
    public int selectCompassInfoListTotCnt(CompassiOSAPIDefaultVO searchVO) {
		return compassAPIDAO.selectCompassInfoListTotCnt(searchVO);
	}
    
}

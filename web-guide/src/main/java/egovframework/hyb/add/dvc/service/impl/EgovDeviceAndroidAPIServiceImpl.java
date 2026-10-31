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
package egovframework.hyb.add.dvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.hyb.add.dvc.service.DeviceAndroidAPIDefaultVO;
import egovframework.hyb.add.dvc.service.DeviceAndroidAPIVO;
import egovframework.hyb.add.dvc.service.EgovDeviceAndroidAPIService;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.cmmn.exception.BaseRuntimeException;

/**  
 * @Class Name : EgovDeviceAPIServiceImpl.java
 * @Description : EgovDeviceAPIServiceImpl Class
 * @Modification Information  
 * @
 * @  수정일                 수정자                 수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012.07.23    서형주                  최초생성
 * 
 * @author Device API 실행환경팀
 * @since 2012. 07. 23
 * @version 1.0
 * @see
 * 
 */

@Service("EgovDeviceAndroidAPIService")
public class EgovDeviceAndroidAPIServiceImpl extends EgovAbstractServiceImpl implements EgovDeviceAndroidAPIService {
    
    /** DeviceAndroidAPIDAO */
    @Resource(name="DeviceAndroidAPIDAO")
    private DeviceAndroidAPIDAO deviceAPIDAO;

    /**
     * 디바이스 정보를 등록한다.
     * @param vo - 등록할 정보가 담긴 DeviceAPIVO
     * @return 등록 결과
     */
    public int insertDeviceInfo(DeviceAndroidAPIVO vo) {        
        return deviceAPIDAO.insertDeviceInfo(vo);        
    }

    /**
     * 디바이스 정보를 수정한다.
     * @param vo - 수정할 정보가 담긴 DeviceAPIVO
     * @return void형
     */
    public void updateDeviceInfo(DeviceAndroidAPIVO vo) {
        deviceAPIDAO.updateDeviceInfo(vo);
    }

    /**
     * 디바이스 정보를 삭제한다.
     * @param vo - 삭제할 정보가 담긴 DeviceAPIVO
     * @return void형 
     */
    public int deleteDeviceInfo(DeviceAndroidAPIVO vo) {
        return deviceAPIDAO.deleteDeviceInfo(vo);
    }

    /**
     * 디바이스 정보를 조회한다.
     * @param vo - 조회할 정보가 담긴 DeviceAPIVO
     * @return 조회한 디바이스 정보
     */
    public DeviceAndroidAPIVO selectDeviceInfo(DeviceAndroidAPIVO vo) {
        DeviceAndroidAPIVO resultVO = deviceAPIDAO.selectDeviceInfo(vo);
        if (resultVO == null) {
            throw new BaseRuntimeException(processException("info.nodata.msg"));
        }
        return resultVO;
    }

    /**
     * 디바이스 정보 목록을 조회한다.
     * @param VO - 조회할 정보가 담긴 DeviceAPIDefaultVO
     * @return 디바이스 정보 목록
     */
    public List<?> selectDeviceInfoList(DeviceAndroidAPIDefaultVO searchVO) {
        return deviceAPIDAO.selectDeviceInfoList(searchVO);
    }

    /**
     * 디바이스 정보 총 갯수를 조회한다.
     * @param VO - 조회할 정보가 담긴 DeviceAPIDefaultVO
     * @return 디바이스 정보 총 갯수
     */
    public int selectDeviceInfoListTotCnt(DeviceAndroidAPIDefaultVO searchVO) {
        return deviceAPIDAO.selectDeviceInfoListTotCnt(searchVO);
    }
    
}

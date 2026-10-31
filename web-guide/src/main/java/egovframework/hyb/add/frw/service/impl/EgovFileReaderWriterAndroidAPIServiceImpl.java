/**
 * 
 */
package egovframework.hyb.add.frw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.hyb.add.frw.service.EgovFileReaderWriterAndroidAPIService;
import egovframework.hyb.add.frw.service.FileReaderWriterAndroidAPIVO;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**  
 * @Class Name : EgovFileReaderWriterAndroidAPIServiceImpl.java
 * @Description : EgovFileReaderWriterAndroidAPIServiceImpl
 * @
 * @  수정일                 수정자                 수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012. 8. 6.  나신일                   최초생성
 * 
 * @author 디바이스 API 실행환경 개발팀
 * @since 2012. 8. 6
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */
@Service("egovFileReaderWriterAndroidAPIService")
public class EgovFileReaderWriterAndroidAPIServiceImpl extends EgovAbstractServiceImpl implements
        EgovFileReaderWriterAndroidAPIService {

    /** FileReaderWriterAndroidAPIDAO */
    @Resource(name = "fileReaderWriterAndroidAPIDAO")
    private FileReaderWriterAndroidAPIDAO fileReaderWriterAPIDAO;

    /**
     * 파일 정보를 입력한다.
     * 
     * @param fileVO
     *            - 파일 정보가 담긴 FileReaderWriterAndroidAPIVO
     */
    public void insertFileInfo(FileReaderWriterAndroidAPIVO vo) {
        fileReaderWriterAPIDAO.insertFileInfo(vo);
    }

    /**
     * 업로드 된 파일의 상세 정보를 저장한다.
     * 
     * @param fileVO
     *            - 파일 정보가 담긴 FileReaderWriterAndroidAPIVO
     */
    public void insertFileDetailInfo(FileReaderWriterAndroidAPIVO vo) {
        fileReaderWriterAPIDAO.insertFileDetailInfo(vo);
    }

    /**
     * 파일 정보리스트를 조회한다.
     * 
     * @param fileVO
     *            - 파일 정보가 담긴 FileReaderWriterAndroidAPIVO
     */
    public List<?> selectFileInfoList(FileReaderWriterAndroidAPIVO vo) {
        return fileReaderWriterAPIDAO.selectFileInfoList(vo);
    }

    /**
     * 파일 정보를 조회한다.
     * 
     * @param fileVO
     *            - 파일 정보가 담긴 FileReaderWriterAndroidAPIVO
     */
    public FileReaderWriterAndroidAPIVO selectFileInfo(
            FileReaderWriterAndroidAPIVO vo) {
        return fileReaderWriterAPIDAO.selectFileInfo(vo);
    }

    /**
     * 파일 정보를 삭제한다.
     * 
     * @param fileVO
     *            - 파일 정보가 담긴 FileReaderWriterAndroidAPIVO
     */
    public int deleteFileInfo(FileReaderWriterAndroidAPIVO vo) {
        return fileReaderWriterAPIDAO.deleteFileInfo(vo);
    }

    /**
     * 파일 디테일 정보를 삭제한다.
     * 
     * @param fileVO
     *            - 파일 정보가 담긴 FileReaderWriterAndroidAPIVO
     */
    public int deleteFileDetailInfo(FileReaderWriterAndroidAPIVO vo) {
        return fileReaderWriterAPIDAO.deleteFileDetailInfo(vo);
    }

}

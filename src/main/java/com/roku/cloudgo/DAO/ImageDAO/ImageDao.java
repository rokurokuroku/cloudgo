package com.roku.cloudgo.DAO.ImageDAO;

import com.roku.cloudgo.service.SellerService;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Repository
public class ImageDao {
    public boolean saveImage(MultipartFile image, String fileName)
    {
        try {
            String destFileName = System.getProperty("user.dir")+"/src/main/webapp/images/" + fileName;
            File destFile = new File(destFileName);
            // 把浏览器上传的文件复制到希望的位置
            image.transferTo(destFile);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        finally {
            return true;
        }
    }
}

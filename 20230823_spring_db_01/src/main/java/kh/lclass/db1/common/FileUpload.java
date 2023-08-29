package kh.lclass.db1.common;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	public String savaFile(MultipartFile report, HttpServletRequest req) {
		String resultFileName = null;
		
		String realPath = req.getSession().getServletContext().getRealPath("");
		String savePath = "resources/upload";
		File folder = new File(resultFileName+savePath);
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		return resultFileName;
	}

}

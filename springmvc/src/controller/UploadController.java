package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.UploadedIamgeFile;

@Controller
public class UploadController {

	@RequestMapping("/uploadImage")
	public ModelAndView upload(HttpServletRequest req, UploadedIamgeFile imageFile) throws IllegalStateException, IOException {
		String name = RandomStringUtils.randomAlphanumeric(10);
		String filename = name + ".png";
		File file = new File(req.getServletContext().getRealPath("/image"), filename);
//		System.out.println(req.getServletContext().getRealPath("/image"));
//		System.out.println(file);
		file.getParentFile().mkdirs();
		imageFile.getImage().transferTo(file);		// 将上传文件写到服务器上指定的文件
		
		ModelAndView mav = new ModelAndView("showUploadedFile");
		mav.addObject("imageName", filename);
		return mav;
	}
}

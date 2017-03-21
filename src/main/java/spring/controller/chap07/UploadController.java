package spring.controller.chap07;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import spring.service.chap07.fileDao;
import spring.service.chap07.fileInfo;

@Controller
@RequestMapping("/chap07/uploadForm.do")
public class UploadController {

	@Autowired
	fileDao dao;

	public void setDao(fileDao dao) {
		this.dao = dao;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String form(){
		
		return "chap07/uploadForm";
	}
	

	/*@RequestMapping(method = RequestMethod.POST)
	public String upload(@RequestParam("name") String name, @RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2){
		
		System.out.println(file1.getOriginalFilename());
		System.out.println(file2.getOriginalFilename());
		
		return "chap07/completion";
	}*/
	
	@RequestMapping(method = RequestMethod.POST)
	public String upload(MultipartHttpServletRequest multipartHttpServletRequest){
		
		Iterator fileNames =multipartHttpServletRequest.getFileNames();
		
		
		while(fileNames.hasNext()){
			String fileName=(String) fileNames.next();
			MultipartFile file = multipartHttpServletRequest.getFile(fileName);
			System.out.println(file.getOriginalFilename());
			
			
			//local컴퓨터에 저장시키기
			long longNum = System.currentTimeMillis();
			Random r = new Random();
			int randomNum = r.nextInt(50);
			String o_name= file.getOriginalFilename();
			String saveName = longNum+"_"+randomNum+"_"+o_name;
			
			
			File localFile = new File("c://item//"+saveName);
			
			try {
				file.transferTo(localFile);
				
				//디비에 파일 정보 등록시키기
				fileInfo info = new fileInfo();
				info.setFileOriginalName(o_name);
				info.setFilePath(localFile.getPath());
				info.setFileSize(file.getSize());
				
				dao.insertFile(info);
				
				
				
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return "chap07/completion";
	}
	
	
	
	
	
	
}

package com.myshop.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.JsonObject;
import com.myshop.dto.BoardDTO;
import com.myshop.service.BoardService;
import com.myshop.util.PageMaker;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	HttpSession session;
	
	//DataTables jQuery 플러그인을 활용한 목록
	@RequestMapping(value="list.do", method = RequestMethod.GET)
    public String boardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.boardList();
		int cnt = boardService.boardCount();
		model.addAttribute("boardList", boardList);
		model.addAttribute("cnt", cnt);
        return "board/boardList";
    }
	
	//페이지메이커를 활용한 페이지 분리하기 목록
	@RequestMapping(value="pageList.do", method = RequestMethod.GET)
    public String boardPageList(@RequestParam("curPage") int curPage, Model model) throws Exception {
		int cnt = boardService.boardCount();
		//PageMaker page = new PageMaker(cnt, curPage);
		//PageMaker page = new PageMaker(cnt, curPage, 10);
		PageMaker page = new PageMaker(cnt, curPage, 10, 10);
		List<BoardDTO> boardPageList = boardService.boardPageList(page);
		model.addAttribute("boardPageList", boardPageList);
		model.addAttribute("page", page);
		model.addAttribute("cnt", cnt);
        return "board/boardPageList";
    }
	
	//일반 글쓰기 폼을 호출 
	@RequestMapping(value="addBoardForm.do", method = RequestMethod.GET)
    public String addBoardForm(Model model) throws Exception {
        return "board/addBoardForm";
    }
	
	//일반 글쓰기 처리
	@RequestMapping(value="addBoard.do", method = RequestMethod.POST)
    public String addBoard(BoardDTO board, Model model) throws Exception {
		boardService.addBoard(board);
        return "redirect:/board/list.do";
    }
	
	/* ckeditor 폼 호출 */ 
	@RequestMapping(value="addSmartBoardForm.do", method = RequestMethod.GET)
    public String addBoardSmartForm(Model model) throws Exception {
        return "board/addSmartBoardForm";
    }
	
	/* ckeditor를 활용한 글쓰기 처리 */
	@RequestMapping(value="addSmartBoard.do", method = RequestMethod.POST)
    public String addSmartBoard(BoardDTO board, Model model) throws Exception {
		boardService.addBoard(board);
        return "redirect:/board/pageList.do";
    }
	
	//파일 업로드
	@ResponseBody
	@RequestMapping(value = "fileupload.do")
    public void communityImageUpload(HttpServletRequest req, HttpServletResponse resp, MultipartHttpServletRequest multiFile) throws Exception{
		JsonObject jsonObject = new JsonObject();
		PrintWriter printWriter = null;
		OutputStream out = null;
		MultipartFile file = multiFile.getFile("upload");
		
		if(file != null) {
			if(file.getSize() >0 && StringUtils.isNotBlank(file.getName())) {
				if(file.getContentType().toLowerCase().startsWith("img/")) {
				    try{
				    	 
			            String fileName = file.getOriginalFilename();
			            byte[] bytes = file.getBytes();
			           
			            //String uploadPath = req.getSession().getServletContext().getRealPath("/views/upload"); //저장경로
			            String uploadPath = "D:\\kimyen\\jsp3\\web05\\src\\main\\webapp\\WEB-INF\\views\\upload";
//			            log.info("uploadPath:"+uploadPath);

			            File uploadFile = new File(uploadPath);
			            if(!uploadFile.exists()) {
			            	uploadFile.mkdir();
			            }
			            String fileName2 = UUID.randomUUID().toString();
			            uploadPath = uploadPath + "/" + fileName2 +fileName;
			            
			           
//						out = new FileOutputStream(new File(uploadPath)); 
//			 
			            out.write(bytes);
			            
			            printWriter = resp.getWriter();
			            //String fileUrl = "/views/upload/"+fileName2+fileName;
			            String fileUrl = "D:\\kimyen\\jsp3\\web05\\src\\main\\webapp\\WEB-INF\\views\\upload"+fileName2+fileName; //url경로
//			            log.info("fileUrl :" + fileUrl);
			            JsonObject json = new JsonObject();
			            json.addProperty("uploaded", 1);
			            json.addProperty("fileName", fileName);
			            json.addProperty("url", fileUrl);
			            printWriter.print(json);
			            log.info(json);
			 
			        }catch(IOException e){
			            e.printStackTrace();
			        } finally {
			            if (out != null) {
		                    out.close();
		                }
		                if (printWriter != null) {
		                    printWriter.close();
		                }
			        }
				}
			}
		}
	}
	
	@RequestMapping(value="boardRead.do", method = RequestMethod.GET)
    public String boardRead(@RequestParam("bno") int bno, Model model) throws Exception {
		BoardDTO board = boardService.boardRead(bno);
		model.addAttribute("board", board);
        return "board/boardRead";
    }
	
	@RequestMapping(value="updateBoard.do", method = RequestMethod.POST)
    public String updateBoard(BoardDTO board, Model model) throws Exception {
		boardService.updateBoard(board);
		return "redirect:/board/list.do";
    }
	
	@RequestMapping(value="deleteBoard.do", method = RequestMethod.GET)
    public String deleteBoard(@RequestParam("bno") int bno, Model model) throws Exception {
		BoardDTO board = new BoardDTO();
		board.setBno(bno);
		boardService.deleteBoard(board);
		return "redirect:/board/list.do";
    }
}
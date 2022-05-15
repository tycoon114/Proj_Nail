package kr.siat.menuController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.siat.boardservice.boardDeleteServiceImpl;
import kr.siat.boardservice.boardDetailServiceImpl;
import kr.siat.boardservice.boardInsertServiceImpl;
import kr.siat.boardservice.boardListServiceImpl;
import kr.siat.boardservice.boardModifyServiceImpl;
import kr.siat.controller.ModelAndView;
import kr.siat.dramaservice.dramaDetailServiceImpl;
import kr.siat.dramaservice.dramaInsertServiceImpl;
import kr.siat.dramaservice.dramaListServiceImpl;
import kr.siat.dramaservice.dramaModifyServiceImpl;
import kr.siat.dramaservice.dramaWatchServiceImpl;

public class dramaController implements Controller {

	@Override
	public ModelAndView request(HttpServletRequest req, HttpServletResponse resp) {
		
		if(req.getAttribute("service").equals("/category"))
			return new dramaListServiceImpl().request(req, resp);
		
		else if(req.getAttribute("service").equals("/detail"))
			return new dramaDetailServiceImpl().request(req, resp);
		
		else if(req.getAttribute("service").equals("/watchdrama"))
			return new dramaWatchServiceImpl().request(req, resp);
		
		else if(req.getAttribute("service").equals("/dramamodify"))
			return new dramaModifyServiceImpl().request(req, resp);
		
		else if(req.getAttribute("service").equals("/insert"))
			return new dramaInsertServiceImpl().request(req, resp);
		
		return null;
	}

}

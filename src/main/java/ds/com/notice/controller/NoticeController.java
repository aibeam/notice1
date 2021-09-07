package ds.com.notice.controller;

import ds.com.notice.dto.PageRequestDTO;
import ds.com.notice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
@Log4j2
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService service;

    @GetMapping("/")
    public String index(){
        return "redirect:/notice/list";
    }
    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model){
        log.info("list.................."+pageRequestDTO);
        model.addAttribute("result", service.getList(pageRequestDTO));
    }
}
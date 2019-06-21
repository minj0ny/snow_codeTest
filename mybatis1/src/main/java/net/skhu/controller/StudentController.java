package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Script;
import net.skhu.mapper.ScriptMapper;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	ScriptMapper scriptMapper;

	@RequestMapping("list/{scriptIdx}")
	public String list(Model model, @PathVariable int scriptIdx) {
		List<Script> scripts = scriptMapper.findAll(scriptIdx);
		int next = scriptIdx + 1;
		if (scripts.get(0).getFork() != 0) {
			next = scripts.get(0).getFork();
		}
		model.addAttribute("scripts", scripts);
		model.addAttribute("next", next);
		return "student/list";
	}

}

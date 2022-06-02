package com.mvc.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MvcController {

	@Autowired
	public SongRepo repo;

	@GetMapping("/")
	public String homepage(Model model){
		return "homepage";
	}

	@GetMapping("/viewsongs")
	public String viewSongs(Model model) {
		List<Song> songs = repo.findAll();
		model.addAttribute("allsongs",songs);
		return "viewsongs";
	}
	
	@GetMapping("/addsong")
	public String addSong(Model model) {
		model.addAttribute("song",new Song());
		return "addsong";
	}

	@PostMapping("/addsong")
	public String submitSong(@ModelAttribute("song") Song song) {
		repo.save(song);
		return "redirect:viewsongs";
	}
}

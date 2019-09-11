package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
  private static Map<String,String> dictionary;
  static {
    dictionary = new HashMap<>();
    dictionary.put("hello","xin chào");
  }
 @GetMapping("/translate")
private String translateEnglish(@RequestParam String englishWord, Model model){
    String vietnamWord = dictionary.get(englishWord);
    if(dictionary.containsKey(englishWord)){
      model.addAttribute("englishWord",englishWord);
      model.addAttribute("vietnameseWord",vietnamWord);
    }else{
      model.addAttribute("englishWord", "Not Found");
    }
    return "translate";
 }
 @GetMapping("/")
  private String showResult(){
    return "translate";
 }
}


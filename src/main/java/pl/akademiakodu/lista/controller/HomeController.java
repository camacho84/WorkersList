package pl.akademiakodu.lista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.lista.model.Todo;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    private static List<Todo> todoList = new ArrayList<>();
    
    @GetMapping("/glowna")
    public String main(){
        return "add";
    }

    @GetMapping("/dodawanie")
    public String getList(@ModelAttribute Todo nowy){
        todoList.add(nowy);
        return "redirect:/baba";
    }

    @GetMapping("/baba")
    public String getAll(ModelMap modelMap){
        modelMap.put("wpisy",todoList);
        return "list";
    }

    @GetMapping("/finished")
    public String finished(ModelMap modelMap){
        List<Todo> finished = new ArrayList<>();
        for ( Todo nowy: todoList ){
            if ( nowy.isFinished()){
                finished.add(nowy);
            }
        }
        modelMap.put("wpisy",finished);
        return "list";
    }

    @GetMapping("/unfinished")
    public String unfinished(ModelMap modelMap){
        List<Todo> unFinished = new ArrayList<>();
        for ( Todo nowy: todoList ){
            if ( !nowy.isFinished()){
                unFinished.add(nowy);
            }
        }
        modelMap.put("wpisy",unFinished);
        return "list";
    }


}

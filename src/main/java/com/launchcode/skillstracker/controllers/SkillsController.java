package com.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsOffered() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol type='1'>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillSelectorForm() {
        return "<html>" +
                "   <body>" +
                "       <form action='form' method='post' id='skill selector'>" + // submit a request to /hello via a GET request (default)
                "           <label for='name'>Name: </label><br>" +
                "           <input type='text' name='name' id='name'><br>" +
                "               <label for='favorite'>My favorite language: </label><br>" +
                "               <select name='languages' id='favorite' form='skill selector'" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='JavaScript'>JavaScript</option>" +
                "                   <option value='Python'>Python</option>" +
                "               </select><br>" +
                "               <label for='2favorite'>My second favorite language: </label><br>" +
                "               <select name='languages2' id='2favorite' form='skill selector'" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='JavaScript'>JavaScript</option>" +
                "                   <option value='Python'>Python</option>" +
                "               </select><br>" +
                "               <label for='3favorite'>My third favorite language: </label><br>" +
                "               <select name='languages3' id='3favorite' form='skill selector'" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='JavaScript'>JavaScript</option>" +
                "                   <option value='Python'>Python</option>" +
                "               </select><br>" +
                "           <input type='submit'>" +
                "       </form>" +
                "   </body>" +
                "</html";

    }

    @PostMapping("/form")
    @ResponseBody
    public String skillSelectorFormResponse (@RequestParam String name,
                          @RequestParam String languages,
                          @RequestParam String languages2,
                          @RequestParam String languages3) {
        return "<html>" +
                "   <body>" +
                "       <h1>" + name + "</h1>" +
                "       <ol type='1'>" +
                "           <li>" + languages + "</li>" +
                "           <li>" + languages2 + "</li>" +
                "           <li>" + languages3 + "</li>" +
                "       </ol>" +
                "   </body>" +
                "</html>";
    }

}

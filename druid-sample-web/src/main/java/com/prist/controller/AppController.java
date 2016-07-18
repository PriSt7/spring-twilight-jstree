package com.prist.controller;

import com.prist.model.Product;
import com.prist.service.ProductService;
import com.prist.util.SearchTree;
import com.prist.util.SearchTreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("/index")
    public String hello(ModelMap model) {
        model.addAttribute("message", "Hello ---world!");
        return "jstree";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<Product> json() {
        return productService.list();
    }


    @RequestMapping("/stree")
    @ResponseBody
    public List<SearchTree> stree() {

        List<SearchTree> searchTrees = new ArrayList<SearchTree>();
        SearchTree searchTree = new SearchTree(12L,"ooo");
        searchTree.setData("datddddddd");
        List<SearchTreeNode> searchTreeNodes = new ArrayList<SearchTreeNode>();
        searchTree.setChildren(searchTreeNodes);
        searchTreeNodes.add(new SearchTreeNode(34L,"ppp","ddddsa"));

        searchTreeNodes.add(new SearchTreeNode(35L,"pppp","dddsa"));
        searchTrees.add(searchTree);
        return searchTrees;
    }

}
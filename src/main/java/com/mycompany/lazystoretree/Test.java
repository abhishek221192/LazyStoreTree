/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lazystoretree;

import java.util.List;

/**
 *
 * @author abhisheksingh
 */
public class Test {
    private String name;
    private String id;
    private List<Node> children;

    public Test(String name, String id, List<Node> children) {
        this.name = name;
        this.id = id;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
    
}

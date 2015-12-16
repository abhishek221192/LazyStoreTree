/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lazystoretree;

import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/tree")
public class TreeService {

    @GET
    @Path("/hello")
    public Response hello() {
        return Response.status(200).entity("Hello Rest").build();

    }

    @GET
    @Path("/{id}")
    public Response nodes(@PathParam("id") String id) {

        if (id.contains("root")) {
            id = "C:\\Users\\abhisheksingh\\Editor\\Storage\\abhishek\\Projects\\Codes";
        }
        List<Node> nodeList = new ArrayList<Node>();
        id=id.replace("@","\\");
        
        System.out.println(id);
        folder(id, nodeList);
        
        Test test=new Test("Projects","root",nodeList);
        
        
        String nodeListJson = new Gson().toJson(test);
        return Response.status(200).entity(nodeListJson).build();

    }
    
    public void folder(String path, List<Node> nodeList) {
        File[] files = new File(path).listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    Node node = new Node(file.getPath().replace("\\","@"),file.getPath(), file.getName(), "File", "Language", ModeType.PRIVATE, !file.isFile(), file.listFiles().length>0, "String", "Testing", true, true, "Path");
                    nodeList.add(node);
                }
            }
            for (File file : files) {
                if (file.isFile()) {
                    Node node = new Node(file.getPath().replace("\\","@"),file.getPath(), file.getName(), "File", "Language", ModeType.PRIVATE, !file.isFile(),false, "String", "Testing", true, true, "Path");
                    nodeList.add(node);
                }
            }
        }

    }

}

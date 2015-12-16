package com.mycompany.lazystoretree;


public class Node {

    private String id;
    private String path;
    private String name;
    private String type;
    private String language;
    private ModeType mode;
    private boolean folder;
    private boolean git;
    private String projectName;
    private String projectId;
    private boolean menu;
    private String parent;
    private boolean root;
    private boolean children;

    public Node() {
    }

    public Node(String id,String path, String name, String type, String language, ModeType mode, boolean folder,boolean children, String projectName,String projectId,boolean menu,boolean git, String parent) {
        this.id = id;
        this.path=path;
        this.name = name;
        this.type = type;
        this.language = language;
        this.mode = mode;
        this.folder = folder;
        this.children=children;
        this.projectName = projectName;
        this.projectId=projectId;
        this.menu = menu;
        this.git=git;
        this.parent = parent;
        this.root=false;
    }

    public Node(String id,String path, String name, String type, String language, ModeType mode, boolean folder,boolean children, String projectName,String projectId,boolean menu,boolean git, boolean root) {
        this.id = id;
        this.path=path;
        this.name = name;
        this.type = type;
        this.language = language;
        this.mode = mode;
        this.folder = folder;
        this.children=children;
        this.projectName = projectName;
        this.projectId=projectId;
        this.menu = menu;
        this.git=git;
        this.root = root;
        this.parent=null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ModeType getMode() {
        return mode;
    }

    public void setMode(ModeType mode) {
        this.mode = mode;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    public boolean getChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }    

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean isGit() {
        return git;
    }

    public void setGit(boolean git) {
        this.git = git;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }    

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }
}

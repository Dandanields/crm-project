package com.daniel.crm_backend;

public class Todo {
    //properties
    private Integer id;
    private String description;
    private boolean isDone;

    //getter setter
    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
       return this.id;
    }

    
    public void setDescription(String desc){
        this.description = desc;
    }

    public String getDescription(){
       return this.description;
    }

    
    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }

    public boolean getIsDone(){
       return this.isDone;
    }

}

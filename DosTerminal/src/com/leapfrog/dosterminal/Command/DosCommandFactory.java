/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.Command;

/**
 *
 * @author ruman dangol
 */
public class DosCommandFactory {
    public static DosCommand get(String key){
        if((key.equalsIgnoreCase("md"))||(key.equalsIgnoreCase("mkdir"))){
            return new MDCommand();
        }else if(key.equalsIgnoreCase("rd")){
            return new RDCommand();
        }
        else if(key.equalsIgnoreCase("rename")){
            return new RenameCommand();
           
        }
        else if(key.equalsIgnoreCase("copy")){
            return new CopyCommand();
           
        }
        else if(key.equalsIgnoreCase("type")){
            return new TypeCommand();
           
        }
         else if(key.equalsIgnoreCase("make")){
            return new MakeFileCommand();
           
        }
         else if(key.equalsIgnoreCase("dir")){
            return new DirCommand();
           
        }
        return null;
    }
}

 
package com.leapfrog.dosterminal.Command;

import java.io.File;


public class MDCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
        if(params.length>1){
            File file=new File(params[1]);
            
           if(!(file.isDirectory()) && !(file.isFile())){
            file.mkdir();
            }else{
                System.out.println("A subdirectory or file test already exists.");
            }
       }else{
           System.out.println("The syntax of the command is incorrect.");
        }
    }
    
}


package com.leapfrog.dosterminal.Command;

import java.io.File;


public class RDCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
       if(params.length>1){
             File file=new File(params[1]);
              if((file.isDirectory()) || (file.isFile())){
            file.delete();
              }
              else{
                System.out.println("A subdirectory or file doesnot exists.");
            }
        }else{
            System.out.println("The syntax of the command is incorrect.");
        }
    }
    
    
}

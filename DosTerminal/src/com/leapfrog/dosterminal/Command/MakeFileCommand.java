/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.Command;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ruman dangol
 */
public class MakeFileCommand extends DosCommand {

    @Override
    public void execute(String[] params) {
        try{
               if(params.length>1){
            File file=new File(params[1]);
                  
          file.createNewFile();
            
       }else{
           System.out.println("The syntax of the command is incorrect.");
        }
    }catch(IOException ioe){
            System.out.println(ioe.getMessage());
   }
    
    //}
}}
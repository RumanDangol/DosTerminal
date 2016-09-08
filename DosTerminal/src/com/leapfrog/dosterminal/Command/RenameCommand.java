/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.Command;

import java.io.File;


public class RenameCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
        if(params.length>2){
              File file=new File(params[1]);
        file.renameTo(new File(params[2]));
            
        }else{
            System.out.println("The syntax of the command is incorrect.");
        }
    }
    
}

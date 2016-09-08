/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.Command;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
        try{
         if(params.length>1){
            
             InputStream is=new FileInputStream(params[1]);
             OutputStream os=new FileOutputStream(params[2]);
             byte[] data=new byte[1024*10];
             int i=0;
             while((i=is.read(data))!=-1){
                 os.write(data,0,i);
             }
             is.close();
             os.close();
          
         }else{
            System.out.println("The syntax of the command is incorrect.");
        }
         }catch(IOException ioe){
             System.out.println(ioe.getMessage());
             
         }
    }
    
}

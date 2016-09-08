/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.Command;

import java.io.File;
import java.util.Date;

/**
 *
 * @author ruman dangol
 */
public class DirCommand extends DosCommand {

    @Override
    public void execute(String[] params) {

        File pwd = new File(".");

        switch (params.length) {
            case 1:
                for (File f : pwd.listFiles()) {
                    System.out.println(f.getName());
                }
                break;
            case 2:
                if (params[1].equalsIgnoreCase("-f")) {

                    for (File f : pwd.listFiles()) {
                        if (f.isFile()) {
                            System.out.println(f.getName());
                        }
                    }

                }
                else if (params[1].equalsIgnoreCase("-d")) {

                    for (File f : pwd.listFiles()) {
                        if (f.isDirectory()) {
                            System.out.println(f.getName());
                        }
                    }
                }
                else if (params[1].equalsIgnoreCase("-l")) {

                        for (File f : pwd.listFiles()) {

                            System.out.print(f.getName() + "\t");
                            
                            System.out.print((f.getTotalSpace()/(1024*1024) )+ " MB\t");
                            System.out.println(new Date(f.lastModified()));

                        }

                    }

                
                break;
        }

    }

}

package javaapplication213;

import GUI.AdminWindow;
import java.io.File;
import java.util.ArrayList;

public class JavaApplication213
{
    public static void main(String[] args)
    {
        String projectPath = System.getProperty("user.dir");
        File currentDir = new File(projectPath); // Current Directory				
        checkDirectoryContents(currentDir);
        new AdminWindow().setVisible(true);
        
    }
    
    public static void checkDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        boolean CoachFile = true;
        boolean MemberFile = true;
        

        for (File file : files) {

            if (file.getName().contains("Coach.bin"))
                CoachFile = false;
            else if (file.getName().contains("Member.bin"))
                MemberFile = false;
            
        }
        if (CoachFile) 
        {
            Admin c = new Admin();
            c.CommitToCoachFile();
        }

        if (MemberFile) 
        {
            Admin m = new Admin();
            m.CommitMemberFile();
        }
    }
    
}

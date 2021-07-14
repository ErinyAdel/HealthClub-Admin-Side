package javaapplication213;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Admin extends Info implements Serializable
{
    private static ArrayList<Coach> coaches = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();
    
    public Admin() {
    }

    public Admin(int Age, String Email, String firstName, String Gender, int ID, String lastName, String Password) {
        super(Age, Email, firstName, Gender, ID, lastName, Password);
    }
     
    public static ArrayList<Member> getMembers() {
        return members;
    }

    public static void setMembers(ArrayList<Member> members) {
        Admin.members = members;
    }  
    
    public static ArrayList<Coach> getCoaches() {
        return coaches;
    }

    public static void setCoaches(ArrayList<Coach> coaches) {
        Admin.coaches = coaches;
    }   
    
    public boolean CommitToCoachFile() 
    {
        return BinaryFileManager.WriteToFile(CoachFileName,coaches);
    }

    public void LoadFromCoachFile() {
        coaches = (ArrayList<Coach>) BinaryFileManager.ReadFromFile(CoachFileName);
    }
    
    
    public boolean CommitMemberFile() 
    {
        return BinaryFileManager.WriteToFile(MemberFileName,members);
    }

    public void LoadFromMemberFile() {
        members = (ArrayList<Member>) BinaryFileManager.ReadFromFile(MemberFileName);
    }
    
    
    public boolean UpdateMember(Member m,int SearchID)
    {
        members = (ArrayList<Member>)BinaryFileManager.ReadFromFile(MemberFileName);
        for(int i=0; i<members.size(); i++)
        {    
            if (Arrays.asList(members.get(i).getID()).contains(SearchID)) 
            {
                members.set(i,m);
                return BinaryFileManager.WriteToFile(MemberFileName,members);
            }
        }    
        return false;
    }
    
    public boolean AddMember(Member m) 
    {           
        members = (ArrayList<Member>)BinaryFileManager.ReadFromFile(MemberFileName);
        members.add(m);
        
        return BinaryFileManager.WriteToFile(MemberFileName,members);
    }
    
    public boolean DeleteMember(int SearchID) 
    {
        members = (ArrayList<Member>)BinaryFileManager.ReadFromFile(MemberFileName);
        for(int i=0; i<members.size(); i++)
        {
            if(Arrays.asList(members.get(i).getID()).contains(SearchID))
            {
                members.remove(i);
                return BinaryFileManager.WriteToFile(MemberFileName,members);
            }       
        }
        return false;
    }
        
    public boolean SearchMember(int SearchID)
    {
        Member temp = new Member();
        members = (ArrayList<Member>)BinaryFileManager.ReadFromFile(MemberFileName);       
        for(int i=0; i<members.size(); i++)
        {
            if(Arrays.asList(members.get(i).getID()).contains(SearchID))
                return true;                
        }
        return false;
    }
    
    public ArrayList<Member> ListMembers()
    {
        members = (ArrayList<Member>) BinaryFileManager.ReadFromFile(MemberFileName);
        return members;
    }
    
    public int getIndexOfMembersArrList(int id) 
    {
        members = (ArrayList<Member>) BinaryFileManager.ReadFromFile(MemberFileName);
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }
    //**************************************************************************************************************
    public boolean AddCoach(Coach c) 
    {   
        coaches = (ArrayList<Coach>) BinaryFileManager.ReadFromFile(CoachFileName);
        coaches.add(c);
        
        return BinaryFileManager.WriteToFile(CoachFileName,coaches);
    }
    
    public int getIndex(int id) 
    {
        coaches = (ArrayList<Coach>) BinaryFileManager.ReadFromFile(CoachFileName);
        for (int i = 0; i < coaches.size(); i++) {
            if (coaches.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean UpdateCoach(Coach c ,int SearchID)
    {
        coaches = (ArrayList<Coach>)BinaryFileManager.ReadFromFile(CoachFileName);
        for(int i=0; i<coaches.size(); i++)
        {    
            if (Arrays.asList(coaches.get(i).getID()).contains(SearchID)) 
            {
                coaches.set(i,c);
                /*coaches.remove(i);
                coaches.add(c);*/
                return BinaryFileManager.WriteToFile(CoachFileName,coaches);
            }
        }    
        return false;    
    }
  
    public boolean DeleteCoach(int SearchID) 
    {
        coaches = (ArrayList<Coach>)BinaryFileManager.ReadFromFile(CoachFileName);
        for(int i=0; i<coaches.size(); i++)
        {
            if(Arrays.asList(coaches.get(i).getID()).contains(SearchID))
            {
                coaches.remove(i);
                return BinaryFileManager.WriteToFile(CoachFileName,coaches);
            }       
        }
        return false;
    }
    
    public int indexOfCoachesArrList(int SearchID)
    {
        coaches = (ArrayList<Coach>) BinaryFileManager.ReadFromFile(CoachFileName);
        for(int i=0; i<coaches.size(); i++)
        {
            if(Arrays.asList(coaches.get(i).getID()).contains(SearchID))
                return i;
        }
        return -1;
    }
    
    public boolean SearchCoach(int SearchID)
    {
        coaches = (ArrayList<Coach>)BinaryFileManager.ReadFromFile(CoachFileName);       
        for(int i=0; i<coaches.size(); i++)
        {
            if(Arrays.asList(coaches.get(i).getID()).contains(SearchID))
                return true;                
        }
        return false;
    }
    
    public ArrayList<Coach> ListCoaches()
    {
        coaches = (ArrayList<Coach>)BinaryFileManager.ReadFromFile(CoachFileName);
        return coaches;
    }
    
    public boolean AssignCoach(int SearchMemberID,int SearchCoachID)
    {
        coaches = (ArrayList<Coach>) BinaryFileManager.ReadFromFile(CoachFileName);
        members = (ArrayList<Member>)BinaryFileManager.ReadFromFile(MemberFileName);
        Member m = new Member();
        Coach c = new Coach();
        boolean flag = false;
        m.setCoachID(SearchCoachID);
        
        int foundCoachID = 0;
        int numofmembers = 0;
        int i;
        for(i=0; i<coaches.size(); i++)
        {          
            if(Arrays.asList(coaches.get(i).getID()).contains(SearchCoachID))
            {
                if(coaches.get(i).getNumOfMembers() <= 5)
                {
                    numofmembers = coaches.get(i).getNumOfMembers();  
                    coaches.get(i).setNumOfMembers(numofmembers) ;
                    c.setNumOfMembers(numofmembers);
                    foundCoachID = coaches.get(i).getID();
                    flag = true;
                    break;
                }
            }                                         
        }        
        for(int j=0; j<members.size(); j++)
        {
            if(Arrays.asList(members.get(j).getID()).contains(SearchMemberID))
            {
                if(flag == true)
                {
                    ++numofmembers;
                    coaches.get(i).setNumOfMembers(numofmembers);
                    members.get(j).setCoachID(foundCoachID);   
                    System.out.println(coaches.get(i).getNumOfMembers());
                    BinaryFileManager.WriteToFile(CoachFileName,coaches);
                    BinaryFileManager.WriteToFile(MemberFileName,members);
                    return true;
                }                    
            }
        }
        return false;
    }
    
    @Override
    public boolean Login(String Username, String Password) 
    {
        return getEmail().equals("AdminHealthClub@gmail.com") && getPassword().equals("Admin123");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author DELL
 */
import java.util.*;
 import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mavenproject3 {
     
     static ArrayList<String>n1=new ArrayList<>();
       static ArrayList<String>g1=new ArrayList<>();
        static ArrayList<String>a1=new ArrayList<>();
          static ArrayList<Boolean>b1=new ArrayList<>();
          
           static ArrayList<String>s2=new ArrayList<>();
            static ArrayList<String>id2=new ArrayList<>();
             static ArrayList<String>pho2=new ArrayList<>();
              static ArrayList<String>addbookss=new ArrayList<>();
             
              static ArrayList<String>searchboo=new ArrayList<>();
               static ArrayList<String>searchbo=new ArrayList<>();
               static ArrayList<String>searchb=new ArrayList<>();
              
    public static void main(String[] args) {
       
       

        String li="null";
        String lin="null";
        
    //   File mufile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt");
    //  if( mufile.delete()){
    //      System.out.println("file delete");
    //  }      else{
   //       System.out.println("file is not deleted");
   //   }
        
        SwingUtilities.invokeLater(()->{
           Mavenproject3 aik=new Mavenproject3();
           aik.createGUI();
        });
       
        
    
        
        
        User ss=new User();
         Mavenproject3 aik=new Mavenproject3(); 
 
       
        Scanner cs=new Scanner(System.in);
        Book book= new Book();
       
         System.out.println("enter book");
        int a=cs.nextInt();
     String bookline="null";
     
     int xx=10;
   
        //file handeling user
        /*  try{
             FileWriter myfilewriter=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\userr.txt",true);
             
              for(int i=0;i<s2.size();i++){
       myfilewriter.write("studentname: "+s2+"id: "+id2+"phonenumber: "+pho2+"borrowedbook: "+addbookss);
 myfilewriter.close();
   }
         }
         catch(IOException e){
}
    
       try{
         String line;
         System.out.println("answer is ");
           File mifile=new File ("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\userr.txt");
         Scanner ff=new Scanner(mifile  );
         while(ff.hasNextLine()){
             line=ff.nextLine();
            // System.out.println(line);
         }
         ff.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
    */
              //file handeling book
         /*       try{
             FileWriter myfilewrite=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt",true);
             
             for(int i=0;i<n1.size();i++){
             myfilewrite.write(" name: "+ n1.get(i)+" author: "+a1.get(i)+" genre: "+g1.get(i)+" statusavailable: "+n1.get(i)+b1.get(i));
             myfilewrite.close();
        }
         }
         catch(IOException e){
}
    
       try{
       
         System.out.println("answer is ");
           File mifile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt");
         Scanner fs=new Scanner(mifile  );
         while(fs.hasNextLine()){
             lin=fs.nextLine();
            // System.out.println(lin);
         }
         fs.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
    
        
       //jhji
         try{
             FileWriter myfalewrite=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\marja.txt",true);
            for(int i=0;i<searchb.size();i++){
                 myfalewrite.write(" "+searchb);
             myfalewrite.close();
            }
               
            
                  
             
            
         }
         catch(IOException e){
}
       */
        
    
    }
    public void createGUI(){
           JFrame frame=new JFrame("**--Library Manegment System--+**") ;
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,400);
    frame.setLayout(new FlowLayout());
    
    JButton addBook=new JButton("Add Book");
    addBook.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            //file
             try{
         
       String lin;
           File mifile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt");
         Scanner fs=new Scanner(mifile  );
         while(fs.hasNextLine()){
             lin=fs.nextLine();
            // System.out.println("answer is "+lin);
         }
         fs.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
       
            //file
        one();   
        //file
         try{
             FileWriter myfilewrite=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt",true);
             
             for(int i=0;i<n1.size();i++){
             myfilewrite.write(" name: "+ n1.get(i)+" author: "+a1.get(i)+" genre: "+g1.get(i)+" statusavailable: "+n1.get(i)+b1.get(i));
             myfilewrite.close();
        }
         }
         catch(IOException p){
}
    
     
        //file
        
        }
        });

   JButton adduser = new JButton("Add User");
adduser.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        //h
         try{
         String line;
         System.out.println("answer is ");
           File mifile=new File ("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\userr.txt");
         Scanner ff=new Scanner(mifile  );
         while(ff.hasNextLine()){
             line=ff.nextLine();
            // System.out.println(line);
         }
         ff.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
    
        //h
        two();
        
          try{
             FileWriter myfilewriter=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\userr.txt",true);
             
              for(int i=0;i<s2.size();i++){
       myfilewriter.write("studentname: "+s2+"id: "+id2+"phonenumber: "+pho2+"borrowedbook: "+addbookss);
 myfilewriter.close();
   }
         }
         catch(IOException p){
}
    
      
        //file
    }
});
JButton checkAvailibility = new JButton("Check Availibility");
checkAvailibility.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    
       three();
    
    }
});
JButton changeAvailibility = new JButton("Change Availibility");
changeAvailibility.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       four();
    }
});

JButton borrowbook = new JButton("Issue Book");
borrowbook.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        //h
        
        //h
        six();
       
        
    }
});

    frame.add(addBook);
    frame.add(adduser);
    frame.add(checkAvailibility);
    frame.add(changeAvailibility);
    frame.add(borrowbook);
   
    
    frame.setVisible(true);
    
    }

    public void one(){
        
         String author="null";
         String name="null";
         String genre="null";
 Scanner cs=new Scanner(System.in);
      try{
          author=   JOptionPane.showInputDialog("Enter Author Name");
         if(author==null || author.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      }
       try{
            name=   JOptionPane.showInputDialog("Enter Title"); 
         if(name==null || name.trim().isEmpty())
         {
             JOptionPane.showMessageDialog(null,"");
         }
      }catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      }
        try{
          genre=   JOptionPane.showInputDialog("Enter Genre"); 
         if(genre==null || genre.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
      }catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      }
        
         
      
     
      
      int result =JOptionPane.showOptionDialog(null, "Availability", "Boolean Input", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yes","No"}, "Yes");
      boolean available= (result==JOptionPane.YES_OPTION);
             
     
       
        
        n1.add(name);
         a1.add(author);
         g1.add(genre);
         b1.add(available);
       
}
     private void two(){
 Scanner cs=new Scanner(System.in);
       String name="null";
        String contactnumber="null";
         String userid="null";
         try{
           name=   JOptionPane.showInputDialog("Enter User Name");
         if(name==null || name.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      } 
        try{
          contactnumber=   JOptionPane.showInputDialog("Enter Contact Number"); 
         if(contactnumber==null || contactnumber.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      }
         try{
           userid=   JOptionPane.showInputDialog("Enter User ID"); 
         if(userid==null || userid.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      }
        
     
     
      
       
        
        s2.add(name);
        pho2.add(contactnumber);
        id2.add(userid);
      
        
       
}
     private void three(){
         boolean xxy=false;
         
         //f
           String lin="null";
    
       try{
      
       
           File mifile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt");
         Scanner fs=new Scanner(mifile  );
         while(fs.hasNextLine()){
             lin=fs.nextLine();
            // System.out.println(lin);
         }
         fs.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
    
         //f
         String booksearched="null";
           try{
            booksearched=JOptionPane.showInputDialog("Enter Book Name");
         if(booksearched==null || booksearched.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      }            
         
                    
                    
                    
                     
                           String searchbook[]=lin.split("\\s");
                             for(String x:searchbook){
                                 searchboo.add(x);  }
                             for(int i=0;i<searchboo.size();i++){
                                 if(searchboo.get(i).compareTo(booksearched+"true")==0){
                                     xxy=true;
                                 }
                             }        
                                 
                             
                             
                             if(xxy){
                                  JOptionPane.showMessageDialog(null, "Book is Availible");
                             }
                             else {
                                   JOptionPane.showMessageDialog(null,"book is not available");
                             }
     }
     
     private void four(){
         String lin="null";
         //f
           try{
         
       
           File mifile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt");
         Scanner fs=new Scanner(mifile  );
         while(fs.hasNextLine()){
             lin=fs.nextLine();
            // System.out.println("answer is "+lin);
         }
         fs.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
       
         //f
         String bbb="null";
         String bbbstatus="null";
            Scanner css=new Scanner(System.in);
             try{
            bbb=JOptionPane.showInputDialog("Enter Book Name");
         if(bbb==null || bbb.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      } 
              try{
             bbbstatus=JOptionPane.showInputDialog("Enter book Status");
         if(bbbstatus==null || bbbstatus.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      } 
                     
                     
                      
                    
                     String y=lin;
                     String searchbookk[]=lin.split("\\s");
                     for(String x:searchbookk){
                         searchbo.add(x);
                     }
                     for(int i=0;i<searchbo.size();i++){
                         String yx=(bbb+bbbstatus);
                         if((searchbo.get(i)).compareTo(yx)==0){
                             System.out.println(bbb+bbbstatus);
                             switch(bbbstatus){
                                 case "true":
                                     int ind=searchbo.indexOf(bbb+bbbstatus);
searchbo.set(ind,bbb+"false");
                                     break;
                                 case "false":
                                    ind=searchbo.indexOf(bbb+bbbstatus);
searchbo.set(ind,bbb+"true");
                             }
                             


                            
                         }
                     }
                      File mufile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt");
     if( mufile.delete()){
          JOptionPane.showMessageDialog(null,"File Deleted");
     }      else{
          JOptionPane.showMessageDialog(null,"File is not Deleted");
      }
             
     
         try{
             FileWriter myfilewrite=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\bookk.txt",true);
             
             
             myfilewrite.write(""+searchbo);
             myfilewrite.close();
        
         }
         catch(IOException e){
}
                     
     }
   
     private void six(){
          Scanner cse=new Scanner(System.in);
                 String uname="null";
                 String bname="null";
          try{
              bname=JOptionPane.showInputDialog("Enter Book Name");
         if(bname==null || bname.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      } 
          try{
           uname=JOptionPane.showInputDialog("Enter User Name");
         if(uname==null || uname.trim().isEmpty() )
         {
             JOptionPane.showMessageDialog(null,"");
         }
             }
      catch(Exception e){
           JOptionPane.showMessageDialog(null,"");
      } 
          
          
                   
                   
                    
                     
                     
                     //file id
                     String lion="null";
                       try{
        
        
         
         
         
         File mifile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\marja.txt");
         Scanner ffal=new Scanner(mifile  );
         while(ffal.hasNextLine()){
             lion=ffal.nextLine();
             //System.out.println("answer is "+lion);
         }
         ffal.close();
         
         
     }
     catch(FileNotFoundException ex){
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex); }
    boolean zy=false;
    String oo=lion;
    //h
        
                //h
   
    //h
          
    
                  
          
        //h
    
    
    
    String abb[]=oo.split("\\s");
         for(String x:abb){
             searchb.add(x);
         } 
        // for(int i=0;i<searchb.size();i++){
           //  if( uname.compareTo(searchb.get(i))==0){
           //      zy=true;
                
           //  }
            
        // }if(zy){
           //   int indi=searchb.indexOf(uname);
           //      searchb.set(indi," "+uname+" "+bname+" ");
        // }
       //  else{
             searchb.add(" username "+uname+" bookname "+bname+" ");
        // }
     StringBuilder bbs=new StringBuilder("");
         for(String bo:searchb){
             bbs.append(bo.toString()).append("\n");
         }

        //h
         File mufile=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\marja.txt");
     if( mufile.delete()){
          JOptionPane.showMessageDialog(null,"File Deleted");
     }      else{
          JOptionPane.showMessageDialog(null,"File is not Deleted");
      }
             
            try{
             FileWriter myfalewrite=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\marja.txt");
           
                 myfalewrite.write(" "+bbs.toString());
             myfalewrite.close();
            
            
         }
         catch(IOException p){
}
        //h
     }
}
    

 
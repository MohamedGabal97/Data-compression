/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALKODS
 */
public class LZ78_ {

    public List<Tupel> compress(String s) 
    {
        List<Tupel> list = new ArrayList<Tupel>();
        List<String> arr = new ArrayList<String>();
        String data=s;
        String next;
        
        int position = 0;
        int found = 0;
        int len;
        
        boolean t = true;
        
        arr.add("");
        while(data.length() > 0)
        {
            len=1;
            next=data.substring(0, len);
            if(arr.indexOf(next) == -1){
                arr.add(next);
                list.add(new Tupel(0,next));
                data=data.substring(len);
                continue;
            } 
            do
            {
                next=data.substring(0, len);
                found=arr.indexOf(next);
                if(found != -1){
                    position = found;
                    len ++;
                    if(found != -1 && (data.length()-next.length()) == 0){                    
                        t = false;
                        data=data.substring(next.length());
                        break;

                    }
                }
                
            }while(found != -1); 
            
            if(t){       
                arr.add(next);
                list.add(new Tupel(position , next.substring(next.length() - 1)));
                data=data.substring(next.length());
            } 
       
        }
    
        return list;
    }
            
    public static void main(String[] args) {
        
        
    }
    
}

package project;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diaa
 */
public class Lz77T {
   
    public ArrayList <LZ77_1> compress (String data){
        ArrayList <LZ77_1> list = new ArrayList <LZ77_1>();
        String input=data;
        String search="";
        String next;
        int foundposition;
        int goodposition=0;
        while (input.length()>0){
            int end=1;
            next=input.substring(0, end);
            if(search.indexOf(next)==-1){
                search+=next;
                list.add(new LZ77_1(0,0,next));
                input=input.substring(end);
                
                continue;
                
            }
            do{
                if(end<=input.length()){
                next=input.substring(0, end);
                foundposition=search.indexOf(next);
                if(foundposition!=-1)
                    goodposition=search.length()-foundposition;          
                end++;
                
                
            }
                else{
                    break;
                }}
            while(foundposition!=-1);
            search+=next.substring(0, next.length());
            input=input.substring(next.length());
            list.add(new LZ77_1(goodposition,next.length()-1,next.substring(next.length()-1)));
                   
        }
        return list;
    }
public static void main(String[] args){
    
    }    
    
}

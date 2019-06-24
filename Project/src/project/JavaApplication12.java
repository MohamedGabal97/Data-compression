/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
/**
 *
 * @author ALKODS
 */
public class JavaApplication12 {

    public float Arithmetic (char[] text){
        
        float res;
        int count = text.length;
        
        float lower=0;
        
        int z = 0 ;
        
        float lowr =0 ,highr=1;
        float low =0, high =0;
        
        //probability
        float c = count;
        int pro , sum=0 , q=0;
        float []pro1=new float [count];
        char[] litter = new char[count];
        char []data=new char[count];
        char input = 0;
        int x=0;
        
        for(int u=0;u<count;u++){
            data[u]=text[u];
        }
        
        for(int i=0 ; i<count ; i++){
            pro=0;
            if(sum < count){
                if(data[i] !=0 ){
                    input=data[i];
                    q++;
                    for(int j=i ; j<count ; j++){
                        if( input == data[j]){
                            pro++;
                            data[j]= 0;
                            
                        }
                    }
                }
            }
            sum+=pro;
            pro1[i]=pro/c;
            litter[i]=input;
        }
        
        float[] p=new float [q];
        char[] lit=new char[q];
        
        for(int n=0 ; n<count ; n++){
            
            if(pro1[n] != 0){
                
                p[x]=pro1[n];
                lit[x]=litter[n];
                x++;
                
            }
        }
        
        float[] l = new float[q] ;
        float[] h = new float[q] ;
        
       
        // SYMPOL OF LOW & HIGH
        for(int j=0 ; j<q ; j++){
            l[j]=lower;
            h[j]=l[j]+p[j];
            
            lower=h[j];
        }
        
        for(int k=0 ; k<count ; k++){
            for(int v=0 ; v<q ; v++){
                if(text[k] == lit[v]){
                    z=v;
                    break;
                }
                
            }
            low=lowr+l[z] * (highr-lowr);
            high=lowr+h[z] * (highr-lowr);
             
            lowr=low;
            highr=high;
        }
        
        res=(lowr+highr)/2;
        return res;
        
    }
    
    public String Decompression (char[] input , float code , int a){
        
        int count=input.length;
        
        
        float lowofr=0 , highofr=1;
        float low=0 , high=0;
        
        int s = 0;
        
        float res=0;
        char[] sympol=new char[a];
        
        //probability
        float c=count;
        int pro , sum=0 , q=0;
        float []pro1=new float [count];
        char[] litter = new char[count];
        char[] data = new char[count];
        char in = 0;
        int x=0;
        
        for(int u=0;u<count;u++){
            data[u]=input[u];
        }
        
        for(int i=0 ; i<count ; i++){
            pro=0;
            if(sum < count){
                if(data[i] !=0 ){
                    in=data[i];
                    q++;
                    for(int j=i ; j<count ; j++){
                        if( in == data[j]){
                            pro++;
                            data[j]= 0;
                            
                        }
                    }
                }
            }
            sum+=pro;
            pro1[i]=pro/c;
            litter[i]=in;
        }
        
        float[] p=new float [q];
        char[] lit=new char[q];
        for(int n=0 ; n<count ; n++){
            
            if(pro1[n] != 0){
                
                p[x]=pro1[n];
                lit[x]=litter[n];
                x++;
                
            }
        }
        
        float lower=0;
        float[] l = new float[count] ;
        float[] h = new float[count] ;
        
        for(int j=0 ; j<count ; j++){
            l[j]=lower;
            h[j]=l[j]+pro1[j];
            
            lower=h[j];
        }
        for(int i=0 ; i<a ; i++){
            res=(code-lowofr)/(highofr-lowofr);
            for(int y=0 ; y<count ; y++){
                
                if(res > l[y] && res < h[y]){
                    
                    s=y;
                    
                    low = lowofr + l[y]*(highofr-lowofr);
                    high = lowofr + h[y]*(highofr-lowofr);
                    
                    lowofr=low;
                    highofr=high;
                    
                    sympol[i]=input[s];                  
                    break;
                    
                }
                
            }
            
        }
          String de="";
        for(int i=0 ; i<a ; i++){
            de+=sympol[i];
        }
         return de;
    }
    
    
    public static void main(String[] args) {
        
        //Compression
        char[] ar={'a','a','b','a','a','c','a','a','d'};
        
        JavaApplication12 a= new JavaApplication12();
        float res=a.Arithmetic(ar);
        System.out.println("output:"+res);
        
        
        //Decompression
        int x=ar.length;
        JavaApplication12 b=new JavaApplication12();
        //Output Decompression
        System.out.print( b.Decompression(ar, res, x));
        
    }
    
}

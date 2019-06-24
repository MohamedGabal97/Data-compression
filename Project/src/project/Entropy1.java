/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


public class Entropy1 {
    public float Entropy (char []text){
        char []data=text;
        char input = 0;
        
        int count=data.length;
        float c=count;
        float p = 0;
        
        int sum=0;
        
        float []pro=new float [count];
        float []pro1=new float [count];
        double[]l=new double[count];
        double[]log=new double[count];
        char []litter=new char[count]; 
        float res =0;
        
        for(int i=0 ; i<count ; i++){
            p=0;
            if(sum != count){
                if(data[i] !=0 ){
                    input=data[i];
                    for(int j=i ; j<count ; j++){
                        if( input == data[j]){
                            p++;
                            data[j]= 0;
                        }
                    }
                }
            }
            //sum+=p;
            litter[i]=input;
            pro[i]=p/c;
            pro1[i]=1/pro[i];
            l[i]=(Math.log(pro1[i])/Math.log(2));
            log[i]=pro1[i]*l[i];
            
        }
        for(int a=0 ; a<data.length ; a++){
            System.out.println("prbability : "+ pro[a]);
            
        }

        for(int s=0 ; s<data.length ; s++){
            if(pro[s] != 0){
                res+=log[s];     
            }
        }
        System.out.println(res);
        return res;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        char[]l={'a','a','b','a','a','c','a','a','d','a'};
        Entropy1 t=new Entropy1();
        t.Entropy(l);
        
        }
    
    
}
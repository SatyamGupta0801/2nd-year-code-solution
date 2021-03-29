package com.java;
import java.util.*;
public class Program1 {
	public static void main(String args[])
	{
		//TO DO
	}
	
	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> output=new ArrayList<>();
        int top=0,down=r-1,left=0,right=c-1,dir=0;
        
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    output.add(matrix[top][i]); 
                }
                 top++;
            }
            if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                   output.add(matrix[i][right]);   
                }
                right--;
            }
            if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                   output.add(matrix[down][i]);   
                }
                down--;
            }
            if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                   output.add(matrix[i][left]);   
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return output;
    }
}

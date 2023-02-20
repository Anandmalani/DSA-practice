package Stackimp;

import java.util.Stack;

public class mas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
		  

//	
		    int n=7;
		    int[] a = {6,2,5,4,5,1,6};
//		    for(int i = 0; i < n; i++){
//		       a[i] = Integer.parseInt(br.readLine());
//		    }
		    Stack<Integer> st=new Stack<>();
		    Stack<Integer> st1=new Stack<>();
		    int b[]=new int[n];
		    int c[]=new int[n];
		    for(int i=0;i<n;i++){
		        if(st.size()==0){
		            b[i]=-1;
		        }
		        else if(a[i]>a[st.peek()]){
		            b[i]=st.peek();
		        }
		        else{
		            while(st.size()>0 && a[i]<=a[st.peek()]){
		                st.pop();
		            }
		            if(st.size()==0){
		                b[i]=-1;
		            }
		            else{
		                b[i]=st.peek();
		            }
		            
		        }
		        st.push(i);
		        
		        }
		        //  System.out.println(b[1]);
		        st.clear();
		        for(int i=a.length-1;i>=0;i--){
		        if(st1.size()==0){
		            c[i]=a.length;
		        }
		        else if(a[i]>a[st1.peek()]){
		            c[i]=st1.peek();
		        }
		        else{
		            while(st1.size()>0 && a[i]<=a[st1.peek()]){
		                st1.pop();
		            }
		            if(st1.size()==0){
		                c[i]=a.length;
		            }
		            else{
		                c[i]=st1.peek();
		            }
		            
		        }
		        st1.push(i);
		        
		        }
		        int d[]=new int[n];
		        int i=0;
		        for(int j=c.length-1;j>=0;j--){
		            d[i]=c[j];
		            i++;
		        }
		        int max=0;
		        for(int k=0;k<n;k++){
		            int s=(d[k]-b[k]-1)*a[k];
		            if(max < s){
		                max=s;
		                        System.out.println(max);
		            }
		        }
		        System.out.println(max);
		        for(int p=0;p<n;p++) {
		        	System.out.println(b[p]);
		        	System.out.println(d[p]);
			        
		        	
		        	
		        }


		    // code
		 

	}

}

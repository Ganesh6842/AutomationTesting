package Array;

public class ArrayRotate {
public static void main(String[] args) {
	
	     
			int [] arr1 = {1,5,8};
			int [] arr2 = {1,5,8};
	 		
	                  boolean status = false;
	    if(arr1.length==arr2.length){
	         for(int i=0;i<arr1.length;i++){
	 		if(arr1[i]==arr2[i]){
					status = true;}
	                else{
	                     status = false;
	                         break;
	                    }
	         }
	    }else{
	System.out.println("Not equal");
	}
	if(status){
	System.out.print("equal");
	}else{
	System.out.print(" not equal");


	    }
	    

}
}

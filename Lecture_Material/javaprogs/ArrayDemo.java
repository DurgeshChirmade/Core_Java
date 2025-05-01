public class ArrayDemo {
    public static void main(String [] args) {

	/*int [] arr;   //declaration
        arr = new int[5];   //instantiation
        arr[0] = 34;   //initialization
        arr[1] = 45;
        arr[2] = 12;
        arr[3] = 23;
        arr[4] = 10;*/
        //int [] arr = {34,45,23,31,20};  
        
        if(args.length != 5){
	    System.out.println("Insufficient arguments...");
	    return;
        } 
        int [] arr = new int[5];
        for(int i=0;i<args.length;i++){
            arr[i]= Integer.parseInt(args[i]);
        } 
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);

	int max = arr[0];
        int min = arr[0];
	int sum = 0;
   	for(int i=0;i<arr.length;i++){	
		if(max<arr[i]){
			max=arr[i];		
		}
		if(min>arr[i]){
			min=arr[i];
		}
		sum=sum+arr[i];	

 	}
	System.out.println("Max : "+max);
	System.out.println("Min : "+min);
	System.out.println("Average : "+ ((float)sum)/arr.length);
   }
}
package cisc3130hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class hw5 {
	  static int switches;
	  static int compare;
	  /**
	   * Program compares the compares and switches of three different sorting methods with 
	   * information from 9 different  files
	   * @param args
	   * @throws FileNotFoundException
	   */
public static void main(String[] args) throws FileNotFoundException {
	System.out.println("Almost Sorted Array of 10");
	Integer arr[]=read("10almostsort");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	Integer quickarr[]=arr.clone();
	quickSort(quickarr,0,arr.length-1);
	System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	Integer mergearr[]=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Array of 10 in random order");
	 arr=read("10random");
	 System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Array of 10 in reverse order");
	arr=read("10reverse");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Almost Sorted Array of 30");
	arr=read("30almost");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Array of 30 in random order");
	arr=read("30random");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Array of 30 in reverse order");
	arr=read("30reverse");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Almost Sorted Array of 50");
	arr=read("50almost");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Array of 50 in random order");
	arr=read("50random");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	System.out.println("Array of 50 in reverse order");
	arr=read("50reverse");
	System.out.print("Bubble sort ");bubbleSort(arr);
	switches=0;
	compare=0;
	 quickarr=arr.clone();
	 quickSort(quickarr,0,arr.length-1);
	 System.out.println("Quicksort "+Arrays.toString(quickarr));
	System.out.println(Arrays.toString(quickarr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	switches=0;
	compare=0;
	 mergearr=arr.clone();
	merge(mergearr,0,arr.length-1);
	System.out.println("Mergesort "+Arrays.toString(mergearr));
	System.out.println("switches: "+switches);
	System.out.println("Comparisions: "+compare);
	
	}
static void bubbleSort(Integer[] inputarr) {  
	Integer arr[]=inputarr.clone();
    int n = arr.length;  
    int temp = 0;  
    int count = 0;
    int switches=0;
     for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
            	 count++;
            	 
                      if(arr[j-1] > arr[j]){  
                             //swap elements 
                    	  	 switches++;
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
                     }  
             }     
             }  
     System.out.println(Arrays.toString(arr));
     System.out.println("switches: "+switches);
 	System.out.println("Comparisions: "+count);
}
public static Integer[] read(String file) throws FileNotFoundException {
	Scanner readfile=new Scanner(new File(file));
	ArrayList<Integer>reader=new ArrayList<Integer>();
	while(readfile.hasNextLine()) {
		reader.add(readfile.nextInt());
		
		
	}
	Integer numbers[]=new Integer[reader.size()];
	for(int i =0; i<reader.size(); i++) {
		numbers[i]=reader.get(i);
	}
	return numbers;
	
}
static void swap(Integer[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    switches++;
}
 

static int partition(Integer[] arr, int low, int high)
{
     
    
    int pivot = arr[high];
    
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
         
        compare++;
        if (arr[j] < pivot)
        {
             
            
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    
    return (i + 1);
}
 

static void quickSort(Integer[] arr, int low, int high)
{

	
    if (low < high)
    {
         
       
        Integer pi = partition(arr, low, high);
 
        
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
        
    }
}

static void sort(Integer arr[], int l, int m, int r)
{
    
    int n1 = m - l + 1;
    int n2 = r - m;

   
    int L[] = new int[n1];
    int R[] = new int[n2];

    
    for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
        R[j] = arr[m + 1 + j];

    

    
    int i = 0, j = 0;

    
    int k = l;
    while (i < n1 && j < n2) {
    	compare++;
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        }
        else {
            arr[k] = R[j];
            switches++;
            j++;
        }
        k++;
    }

   
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

   
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}


static void merge(Integer arr[], int l, int r)
{
    if (l < r) {
        
        int m =l+ (r-l)/2;

        
        merge(arr, l, m);
        merge(arr, m + 1, r);

        
        sort(arr, l, m, r);
    }
}
	}



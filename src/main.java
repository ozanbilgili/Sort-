import java.util.Scanner;

public class main extends sort {
   
   
   public static void main(String args[])
   {
      int arr[] = { 9, 3, 1, 5, 13, 12 };
      

      System.out.println("Please select your sorting algorithm: \n1-Merge Sort\n2-Heap Sort\n3-Insertion Sort\n4-Selection Sort\n5-Bubble Sort");
      Scanner scanner = new Scanner(System.in); 
      int inputSelect = scanner.nextInt();


      switch (inputSelect) { 
       case 1: 
       sort ms = new sort();
       ms.mergeSort(arr, 0, arr.length - 1);
       System.out.println("Sorted array");
       ms.displayMerge(arr);
       break;
       case 2:
       sort hs = new sort();
       hs.heapSort(arr);
       System.out.println("\nHeap Sort");
       hs.displayHeap(arr);
       break;
       case 3:
       sort insertion = new sort();
       insertionSort(arr, arr.length);
       System.out.println("\nInsertion Sort");
       insertion.displayInsertion(arr);
       break;
       case 4:
       sort selectionSort = new sort();
       selectionSort.selectionSort(arr);
       System.out.println("\nSelection Sort");
       selectionSort.displaySelection(arr);
       break;
       case 5:
       sort bubbleSort = new sort();
       bubbleSort.bubbleSort(arr);
       System.out.println("\nBubble Sort");
       bubbleSort.displayBubble(arr);
       break;
      }
   }
 }
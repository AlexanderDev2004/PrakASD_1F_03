package P7.MergeSortTest03;

public class MergeSortMain03 {
    public static void main(String[] args) {
        int data [] = {10,40,30,50,70,20,100,90};
        System.out.println("sorting dan merge Sort ");
        MergeSorting03 mSort = new MergeSorting03();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("Setelah Di urutkan :");
        mSort.printArray(data);
    }
}

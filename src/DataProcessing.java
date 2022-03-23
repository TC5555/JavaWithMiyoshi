import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class DataProcessing {
    public static ArrayList<StudentData> selectionSortAsc(ArrayList<StudentData> a, int type) {
        for (int i = a.size() - 1; i >= 0; i--) {
            int largest = i;
            for (int j = i; j >= 0; j--) {

                if (a.get(j).compareTo(a.get(largest), type) > 0) {
                    largest = j;
                }
            }
            Collections.swap(a, i, largest);
        }
        return a;
    }

    public static ArrayList<StudentData> selectionSortDec(ArrayList<StudentData> a, int type) {
        for (int i = a.size() - 1; i >= 0; i--) {
            int largest = i;
            for (int j = i; j >= 0; j--) {

                if (a.get(j).compareTo(a.get(largest), type) < 0) {
                    largest = j;
                }
            }
            Collections.swap(a, i, largest);
        }
        return a;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("FakeStudentData.txt"));
        ArrayList<StudentData> DataList = new ArrayList<>();
        while(input.hasNextLine()){
            String[] line = input.nextLine().split(" ");
            DataList.add(new StudentData(line));
        }
        System.out.println("Student data, Unorganized:");
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
        System.out.print(str + "\t");}}

        System.out.println();

        selectionSortAsc(DataList, 0);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortAsc(DataList, 1);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortAsc(DataList, 2);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortAsc(DataList, 3);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortDec(DataList, 0);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortDec(DataList, 1);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortDec(DataList, 2);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}

        System.out.println();

        selectionSortDec(DataList, 3);
        System.out.println();
        for(StudentData line : DataList){
            System.out.println();
            for(String str : line.Data){
                System.out.print(str + "\t");}}


    }
}

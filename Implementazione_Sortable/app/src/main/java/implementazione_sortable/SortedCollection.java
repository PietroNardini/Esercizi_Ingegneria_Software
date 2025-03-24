package implementazione_sortable;

public class SortedCollection implements Sortable
{
private Sorter s;
public SortedCollection()
{
s = new QuickSorter(); 
}
public void add(int e) {}
public int get(int index) {
    return 0;
}
public void remove(int index) {}
public int compare(int i, int j) {
    return 0;
}
public void swap (int i, int j) {}
public int count() {
    return 0;
}
public void sort(){
    s.sort(null);
}
}
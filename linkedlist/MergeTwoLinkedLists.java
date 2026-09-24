
public class MergeTwoLinkedLists {
    private int data;
    private MergeTwoLinkedLists next;

    public MergeTwoLinkedLists(int data) {
        this(data, null);
    }

    public MergeTwoLinkedLists(int data, MergeTwoLinkedLists next) {
        this.data = data;
        this.next = next;
    }

    static MergeTwoLinkedLists insert(MergeTwoLinkedLists start, int x) {
        if (start == null || start.data > x) {
            return new MergeTwoLinkedLists(x, start);
        }

        MergeTwoLinkedLists p = start;
        while (p.next != null && p.next.data < x) {
            p = p.next;
        }
        p.next = new MergeTwoLinkedLists(x, p.next);
        return start;
    }

    public static void main(String[] args) {
        MergeTwoLinkedLists start1 = null;
        MergeTwoLinkedLists start2 = null;

        int[] list1 = {10, 8, 6, 4, 2};
        int[] list2 = {9, 7, 5, 3, 1};

        for (int value : list1) {
            start1 = insert(start1, value);
        }

        for (int value : list2) {
            start2 = insert(start2, value);
        }

        MergeTwoLinkedLists mergedList = null;

        MergeTwoLinkedLists temp1 = start1;
        while (temp1 != null) {
            mergedList = insert(mergedList, temp1.data);
            temp1 = temp1.next;
        }

        MergeTwoLinkedLists temp2 = start2;
        while (temp2 != null) {
            mergedList = insert(mergedList, temp2.data);
            temp2 = temp2.next;
        }

        MergeTwoLinkedLists temp = mergedList;
        System.out.println("Merged list:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


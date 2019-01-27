package linked_lists;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by aohana
 */

public class LinkedListsTest {

    @Test
    public void testCircularLinkedList() {

        LinkedList<ListNode> circularLinkedList = createCircularLinkedList();

        ListNode meetingPointNode = LoopLinkedList.loopDetection(circularLinkedList);

        assertEquals(new Integer(7), meetingPointNode.data);
    }

    @Test
    public void testPalindromeList() {

        LinkedList<ListNode> palindromeList = createPalindromeList();

        boolean isPalindrome = PalindromeLinkedList.checkIfPalindrome(palindromeList);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void testNotPalindromeList() {

        LinkedList<ListNode> palindromeList = createNotPalindromeList();

        boolean isPalindrome = PalindromeLinkedList.checkIfPalindrome(palindromeList);

        assertEquals(false, isPalindrome);
    }

    @Test
    public void testPalindromeListNull() {

        assertEquals(false, PalindromeLinkedList.checkIfPalindrome(null));
    }

    @Test
    public void testPalindromeListEmpty() {

        boolean isPalindrome = PalindromeLinkedList.checkIfPalindrome(new LinkedList<ListNode>());

        assertEquals(false, isPalindrome);
    }

    @Test
    public void testPalindromeListSingleValue() {

        LinkedList<ListNode> singleValueLinkedList = new LinkedList<>();
        singleValueLinkedList.add(new ListNode(99));
        boolean isPalindrome = PalindromeLinkedList.checkIfPalindrome(singleValueLinkedList);

        assertEquals(true, isPalindrome);
    }

    private LinkedList<ListNode> createNotPalindromeList() {

        LinkedList<ListNode> palindromeList = new LinkedList<>();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(1);
        listNode1.nextNode = listNode2;
        listNode2.nextNode = listNode3;
        listNode3.nextNode = listNode4;
        listNode4.nextNode = listNode5;
        listNode5.nextNode = listNode6;
        listNode6.nextNode = null;

        palindromeList.add(listNode1);
        palindromeList.add(listNode2);
        palindromeList.add(listNode3);
        palindromeList.add(listNode4);
        palindromeList.add(listNode5);
        palindromeList.add(listNode6);

        return palindromeList;
    }

    private LinkedList<ListNode> createPalindromeList() {

        LinkedList<ListNode> palindromeList = new LinkedList<>();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(1);
        listNode1.nextNode = listNode2;
        listNode2.nextNode = listNode3;
        listNode3.nextNode = listNode4;
        listNode4.nextNode = listNode5;
        listNode5.nextNode = listNode6;
        listNode6.nextNode = null;

        palindromeList.add(listNode1);
        palindromeList.add(listNode2);
        palindromeList.add(listNode3);
        palindromeList.add(listNode4);
        palindromeList.add(listNode5);
        palindromeList.add(listNode6);

        return palindromeList;
    }

    private LinkedList<ListNode> createCircularLinkedList() {

        LinkedList<ListNode> circularLinkedList = new LinkedList<>();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(7);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(16);
        ListNode listNode6 = new ListNode(18);
        listNode1.nextNode = listNode2;
        listNode2.nextNode = listNode3;
        listNode3.nextNode = listNode4;
        listNode4.nextNode = listNode5;
        listNode5.nextNode = listNode6;
        listNode6.nextNode = listNode3;

        circularLinkedList.add(listNode1);
        circularLinkedList.add(listNode2);
        circularLinkedList.add(listNode3);
        circularLinkedList.add(listNode4);
        circularLinkedList.add(listNode5);
        circularLinkedList.add(listNode6);

        return circularLinkedList;
    }

}

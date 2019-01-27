package linked_lists;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by aohana
 */
public class PalindromeLinkedList {

    public static boolean checkIfPalindrome(LinkedList<ListNode> linkedList) {

        if(linkedList == null || linkedList.isEmpty()) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        ListNode runner = linkedList.getFirst();
        int listSize = linkedList.size();

        if(listSize == 1) {
            return true;
        }

        for(int i=0; i<listSize/2; i++) {
            stack.push(runner.data);
            runner = runner.nextNode;
        }

        for(int i=listSize/2; i<listSize; i++) {

            if(stack.peek().equals(runner.data)) {
                stack.pop();
            } else {
                return false;
            }
            runner = runner.nextNode;
        }

        return stack.isEmpty();

    }

}

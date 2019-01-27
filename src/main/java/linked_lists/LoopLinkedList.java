package linked_lists;

import java.util.LinkedList;

/**
 * Created by aohana
 */
public class LoopLinkedList {

    public static ListNode loopDetection(LinkedList<ListNode> linkedList) {

        ListNode fastRunner = linkedList.getFirst();
        ListNode slowRunner = linkedList.getFirst();

        while (true) {

            fastRunner = fastRunner.nextNode.nextNode;
            slowRunner = slowRunner.nextNode;

            if (slowRunner == fastRunner) {

                slowRunner = linkedList.getFirst();

                while (slowRunner != fastRunner) {

                    slowRunner = slowRunner.nextNode;
                    fastRunner = fastRunner.nextNode;

                }

                return fastRunner;

            }

        }

    }

}

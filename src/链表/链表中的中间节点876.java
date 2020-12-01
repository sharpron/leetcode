package 链表;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 *
 * @author ron 2020/12/1
 */
public class 链表中的中间节点876 {

  public ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    List<ListNode> nodes = new ArrayList<>(100);

    ListNode node = head;
    while (node != null) {
      nodes.add(node);
      node = node.next;
    }

    int middle = nodes.size() / 2;
    return nodes.get(middle);
  }

  /**
   * 改进 使用快慢指针
   *
   * @param head head
   * @return node
   */
  public ListNode middleNode2(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast == null) {
        break;
      }
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }

}

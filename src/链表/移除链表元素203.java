package 链表;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 *
 * @author ron 2020/12/1
 */
public class 移除链表元素203 {

  public ListNode removeElements(ListNode head, int val) {
    ListNode node = head;
    ListNode last = null;
    while (node != null) {
      if (node.val == val) {
        ListNode next = node.next;
        if (next == null) {
          if (last == null) {
            return null;
          }
          last.next = null;
          return head;
        } else {
          node.val = next.val;
          node.next = next.next;
        }
      } else {
        last = node;
        node = node.next;
      }
    }
    return head;
  }
}

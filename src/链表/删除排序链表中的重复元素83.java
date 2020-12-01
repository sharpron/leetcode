package 链表;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/solution/hua-jie-suan-fa-83-shan-chu-pai-xu-lian-biao-zhong/
 *
 * @author ron 2020/12/1
 */
public class 删除排序链表中的重复元素83 {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode root = new ListNode(0); // 没必要，去重不会删除很多节点
    root.next = head;

    ListNode node = root;
    while (node.next != null && node.next.next != null) {
      if (node.next.val == node.next.next.val) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }

    return root.next;
  }

  public ListNode deleteDuplicates2(ListNode head) {
    ListNode node = head;
    while (node != null && node.next != null) {
      if (node.val == node.next.val) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }
    return head;
  }
}

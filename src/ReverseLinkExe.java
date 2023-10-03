public class ReverseLinkExe {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  static class Solution {
    public ListNode reverseList(ListNode head) {

      if(head == null){
        return head;
      }

      ListNode prev = null;
      ListNode curr = head;

      while(curr!=null){
        ListNode aux = curr.next;
        curr.next = prev;
        prev = curr;
        curr = aux;
      }
      return prev;
    }


  }
}

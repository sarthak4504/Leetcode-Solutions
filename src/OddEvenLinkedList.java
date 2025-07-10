public class OddEvenLinkedList {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head==null || head.next==null){
                return head;
            }
            ListNode even=head;
            ListNode odd=head.next;
            ListNode curr=odd;
            while(curr!=null && curr.next!=null){
                even.next=curr.next;
                even=even.next;
                curr.next=even.next;
                curr=curr.next;
            }
            even.next=odd;
            return head;
        }
    }
}

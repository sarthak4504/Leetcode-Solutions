public class IntersectionOfTwoLinkedList {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int len1=getLength(headA);
            int len2=getLength(headB);

            while(len1>len2){
                headA=headA.next;
                len1--;
            }

            while(len2>len1){
                headB=headB.next;
                len2--;
            }

            while(headA!=headB){
                headA=headA.next;
                headB=headB.next;
            }

            return headA;

        }

        public static int getLength(ListNode head){
            int len=0;
            while(head!=null){
                head=head.next;
                len++;
            }
            return len;
        }
    }

}

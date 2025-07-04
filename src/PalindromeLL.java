public class PalindromeLL {
    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode left=head;
        ListNode right= reverseList(slow);
        while(right!=null){
            if(left.val!=right.val) return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
}

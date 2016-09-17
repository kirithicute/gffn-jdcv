 import java.io.*;
 public boolean isPalindrome(ListNode head) {
 if(head == null || head.next==null
       return true;
 
   
    ListNode fast1 = head;
    ListNode slow = head;
 
    while(fast1.next!=null && fast1.next.next!=null)
    {
        fast1 = fast1.next.next;
        slow = (ListNode) slow.next;
    }
 ListNode secondHead = (ListNode) slow.next;
 slow.next = null;
 ListNode p1 = secondHead;
 ListNode p2 = (ListNode) p1.next;
 while(p1!=null && p2!=null){
        ListNode temp = (ListNode) p2.next;
        p2.next = p1;
        p1 = p2;
        p2 = temp;
    }
 
    secondHead.next = null;
 
    
    ListNode p = (p2==null?p1:p2);
    ListNode q = head;
    while(p!=null){
        if(p.val != q.val)
            return false;
 
        p = (ListNode) p.next;
        q = (ListNode) q.next;
 
    }
 
    return true;
}

    private static class ListNode {
        private Object next;
        private boolean val;

        public ListNode() {
        }
    }
}

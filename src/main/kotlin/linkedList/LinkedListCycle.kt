package org.example.linkedList

class LinkedListCycle(): LinkedList() {
    fun hasCycle(): Boolean{
        var slow: Node? = this.head
        var fast: Node? = this.head?.next
        while (fast?.next != null && slow?.next != null){
            if(fast == slow){
                return true
            }
            slow = slow.next
            fast = fast.next?.next
        }
        return false
    }

     fun initCycle(){
        this.tail?.next = Node(100, next = head)
        this.tail = this.tail?.next
    }
}
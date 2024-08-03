package org.example.linkedList

open class LinkedList(currentHead: Node = Node(-1)){
    open var head: Node? = currentHead
    open var tail: Node? = head

    open fun insertEnd(value: Int){
        this.tail?.next = Node(value)
        this.tail = this.tail?.next
    }



    open  fun remove(index: Int){
        var i = 0
        var current: Node? = this.head
        // 0
        while (i < index){
            i+=1

            current = current?.next
        }
        if(current == this.head){
            this.head = current?.next
            return
        }


        //verifica se estorou o limite da lista,quando o current já é a calda
        if(current?.next != null){


            //se for remover a calda precisa substituir a refarencia da calda
            if(current.next == this.tail){
                // tail(green) = current(red)
                this.tail = current
            }


            current.next = current.next?.next
        }
    }
}

data class Node(var data: Int, var next: Node? = null)
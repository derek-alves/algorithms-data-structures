package org.example

import org.example.linkedList.LinkedListCycle


fun main() {

   val linkedList = LinkedListCycle()

    linkedList.insertEnd(10)
    linkedList.insertEnd(20)
    linkedList.insertEnd(40)
    val hasCycle  = linkedList.hasCycle()
    println(hasCycle)

}


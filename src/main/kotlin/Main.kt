package org.example

import org.example.linkedList.LinkedListCycle


fun main() {

   val linkedList = LinkedListCycle()

   linkedList.apply {
    insertEnd(10)
    insertEnd(20)
    insertEnd(40)
    initCycle()
   }
    val hasCycle  = linkedList.hasCycle()
    println(hasCycle)

}


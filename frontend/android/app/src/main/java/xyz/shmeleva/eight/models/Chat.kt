package xyz.shmeleva.eight.models

/**
 * Created by shagg on 19.11.2018.
 */
class Chat(var id: Int = 0) {
    var isGroupChat: Boolean = false
    var messages: List<Message>? = null
}
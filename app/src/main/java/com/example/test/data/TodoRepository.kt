package com.example.test.data

interface TodoRepository {
    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int): Todo?

    fun getTodos(): kotlinx.coroutines.flow.Flow<List<Todo>>

}
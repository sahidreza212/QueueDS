package org.example;

public class CircularQueue {

    public static  class Queue{

        static int arr[];
        static  int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        // Enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size ;
            arr[rear] = data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    }
}

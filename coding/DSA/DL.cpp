#include<iostream>
using namespace std;

class Node{
    public:
            int data;
            Node* next;
            Node* prev;
            Node(int val){
                data = val;
                prev = next = NULL;
            }
};

class DoublyList{
public:
        Node* head;
        Node* tail;
        DoublyList(){
            head = tail = NULL;
        }

void push_front(int val){
Node* newNode = new Node(val);
if(head == NULL){
    head = tail = newNode;
}else{
    newNode -> next = head;
    head -> prev = newNode;
    head = newNode;
}
}

void printList (){
    Node* temp = head;
    while(temp != NULL){
        cout<< temp -> data <<" <=> ";
        temp = temp -> next;
    }
    cout<<"NULL\n";
}

void pop_front(){
    Node* temp = head;
    head = head -> next;
    if(head != NULL){
        head -> prev = NULL;
    }
    temp -> next = NULL;
    delete temp;
}

void push_back(int val){
  Node* newNode = new Node(val);
  if(head == NULL){
    head = tail = newNode;
  }else{
    tail -> next = newNode;
    newNode -> prev = tail;
    tail = newNode;
  }  
}

void pop_back(){
    Node* temp = head;
    while(temp -> next -> next != NULL){
        temp = temp -> next;
    }
    temp -> next = NULL;
    tail -> prev = NULL;
    delete tail;
    tail = temp;
}
};

int main(){
    DoublyList dl;
    dl.push_back(1);
    dl.push_back(2);
    dl.push_back(3);
    dl.push_back(4);
    dl.push_back(5);
    dl.printList();
    dl.pop_back();
    dl.printList();
    return 0;
}
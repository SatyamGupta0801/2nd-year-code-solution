#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
}*head,*t,*ptr,*current,*prev,*next;
void insert(int x);
void insertAtBeg(int x);
void display();
void reverse();
int main()
{
    int n,i,x;
    printf("enter the no. of elements");
    scanf("%d",&n);
    printf("enter the elements");
    for(i=0;i<n;i++)
    {
        scanf("%d",&x);
        insert(x);
    }
    display();
    reverse();
    printf("Reverse List \n");
    display();
    return 0;
}
void reverse()
{
    current=head;
    while(current!=NULL)
    {
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;

        head=prev;
    }
}
void insertAtBeg(int x)
{
    t=(struct node*)malloc(sizeof(struct node));
    t->data=x;
    t->next=head;
    head=t;
}
void insert(int x)
{
    t=(struct node*)malloc(sizeof(struct node));
    if(head==NULL)
    {
    t->data=x;
    t->next=NULL;
    head=t;
    }
    else{
         t->data=x;
         t->next=NULL;
         ptr=head;
         while(ptr->next!=NULL)
         {
             ptr=ptr->next;
         }
         ptr->next=t;
    }
}
void display()
{
    t=head;
    while(t !=NULL)
    {
        printf("data=%d\n",t->data);
        t=t->next;
    }
}

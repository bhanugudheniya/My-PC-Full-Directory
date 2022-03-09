#include <stdio.h>
#include <pthread.h>
struct temp
{
    char msg[20];
    int count;
};
void *display(void *p)
{
    struct temp *s = (struct temp *)p;
    int i;
    for (i = 0; i < s->count; i++)
        printf("%s ", s->msg);
    return NULL;
}
void main()
{
    pthread_t thread_id;
    struct temp args;
    printf("Enter a string ");
    gets(args.msg);
    printf("Enter no. of times to print the message ");
    scanf("%d", &args.count);
    pthread_create(&thread_id, NULL, &display, &args);
    pthread_join(thread_id, NULL);
    printf("\nIn function main");
}
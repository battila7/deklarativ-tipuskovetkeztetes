#include <stdio.h>
#include <stdlib.h>


typedef struct
{
    char *name;
    unsigned age;
} Person;

typedef struct
{
    char *manufacturer;
    char *model;
    unsigned age;
} Car;


int main()
{
    Person *person = malloc(sizeof (Person));
    person->name = "Fred";
    person->age = 37;

    void *ptr = person;

    Car *car = ptr;

    printf("%s\n", car->manufacturer);
    printf("%s\n", car->model);
    printf("%d\n", car->age);

    return 0;
}

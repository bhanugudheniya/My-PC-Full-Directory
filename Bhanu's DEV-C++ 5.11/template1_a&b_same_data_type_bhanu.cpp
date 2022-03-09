#include<iostream>

using namespace std;

    template <class X>
    X big(X a,X b)
    {
        if(a>b)
            return(a);
        else
            return(b);
    }

    int main()
    {
        cout<<big(4,5);
        cout<<endl;
        cout<<big(8.2,7.5);

        return 0;
    }


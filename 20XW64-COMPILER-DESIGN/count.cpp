#include<iostream>
using namespace std;

int main(){
    string fs;
    cout<<"Enter the string:";

    getline(cin,fs);

    int alphabets=0;
    int spaces=0;
    int specialChar=0;

    for(int i=0;fs[i];i++){
        cout<<fs[i]<<endl;
    }

    return 0;
}

////the input is this line 1, it contains spl cahr%%$# as well as dig8888s.


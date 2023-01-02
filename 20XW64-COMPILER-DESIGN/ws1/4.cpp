#include<iostream>

using namespace std;

int fail(int state){
    return 4;
}

void lex(string s){
    int state = 0;
    int i = 0;

    while(true){
        switch(state){
        case 0:
            if(s[i]>='0' && s[i]<='9'){
                state = 0;
                i++;
            }
            else if(s[i]=='.'){
                state = 1;
                i++;
            }
            else{
                state = fail(state);
                i=0;
            }
            break;
        case 1:
            if(s[i]>='0' && s[i]<='9'){
                state = 1;
                i++;
            }
            else if(s[i]=='e'){
                state  = 2;
                i++;
            }
            else{
                state = fail(state);
                i=0;
            }
            break;
        case 2:
            if(s[i]>='0' && s[i]<='9'){
                state = 2;
                i++;
            }
            else if(s[i]=='\0'){
                state = 3;
            }
            else{
                state = fail(state);
                i=0;
            }
            break;
        case 3:
            cout<<"It is a valid floating point number with exponential notation";
            return ;
        case 4:
            cout<<"It is not a valid floating point number with exponential notation";
            return;
        }
    }

}

int main(){
    string s;
    cout<<"Enter the number:";
    cin>>s;
    lex(s);
}

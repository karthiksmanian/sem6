#include<iostream>
#include<cstdlib>
#include<ctype.h>
using namespace std;
// keywords : int,float,do,while,if,else,char,enum,struct,string
int fail(int state){
    if(state>=0 && state <=38){
        return 40;
    }
    else if(state>=40 && state <=42){
        return 43;
    }
    else if(state>=43 && state <=45){
        return 46;
    }
    else if(state>=46 && state <=61){
        return 62;
    }
    return 62;
}

void lex(string s){
    int state,i;
    state = 0;
    i = 0;

    while(true){
        switch(state){
            case 0:
                if(s[i]=='i'){
                    state = 1;
                    i++;
                }
                else if(s[i]=='f'){
                    state = 4;
                    i++;
                }
                else if(s[i]=='d'){
                    state = 8;
                    i++;
                }
                else if(s[i]=='w'){
                    state = 9;
                    i++;
                }
                else if(s[i]=='e'){
                    state = 13;
                    i++;
                }
                else if(s[i]=='c'){
                    state = 18;
                    i++;
                }
                else if(s[i]=='s'){
                    state = 21;
                    i++;
                }
                else{
                    state = fail(state);
                    i=0;
                }
                break;
            case 1:
                if(s[i]=='f'){
                    state = 38;
                    i++;
                }
                else if(s[i]=='n'){
                    state = 3;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 3:
                if(s[i]=='t'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 4:
                if(s[i]=='l'){
                    state = 5;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 5:
                if(s[i]=='o'){
                    state = 6;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 6:
                if(s[i]=='a'){
                    state = 7;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 7:
                if(s[i]=='t'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i =  0;
                }
                break;
            case 8:
                if(s[i]=='o'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 9:
                if(s[i]=='h'){
                    state = 10;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
            case 10:
                if(s[i]=='i'){
                    state = 11;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 11:
                if(s[i]=='l'){
                    state = 12;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 12:
                if(s[i]=='e'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 13:
                if(s[i]=='l'){
                    state = 14;
                    i++;
                }
                else if(s[i]=='n'){
                    state = 16;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 14:
                if(s[i]=='s'){
                    state = 15;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 15:
                if(s[i]=='e'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 16:
                if(s[i]=='u'){
                    state = 17;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 17:
                if(s[i]=='m'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 18:
                if(s[i]=='h'){
                    state = 19;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 19:
                if(s[i]=='a'){
                    state = 20;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 20:
                if(s[i]=='r'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 21:
                if(s[i]=='t'){
                    state = 22;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 22:
                if(s[i]=='r'){
                    state = 23;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 23:
                if(s[i]=='u'){
                    state = 24;
                    i++;
                }
                else if(s[i]=='i'){
                    state = 26;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 24:
                if(s[i]=='c'){
                    state = 25;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 25:
                if(s[i]=='t'){
                    state = 38;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 26:
                if(s[i]=='i'){
                    state = 27;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 27:
                if(s[i]=='n'){
                    state = 28;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 28:
                if(s[i]=='g'){
                    state = 38;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 38:
                if(s[i]=='\0'){
                    state = 39;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 39:
                cout<<"It is a keyword.\n";
                return;
            case 40:
                if(isalpha(s[i]) || s[i]=='_'){
                    state = 41;
                    i++;
                }
                else{
                    state = fail(state);
                    i=0;
                }
                break;
            case 41:
                if(isalnum(s[i]) || s[i]=='_'){
                    state = 41;
                    i++;
                }
                else if(s[i]=='\0'){
                    state = 42;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 42:
                cout<<"It is a identifier.";
                return;
            case 43:
                if(isdigit(s[i])){
                    state = 44;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 44:
                if(isdigit(s[i])){
                    state = 44;
                    i++;
                }
                else if(s[i]=='\0'){
                    state = 45;
                }
                else{
                    state = fail(state);
                }
                break;
            case 45:
                cout<<"It is a constant.";
                return;
            case 46:
                if(s[i] == '+'){
                    state = 60;
                    i++;
                }
                else if(s[i]== '-'){
                    state = 60;
                    i++;
                }
                else if(s[i]=='*'){
                    state = 60;
                    i++;
                }
                else if(s[i]=='/'){
                    state = 60;
                    i++;
                }
                else if(s[i]=='<'){
                    state = 47;
                    i++;
                }
                else if(s[i]=='>'){
                    state = 48;
                    i++;
                }
                else if(s[i]=='='){
                    state = 49;
                    i++;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 47:
                if(s[i]=='='){
                    state = 60;
                    i++;
                }
                else if(s[i]=='<'){
                    state = 60;
                    i++;
                }
                else if(s[i]=='\0'){
                    state = 61;
                }
                else{
                    state = fail(state);
                    i= 0;
                }
                break;
            case 48:
                if(s[i]=='='){
                    state = 60;
                    i++;
                }
                else if(s[i]=='>'){
                    state = 60;
                    i++;
                }
                else if(s[i]=='\0'){
                    state = 61;
                }
                else{
                    state = fail(state);
                    i=0;
                }
                break;
            case 49:
                if(s[i]=='='){
                    state = 60;
                    i++;
                }
                else if(s[i]=='\0'){
                    state = 61;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 60:
                if(s[i] == '\0'){
                    state = 61;
                }
                else{
                    state = fail(state);
                    i = 0;
                }
                break;
            case 61:
                cout<<"It is a Operator.";
                return;
            case 62:
                cout<<"Unauthorized by the Automata";
                return;
        }
    }
}

int main(){
    string s;
    cout<<"enter : \n";
    getline(cin,s);
    lex(s);

    return 0;
}
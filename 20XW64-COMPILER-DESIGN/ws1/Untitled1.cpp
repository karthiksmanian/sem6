#include<iostream>
#include<fstream>

using namespace std;

int main(){
        ifstream inFile;
        string take;
        inFile.open("input.txt");

        int wordcount = 0;
        int charcount = 0;
        int linecount = 0;

        while(!(inFile.eof())){
            inFile>>take;
            cout<<take<<endl;

            for(int i=0;take[i];i++){
                charcount++;
                /*if(take[i]=='\n'){
                    linecount++;
                }*/
            }
            wordcount++;
        }
        inFile.close();

        inFile.open("input.txt");

        while(getline(inFile,take)){
            linecount++;
        }
        inFile.close();

        cout<<"The no of characters in the file is "<<charcount<<endl;
        cout<<"The no of words in the file is "<<wordcount<<endl;
        cout<<"The no of lines in the file is "<<linecount<<endl;
        return 0;
}

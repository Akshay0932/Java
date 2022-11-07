s = "-3211"

int num=0;
int count=0;
for(int i=0; i<s.length(); ++i ){
    if(s[i]=='-')
     count++;
    if(count>1)
     return -1;
    if(s[i] >= '0' && s[i] <= '9') { 
        int x=s[i]-'0';
        num*=10;
        num+=x;
    }else return -1;
    
    //sonce the difference in ascii values is 7 '7'-'0' will 7
}

if(s[0] == '-')
    num*=-1;



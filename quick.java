array[] = {-1203, 123, 324, -34,123,234,-234,-234,-456};

negative[n] ;
pos[n];
int x=0,y=0;
[-1203,  ,  ,  ,  , 0]
[123,324,123,234]
for(int i=0; i<arr.length; ++i) {
    if(arr[i] < 0) {
        negative[x]=arr[i];
        ++x;
    } else {
        pos[y] = arr[i];
        ++y;
    }
}
int i=0;
[-1203, -34, -234, -234,-456,123,324,123,234]
[-1203, -34,-234,-234 , -456]
[123,324,123,234]

while(i<x) {
    arr[i] = neg[i];
    ++i;
}
int j=0;
while(j<y) {
    arr[i] = pos[j];
    ++j;
    ++i;
}


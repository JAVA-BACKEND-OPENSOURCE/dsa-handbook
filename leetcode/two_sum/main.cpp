#include <bits/stdc++.h>

using namespace std;

int main(){
	int a[] = {1, 3, 5, 7, 9};
	int b[] = {2, 4, 6, 8, 10};
	int i = 0, j = 0, k = 0;
	int c[10];

	while(k < 10){
		if(a[i] <= b[j]){
			c[k] = a[i];
			k++, i++;
		}else{
			c[k] = b[j];
			j++, k++;
		}

	}

	for(int x: c){
		cout << x << " ";
	}


    
    return 0;
}

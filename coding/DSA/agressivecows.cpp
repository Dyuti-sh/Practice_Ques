#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int maxDistance(vector<int> &stalls, int k){
        int n = stalls.size();
        sort(stalls.begin() , stalls.end());
        int start = 1, ans = 0;
        int end = stalls[n - 1] - stalls[0];

        while(start <= end){
            int mid = start + ( end - start ) / 2;
            int count = 1, pos = stalls[0];
            for(int i = 1; i < n; i++){
                if(pos + mid <= stalls[i]){
                    count++;
                    pos = stalls[i];
                }
            }
            if(count < k) end = mid - 1;
            else{
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }

int main() {
	
	vector<int> stalls = {10, 1, 2, 7, 5};
	cout<<maxDistance(stalls, 3)<<endl;

	return 0;
}
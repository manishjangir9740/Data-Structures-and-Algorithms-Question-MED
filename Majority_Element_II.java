class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        List<Integer> li = new ArrayList<>();

        for(int i =0; i< n; i++){
            if(li.size()== 0 || li.get(0) != arr[i]){
                int count = 0;
                for(int j=0; j<n; j++){
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }
                if(count > n/3){
                    li.add(arr[i]);
                }
            }
            if(li.size() == 2){
                break;
            }
        }
        return li;
    }
}

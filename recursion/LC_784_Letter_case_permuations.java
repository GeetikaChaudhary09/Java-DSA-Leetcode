class Solution {
    public List<String> letterCasePermutation(String s) {
         List<String> result = new ArrayList<>();

        solve(s.toCharArray(),0,result);

        return result;
    }

    void solve(char[] arr,int index,List<String> result){

        if(index == arr.length){
            result.add(new String(arr));
            return;
        }

        if(Character.isLetter(arr[index])){

            arr[index] = Character.toLowerCase(arr[index]);
            solve(arr,index+1,result);

            arr[index] = Character.toUpperCase(arr[index]);
            solve(arr,index+1,result);
        }
        else{
            solve(arr,index+1,result);
        }
        
    }
}

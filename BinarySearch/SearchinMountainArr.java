package BinarySearch;

public class SearchinMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 2;
        int s = 0, e = peakElm(arr);
        int res = orderagnosticBS(arr,target,s,e);
        if(res != -1){
            System.out.println(res);
        }else{
            s = e;
            e = arr.length-1;
            res = orderagnosticBS(arr,target,s,e);
            System.out.println(res);
        }
    }
    public static int peakElm(int[] arr){
        int s = 0,e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }

    public static int orderagnosticBS(int[] arr,int target, int s , int e ){
        boolean isAss = arr[e] > arr[s];
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }else{
                if(isAss){
                    if(target > arr[mid]){
                        s = mid+1;
                    }else{
                        e = mid-1;
                    }
                }else{
                    if(target > arr[mid]){
                        e = mid-1;
                    }else{
                        s = mid+1;
                    }
                }
            }
        }
        return -1;
    }
}

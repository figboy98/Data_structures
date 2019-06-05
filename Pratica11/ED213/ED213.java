import java.util.Scanner;
public class ED213{
	static int best_sum;
	static String best_path;
	public static String maxSum(BTree<Integer> t){
		best_sum=-1;
		best_path="";
		  maxSum(t.getRoot(), "", 0);
		  return best_path;
	}
	private static void maxSum(BTNode<Integer> t, String path, int sum){
		if(t==null)return;
		sum+=t.getValue();
		if(t.getRight()==null && t.getLeft()==null){
			if(sum > best_sum){
				best_sum=sum;
				best_path=path;
			}
		}
		
		else{
			maxSum(t.getRight(), path +"D", sum);
			maxSum(t.getLeft(), path +"E", sum);
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BTree<Integer> t =  LibBTree.readIntTree(in);
		System.out.println(maxSum(t));
	}
}
		

import java.util.Arrays;
public class BigNumber{
	
	int data[];
	 int size;
	
	//construtor
	
	BigNumber(){
		data=new int[1000];
		size=0;
	}
	BigNumber(String n){
		data=new int[1000];
		
		size=n.length();
		
		int j=0;
		
		for(int i=size-1; i>=0; i--){
			char c= n.charAt(j);
			int d= c-'0';
			data[i]=d;
			j++;
		}
	}
public boolean equals(BigNumber n){
	
	for(int i=0; i<size; i++){
		if(data[i]!=n.data[i]){
			return false;
		}
	}
		return true;
	}
	
	
public String toString() {
      String ans = "";
      for (int i=size-1; i>=0; i--) {
            ans += data[i];
      }
      return ans;
   }

public BigNumber add(BigNumber n){
	
	BigNumber novo= new BigNumber();
	int count=0;
	
	int max=0;
	
	if(size >= n.size) max=size;
	if(n.size >= size) max=n.size;
	
	for(int i=0; i<max; i++){
		
		int sum= data[i] + n.data[i]+novo.data[i];
		
		if(i==max-1 && sum >=10) max++;
		
		if(sum>=10){
			int j=i+1;
			sum=sum%10;
			novo.data[j]=1;
			
		}
		novo.data[i]=sum;
		count++;
	}
	
	novo.size=count;

	return novo;
}

void clear(){
	for(int i=0; i<size; i++){
		data[i]=0;
	}
}
public BigNumber multiply(BigNumber n){
	BigNumber novo1= new BigNumber();
	BigNumber novo2= new BigNumber();
	int count=0;
	int max=0;
	int k=0;
	
	if(size >= n.size) max=size;
	if(n.size >= size) max=n.size;
	
	for(k=0; k<3; k++){
		count=0;
		novo1.clear();
		novo1.data[k]=0;
		
		for(int i=0; i<max;i++){
				int aux= (data[i]*n.data[k]) + novo1.data[i+k];
					if(i==max-1 && aux >=10) max++;
			
					if(aux >=10){
						int j=i+k+1;
						int sum=aux;
						aux=aux%10;
						novo1.data[j]=sum/10;
					}
					novo1.data[i+k]=aux;
					count++;	
		}
		
		novo1.size=count;
		System.out.println(novo1);
		novo2=novo1.add(novo2);
		//System.out.println(novo2);

	}
	
	
	return novo2;
		
	
}



}
	


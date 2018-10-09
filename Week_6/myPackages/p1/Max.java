package myPackages.p1;
import java.util.*;

public class Max{
	public int max(int a, int b, int c){
		if(a>b&&a>c){
			return a;
		}
		else if(b>c){
			return b;
		}
		else{
			return c;
		}
	}
	
	public float max(float a, float b, float c){
		if(a>b&&a>c){
			return a;
		}
		else if(b>c){
			return b;
		}
		else{
			return c;
		}
	}
	
	public int max(int a[], int n){
		int grt = a[0];
		for(int i=1; i<n; i++){
			if(grt<a[i]){
				grt = a[i];
			}
		}
		return grt;
	}
	
	public int max(int a[][], int m, int n){
		int grt = a[0][0];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(a[i][j]>grt){
					grt = a[i][j];
				}
			}
		}
		return grt;
	}	
}

package demo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String name=scanner.nextLine();
		
		// 第一步：使用if 分支结构判断输入是否为空，如果为空，提示用户："姓名不能为空"
		
		

		System.out.println("你好，"+name);
		scanner.close();

	}

}

package ch10;

public class e10_1b {
	public static void main(String args[]) {
		for(int i=0;i<=4;i++){
			//���C�L��-��
			for (int k=1;k<=4-i;k++)
			{
			System.out.print(" ");
			}
			//�A�C�L��*��
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("* ");//�C�L��*��+�Ů�
			}
		System.out.println(" ");//�C�C�L���@���A����

		}
		
	for(int i=0;i<=3;i++){
		//���C�L��-��
			for (int k=1;k<=i+1;k++)
			{
			System.out.print(" ");
			}
			//�A�C�L��*��
			for(int j=1;j<=4-i;j++)
			{
				System.out.print("* ");//�C�L��*��+�Ů�
			}
		System.out.println(" ");

	}
}
}
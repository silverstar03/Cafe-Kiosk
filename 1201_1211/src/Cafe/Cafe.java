package Cafe;

import java.util.Scanner;
class Order {
	private int drink;
	private String size;
	private int temp;
	private int number;
	private int where_eat;

	public Order (int drink, String size, int temp, int number, int where_eat) {
		this.drink = drink;
		this.size = size;
		this.temp = temp;
		this.number = number;
		this.where_eat = where_eat;
	}
	
	public void setChoice_Size(String size) {
		this.size = size;
	}
	public String getChoice_size() {
		return size;
	}
	
	public void setHOTorICE(int temp) {
		this.temp = temp;
	}
	public int getHOTorICE() {
		return temp;
	}
	
	public void setChoice_Number(int number) {
		this.number = number;
	}
	public int getChoice_Number() {
		return number;
	}
	
	public void setChoice_Drink(int drink) {
		this.drink = drink;
	}
	public int getChoice_Drink() {
		return drink;
	}
	
	public void setEATINorTAKEOUT(int where_eat) {
		this.where_eat = where_eat;
	}
	public int getEATINorTAKEOUT() {
		return where_eat;
	}
	
	public void Choice_Drink(int drink) {
		switch(drink) {
		case 1 : System.out.println("�Ƹ޸�ī���Դϴ�."); break;
		case 2 : System.out.println("ī����Դϴ�."); break;
		case 3 : System.out.println("īǪġ���Դϴ�."); break;
		case 4 : System.out.println("ī���ī�Դϴ�."); break;
		case 5 : System.out.println("���� ��ũƼ�Դϴ�."); break;
		case 6 : System.out.println("Ÿ�� ��ũƼ�Դϴ�."); break;
		case 7 : System.out.println("���� ��ũƼ�Դϴ�."); break;
		case 8 : System.out.println("��� ��ũƼ�Դϴ�."); break;
		}
	}
	
	public void Choice_eat(int where_eat) {
		if(where_eat == 1) {
			System.out.println("���������� �غ��� �帮�ڽ��ϴ�.");
		}else if(where_eat == 2) {
			System.out.println("��ȸ�� ������ �غ��� �帮�ڽ��ϴ�.");
		}else {
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void HOTorICE(int temp) {
		if(temp == 1) {
			System.out.print("�߰ſ�");
		}else if(temp == 2) {
			System.out.print("���̽�");
		}else {
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "������� " + size + ", ������ ������ " + number + "���̸�, ";
	}
}

class AddOrder {
	private String Topping;
	private int Drink;
	private int Answer;
	
	public AddOrder (String Topping,int drink,int Answer) {
		this.Topping = Topping;
		this.Drink = drink;
		this.Answer = Answer;
	}
	
	public void setAdd_Topping(String Topping) {
		this.Topping = Topping;
	}
	public String getAdd_Topping() {
		return Topping;
	}
	
	public void setDrink(int drink) {
		this.Drink = drink;
	}
	public int getDrink() {
		return Drink;
	}
	
	public void setAnswer(int Answer) {
		this.Answer = Answer;
	}
	public int getAnswer() {
		return Answer;
	}
	
	public void Add_Topping(String Topping,int drink, int Answer) {
		if(Topping.equals("y") || Topping.equals("Y")) {
			if(drink == 1 || drink == 2 || drink == 3 || drink == 4) {
				switch(Answer) {
				case 1 : System.out.println("Ŀ�ǿ� ���߰��� �մϴ�."); break;
				case 2 : System.out.println("Ŀ�ǿ� �÷��� �߰��մϴ�."); break;
				}
			}
			else if(drink == 5 || drink == 6 || drink == 7 || drink == 8) {
				switch(Answer) {
				case 1 : System.out.println("��ũƼ�� �߰��� ���� Ÿ�ǿ�ī���Դϴ�."); break;
				case 2 : System.out.println("��ũƼ�� �߰��� ���� ġ�����Դϴ�."); break;
				case 3 : System.out.println("��ũƼ�� �߰��� ���� ���ڳ� �����Դϴ�."); break;
				}
			}
		}
		else if(Topping == "n" || Topping == "N") {
			System.out.println("������ �߰����� �ʾҽ��ϴ�.");
		}
	}
}

class Payment {
	private int price;		//����
	private int drinkpay;	//����� ����
	private int payway;		//��������
	private int num;
	
	public Payment(int price, int drink, int payway, int number) {
		this.price = price;
		this.drinkpay = drink;
		this.payway = payway;
		this.num = number;
	} //������
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setDrinkpay(int drink) {
		this.drinkpay = drink;
	}
	public int getDrinkpay() {
		return drinkpay;
	}

	public void setReply(int payway) {
		this.payway = payway;
	}
	public int getPayway() {
		return payway;
	}
	public void setNum(int number) {
		this.num=number;
	}
	public int getNum() {
		return num;
	}
	
	public void What_pay(int payway) {
		if(payway == 1) {
			System.out.println("ī������Դϴ�.");
		}
		else if(payway == 2) {
			System.out.println("���ݰ����Դϴ�.");
		}
	} //��������
	
	
	public void total_price(int drink, String Topping) {
		switch(drink) {
		case 1 : drinkpay = 3000; break;
		case 2 : drinkpay = 3500; break;
		case 3 : case 4: case 5: case 6: 
			drinkpay = 4000; break;
		case 7 : case 8: drinkpay = 4500; break;
		}
		if(Topping.equals("y") || Topping.equals("Y")) {
			int toppingpay = 500;
			price = drinkpay+toppingpay;
			System.out.print("�� �����ؾ� �� �ݾ��� " + price*num + "���̸�, ");
		}
		else if(Topping.equals("N") || Topping.equals("n")) {
			price = drinkpay;
			System.out.print("�� �����ؾ� �� �ݾ��� " + price*num + "���̸�, ");
		}
	} //�� ���� �޼���	
}

public class Cafe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int Answer = 0;
		
		System.out.print("1.�Ƹ޸�ī�� (3000)		");
		System.out.print("2.ī��� (3500)		");
		System.out.print("3.īǪġ�� (4000)		");
		System.out.println("4.ī���ī (4000) ");
		System.out.print("5.���� ��ũƼ (4000)	");
		System.out.print("6.Ÿ�� ��ũƼ (4000) 	");
		System.out.print("7.���� ��ũƼ (4500) 	");
		System.out.println("8.��� ��ũƼ (4500) ");
		System.out.print("� ����� �Ͻðڽ��ϱ�? : ");
		int drink = scan.nextInt(); 
		
		System.out.println("");
		System.out.println("����� �������� �Ͻðڽ��ϱ�?");
		System.out.print("M ,L ,XL : ");
		String size = scan.next();
		
		System.out.println("");
		System.out.println("1.HOT  2.ICE");
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int temp = scan.nextInt();
		
		System.out.println("");
		System.out.print("������ ������ ��� �帱���? : ");
		int number = scan.nextInt();
		
		System.out.println("");
		System.out.println("���忡�� ��ð� ���ǰǰ���? take out �Ͻǲ�����?");
		System.out.print("������ 1��, take out�� 2���� �����ּ��� : ");
		int where_eat = scan.nextInt();
		
		System.out.println("");
		System.out.print("������ �߰��Ͻðڽ��ϱ�? (y/n) : ");
		String Topping = scan.next();
		
		System.out.println("");
		if(Topping.equals("y") || Topping.equals("Y")) {
			if(drink == 1 || drink == 2 || drink == 3 || drink == 4) {
				System.out.println("1. �� �߰�(+500)	2. �÷� �߰�(+500)"); 
				System.out.print("������ �߰��Ͻðڽ��ϱ�? : ");
				Answer = scan.nextInt();
			}else if(drink == 5 || drink == 6 || drink == 7 || drink == 8) {
				System.out.println("1. Ÿ�ǿ�ī�� �߰�(+500)   2. ġ���� �߰�(+500)   3. ���ڳ� ���� �߰�(+500)");
				System.out.print("������ �߰��Ͻðڽ��ϱ�? : ");
				Answer = scan.nextInt();
			}
		}
		else if(Topping.equals("n") || Topping.equals("N")){
			System.out.println("������ �߰����� �ʽ��ϴ�.");
		}
		
		Order o1 = new Order(drink, size, temp, number, where_eat);
		
		System.out.println("");
		System.out.print("����� ");
		o1.HOTorICE(temp);
		System.out.print(" ");
		o1.Choice_Drink(drink);
		System.out.print(o1.toString());
		o1.Choice_eat(where_eat);

		AddOrder a1 = new AddOrder(Topping, drink, Answer);
		a1.Add_Topping(Topping, drink, Answer);
		
		System.out.println("");
		
		int price = 0;
		
		System.out.print("�������� �����ϰڽ��ϱ�? (1.ī��/2.����) : ");
		int payway = scan.nextInt();		
		
		Payment p1 = new Payment(price, drink, payway,number);
		p1.total_price(drink, Topping);
		p1.What_pay(payway);
		
		System.out.println("");
		
		
	}
}

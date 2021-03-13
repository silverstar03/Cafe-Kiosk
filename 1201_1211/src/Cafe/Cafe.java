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
		case 1 : System.out.println("아메리카노입니다."); break;
		case 2 : System.out.println("카페라떼입니다."); break;
		case 3 : System.out.println("카푸치노입니다."); break;
		case 4 : System.out.println("카페모카입니다."); break;
		case 5 : System.out.println("초코 밀크티입니다."); break;
		case 6 : System.out.println("타로 밀크티입니다."); break;
		case 7 : System.out.println("녹차 밀크티입니다."); break;
		case 8 : System.out.println("흑당 밀크티입니다."); break;
		}
	}
	
	public void Choice_eat(int where_eat) {
		if(where_eat == 1) {
			System.out.println("매장컵으로 준비해 드리겠습니다.");
		}else if(where_eat == 2) {
			System.out.println("일회용 컵으로 준비해 드리겠습니다.");
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
	
	public void HOTorICE(int temp) {
		if(temp == 1) {
			System.out.print("뜨거운");
		}else if(temp == 2) {
			System.out.print("아이스");
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
	
	@Override
	public String toString() {
		return "사이즈는 " + size + ", 음료의 갯수는 " + number + "잔이며, ";
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
				case 1 : System.out.println("커피에 샷추가를 합니다."); break;
				case 2 : System.out.println("커피에 시럽을 추가합니다."); break;
				}
			}
			else if(drink == 5 || drink == 6 || drink == 7 || drink == 8) {
				switch(Answer) {
				case 1 : System.out.println("밀크티에 추가한 펄은 타피오카펄입니다."); break;
				case 2 : System.out.println("밀크티에 추가한 펄은 치즈폼입니다."); break;
				case 3 : System.out.println("밀크티에 추가한 펄은 코코넛 젤리입니다."); break;
				}
			}
		}
		else if(Topping == "n" || Topping == "N") {
			System.out.println("토핑을 추가하지 않았습니다.");
		}
	}
}

class Payment {
	private int price;		//가격
	private int drinkpay;	//음료수 가격
	private int payway;		//결제수단
	private int num;
	
	public Payment(int price, int drink, int payway, int number) {
		this.price = price;
		this.drinkpay = drink;
		this.payway = payway;
		this.num = number;
	} //생성자
	
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
			System.out.println("카드결제입니다.");
		}
		else if(payway == 2) {
			System.out.println("현금결제입니다.");
		}
	} //결제수단
	
	
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
			System.out.print("총 지불해야 할 금액은 " + price*num + "원이며, ");
		}
		else if(Topping.equals("N") || Topping.equals("n")) {
			price = drinkpay;
			System.out.print("총 지불해야 할 금액은 " + price*num + "원이며, ");
		}
	} //총 가격 메서드	
}

public class Cafe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int Answer = 0;
		
		System.out.print("1.아메리카노 (3000)		");
		System.out.print("2.카페라떼 (3500)		");
		System.out.print("3.카푸치노 (4000)		");
		System.out.println("4.카페모카 (4000) ");
		System.out.print("5.초코 밀크티 (4000)	");
		System.out.print("6.타로 밀크티 (4000) 	");
		System.out.print("7.녹차 밀크티 (4500) 	");
		System.out.println("8.흑당 밀크티 (4500) ");
		System.out.print("어떤 음료로 하시겠습니까? : ");
		int drink = scan.nextInt(); 
		
		System.out.println("");
		System.out.println("사이즈를 무엇으로 하시겠습니까?");
		System.out.print("M ,L ,XL : ");
		String size = scan.next();
		
		System.out.println("");
		System.out.println("1.HOT  2.ICE");
		System.out.print("숫자를 입력하시오 : ");
		int temp = scan.nextInt();
		
		System.out.println("");
		System.out.print("음료의 갯수는 몇개로 드릴까요? : ");
		int number = scan.nextInt();
		
		System.out.println("");
		System.out.println("매장에서 드시고 가실건가요? take out 하실껀가요?");
		System.out.print("매장은 1번, take out은 2번을 눌러주세요 : ");
		int where_eat = scan.nextInt();
		
		System.out.println("");
		System.out.print("토핑을 추가하시겠습니까? (y/n) : ");
		String Topping = scan.next();
		
		System.out.println("");
		if(Topping.equals("y") || Topping.equals("Y")) {
			if(drink == 1 || drink == 2 || drink == 3 || drink == 4) {
				System.out.println("1. 샷 추가(+500)	2. 시럽 추가(+500)"); 
				System.out.print("무엇을 추가하시겠습니까? : ");
				Answer = scan.nextInt();
			}else if(drink == 5 || drink == 6 || drink == 7 || drink == 8) {
				System.out.println("1. 타피오카펄 추가(+500)   2. 치즈폼 추가(+500)   3. 코코넛 젤리 추가(+500)");
				System.out.print("무엇을 추가하시겠습니까? : ");
				Answer = scan.nextInt();
			}
		}
		else if(Topping.equals("n") || Topping.equals("N")){
			System.out.println("토핑을 추가하지 않습니다.");
		}
		
		Order o1 = new Order(drink, size, temp, number, where_eat);
		
		System.out.println("");
		System.out.print("음료는 ");
		o1.HOTorICE(temp);
		System.out.print(" ");
		o1.Choice_Drink(drink);
		System.out.print(o1.toString());
		o1.Choice_eat(where_eat);

		AddOrder a1 = new AddOrder(Topping, drink, Answer);
		a1.Add_Topping(Topping, drink, Answer);
		
		System.out.println("");
		
		int price = 0;
		
		System.out.print("무엇으로 결제하겠습니까? (1.카드/2.현금) : ");
		int payway = scan.nextInt();		
		
		Payment p1 = new Payment(price, drink, payway,number);
		p1.total_price(drink, Topping);
		p1.What_pay(payway);
		
		System.out.println("");
		
		
	}
}

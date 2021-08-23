import java.util.Scanner;

public class MainMenu {
	
	 Scanner sc = new Scanner(System.in);

	 void selectMenu() {

		System.out.println("================");
		System.out.println("1. 현재 상영중인 영화"+"\n");
		System.out.println("2. 영화 예매"+"\n");
		System.out.println("3. 예매 확인 및 취소"+"\n");
		System.out.println("4. 로그인 메뉴"+"\n");
		System.out.println("5. 종료");
		System.out.println("================");
		System.out.println("원하시는 메뉴를 선택해주세요:");
		while (true) {
			String select = sc.nextLine();

			switch (select) {
			case "1":
				MovieInfoMenu movieInfoMenu = new MovieInfoMenu();
				movieInfoMenu.selectMovie();
				break;
			case "2":
				System.out.println("영화 예매를 선택하셨습니다");
				break;
			case "3":
				System.out.println("예매 확인 및 취소를 선택하셨습니다");
				break;
			case "4":
				System.out.println("로그인 메뉴를 선택하셨습니다");
				break;
			case "5":
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 누르셨습니다");
				break;

			}

		}
	}
}

package hotel;

import java.util.Scanner;
import java.util.List;

public class HotelService {

	public static HotelDAO hotelDAO;
	public static Scanner sc = new Scanner(System.in);

	public HotelService() {
		hotelDAO = new HotelDAO();
	}

	public void startProgram() {
		int choice = printMenu();


		switch(choice) {
		case 1 :
			//1.입실
			checkIn();
			break;
		case 2 :
			//2. 퇴실
			checkOut();
			break;
		case 3 :
			//3. 방 보기
			roomInfo();
			break;
		case 4 :
			//4. 종료
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default :
			System.out.println("1~4까지의 정수를 입력하시오.");
			break;
		}
	}   

	public int printMenu() {
		int choice = 0;

		System.out.println("====호텔 관리 프로그램 ====");
		System.out.println("호텔에는 총" + hotelDAO.RoomCnt + " 개의 객실이 있다.");
		System.out.println("-----------------------");
		System.out.println ("1. 입실 2. 퇴실 3. 방보기 4. 종료");
		System.out.println("선택 : ");
		//메뉴 입력을 받아주세요.
		choice = sc.nextInt();

		return choice;
	}

	public void checkIn() {
		System.out.println("몇번 방에 입실할까?");
		int roomNum = sc.nextInt();

		if (roomNum < 1 || roomNum > hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1~" + hotelDAO.RoomCnt + "호실 까지의 객실이 있다."); 
			System.out.println("다시 선택하자.");
		} else if (hotelDAO.selectRoomChk(roomNum)) {
			System.out.println("해당 객실은 이미 손님이 있다. 다른 객실을 선택하자.");
		}else {
			hotelDAO.checkIn(roomNum);
			System.out.println("객실 체크인이 완료되었다. 즐거운 하루!");
		}
	}

	public void checkOut() {
		System.out.println("몇 번 객실에서 퇴실할까?");
		int roomNum = sc.nextInt();
		
	    hotelDAO.checkOut(roomNum);
	}


	public void roomInfo() {
		List<Room> rooms = hotelDAO.selectRoomList();

		int cnt = 1;

		for(Room r : rooms) {
			if(r.isUsing() == true) {
				System.out.println(cnt+ "호 객실은 현재 손님이 있다.");
			}else {
				System.out.println(cnt+ "호 객실은 현재 비어있다.");
			}
			cnt++;
		}
	}
}

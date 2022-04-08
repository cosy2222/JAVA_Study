package chap12.Ex09;

public interface PhoneInterface {
	int timeout = 10000;	// public static final 생략됨
	void sendCall();		// public abstract 생략됨
	void receiveCall();
	default void printlogo() {
		System.out.println("로고를 출력 합니다");
	}

}

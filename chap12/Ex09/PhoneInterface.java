package chap12.Ex09;

public interface PhoneInterface {
	int timeout = 10000;	// public static final ������
	void sendCall();		// public abstract ������
	void receiveCall();
	default void printlogo() {
		System.out.println("�ΰ� ��� �մϴ�");
	}

}

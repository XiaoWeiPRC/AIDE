
public final class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataProvider provider = InstanceProxy.create(DataProvider.class);

		System.out.println(provider.method1());
		System.out.println(provider.method2());
	}
}

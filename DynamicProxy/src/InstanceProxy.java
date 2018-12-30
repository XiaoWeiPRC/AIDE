import java.lang.reflect.*;

/**
 * 创建代理
 * 
 * @author clonen.cheng
 *
 */
public class InstanceProxy {

	@SuppressWarnings("unchecked")
	public static <T> T create(Class<T> cls) {
		MethodProxy invocationHandler = new MethodProxy();
		Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[] { cls }, invocationHandler);
		return (T)newProxyInstance;
	}
}

package day13.javapro;
/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����10:36:23
* @description ������
*/
public class TestController {
	//���÷��䣬
	/*
	 * ���������ϱ�ʶ@Controllerע��Ž��д���
	 * ��ȡ@Controller����value���ԣ���ӡ
	 */
	public static void main(String[] args) throws Exception {
		//ȫ���޶�������·��.����
		String className = "day13.javapro.HelloController";
		Class<?> clazz = Class.forName(className);
		
		//���÷���ķ��������л�ȡע��
		Controller ca = clazz.getAnnotation(Controller.class);
		//ֱ���ж�
		if(ca != null) {
			System.out.println(ca.value());
		}
		System.out.println("ִ�����");
	}
}

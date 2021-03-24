package day09.javase.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TestArrayListCapacity {
	public static void main(String[] args) throws Exception {
		// 1.��������
		List<String> aList = new ArrayList<String>();

		// 2.��200�����ݣ����������ݼ���
		int dataCount = 2000;
		int count = 0;				//��¼���ݴ���
		int oldCapacity = 0;		//�м������¼���ݴ�С�������ж�����
		for (int i = 0; i < dataCount; i++) {
			int capacity = TestArrayListCapacity.getCapacity(aList);
			// �ڼ�¼һ���ɵ����ֺ��µ����ֲ�ͬ������һ������
			if(oldCapacity != capacity) {		//����
				System.out.println("������");
				// ���ݺ󣬰��µ�ֵ��ֵ�ɵ�ֵ
				oldCapacity = capacity;
				count++;
			}

			aList.add(i + "");
			System.out.println(i + "������ĳ��ȣ�" + capacity);
		}
		System.out.println("���ݴ�����"+count);

		System.out.println("");
	}

	// ���ص�ǰ�����г�Ա����elementData[]���鳤��
	public static int getCapacity(List<String> aList) throws Exception {
		// ���䣬api����ȡ��Ա���������ÿɼ��ԣ�������������
		// ��ȡ��������ȡ���鳤��

		// 1.����ͬ������������Ȼ�ȡ��ǰ�������
		Class<?> clazz = aList.getClass();
		// 2.��ȡ��Ա������Ҳ��Ϊ���� Field
		// ���ʹ̶����� elementData
		Field f = clazz.getDeclaredField("elementData");
		// 3.�������÷���Ȩ�ޣ������ⲻ���������ù���
		f.setAccessible(true); // �ı�Ȩ�ޣ����ÿ��Է���

		// ���ض���ǿ��ת�����飬����ҵ����
		Object[] o = (Object[]) f.get(aList); // �ӵ�ǰ�����л�ȡ�������

		return o.length;
	}
}

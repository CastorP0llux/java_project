package org.sara.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.sara.domain.CartsVO;

@Mapper
public interface CartsMapper{
	public List<CartsVO> getCartsList(int users_id_id); // ��ٱ��� ��� �����Ҷ� ��ٱ��� ����Ʈ�� �ҷ���
	
	public int deleteAllCartsList(int users_id_id); // ��ٱ��Ͽ��� �����ϱ�� ������ ��ٱ��� �ʱ�ȭ


//	*��ٱ��Ͽ��� ���õȰ͵��� ��ٱ��� ��Ͽ��� ����
//	deleteCarts(int user_id_id, int[] carts_id)
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id ������ ����
//
//	*��ٱ��Ͽ��� ���õȰ͵��� ������������ �̵�
//	buyCarts(int user_id_id, int[] carts_id)
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id ������ �ֹ��������� �̵�
//
//	*��ٱ��Ͽ� ���ٵȰ͵��� �� ����
//	totalPrice(int user_id_id, int[] carts_id, int[] books_id_id, int quantity)
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id������
//	books_id_id�� ���ڸ� �޾� price�� �޾ƿ� quantity(����) ��ŭ ���� ���� �����°͵��� �� ���� ���Ѵ�
	
//	public List<CartsVO> getList(); // �׽�Ʈ��
}

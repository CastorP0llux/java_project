package org.sara.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sara.domain.CartsVO;

@Mapper
public interface CartsMapper{
	public List<CartsVO> getCartsList(@Param("users_id") int users_id); // ��ٱ��� ��� �����Ҷ� ��ٱ��� ����Ʈ�� �ҷ���
	
	
	public int deleteAllCartsList(@Param("users_id") int users_id); // ��ٱ��Ͽ��� �����ϱ�� ������ ��ٱ��� �ʱ�ȭ


//	*��ٱ��Ͽ��� ���õȰ͵��� ��ٱ��� ��Ͽ��� ����
	public int deleteCarts(@Param("users_id") int user_id, @Param("carts_id") Integer carts_id);
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id ������ ����
//
//	*��ٱ��Ͽ��� ���õȰ͵��� ������������ �̵�
//	buyCarts(int user_id_id, int carts_id)
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id ������ �ֹ��������� �̵�
//
//	*��ٱ��Ͽ� ���ٵȰ͵��� �� ����
//	totalPrice(int user_id_id, int carts_id, int books_id_id, int quantity)
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id������
//	books_id_id�� ���ڸ� �޾� price�� �޾ƿ� quantity(����) ��ŭ ���� ���� �����°͵��� �� ���� ���Ѵ�
	
//	public List<CartsVO> getList(); // �׽�Ʈ��
}

package org.sara.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sara.domain.CartsListDTO;

@Mapper
public interface CartsMapper{
	public List<CartsListDTO> getCartsList(@Param("users_id") int users_id); // ��ٱ��� ��� �����Ҷ� ��ٱ��� ����Ʈ�� �ҷ���
	
	
	public int deleteAllCartsList(@Param("users_id") int users_id); // ��ٱ��Ͽ��� �����ϱ�� ������ ��ٱ��� �ʱ�ȭ


//	*��ٱ��Ͽ��� ���õȰ͵��� ��ٱ��� ��Ͽ��� ����
	public int deleteCarts(@Param("users_id") int user_id, @Param("carts_id") Integer carts_id);
//	=> ���� id���� ���ڷ� ���� ����Ʈ ȭ�鿡�� ���ڷ� ���� carts_id ������ ����
	
	public void updateCarts(@Param("users_id") int user_id,	@Param("carts_id") int carts_id,
							@Param("books_id") int books_id, @Param("quantity") int quantity);
}

package org.sara.service;

import java.util.List;

import org.sara.domain.CartsVO;
import org.sara.mapper.CartsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class CartsServiceImpl implements CartsService{
	@Setter(onMethod_ = @Autowired)
	private CartsMapper cartsMapper;

	@Override
	public List<CartsVO> getCartsList(int users_id_id) {
		log.info("cartsList-----------��ȯ�� -> users_id_id�� =========>" + users_id_id);
		return cartsMapper.getCartsList(users_id_id);
	}

	@Override
	public boolean deleteAllCartsList(int users_id_id) {
		log.info("deleteAllCartsList------------��ȯ�� -> users_id_id�� =========>" + users_id_id);
		return cartsMapper.deleteAllCartsList(users_id_id) == 1;
	}
	
//	@Override // �׽�Ʈ��
//	public List<CartsVO> getList() {
//		log.info("����Ʈ");
//		return cartsMapper.getList();
//	}
}

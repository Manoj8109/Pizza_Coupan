package com.onlinepizza.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinepizza.exceptions.CoupanIdNotFoundException;
import com.onlinepizza.model.Coupan;
import com.onlinepizza.repository.ICoupanRepository;

@Service("service")

@Transactional
public class CoupanServiceImpl implements ICoupanService {

	@Autowired
	private ICoupanRepository dao;

	@Override
	public Coupan addCoupan(Coupan coupan) {
		return dao.save(coupan);
	}

	@Override
	public Coupan editCoupan(Coupan coupan) {
		return dao.save(coupan);
	}

	@Override
	public void deleteCoupan(Integer coupanId) throws CoupanIdNotFoundException {
		Optional<Coupan> coupan = dao.findById(coupanId);
		if(coupan.isEmpty())
			throw new CoupanIdNotFoundException("Enter a valid Coupan ID"); 
		dao.deleteById(coupanId);
	}

	@Override
	public Optional<Coupan> getCoupanById(Integer coupanId) throws CoupanIdNotFoundException {

		Optional<Coupan> coupan = dao.findById(coupanId);
		if (coupan.isEmpty())
			throw new CoupanIdNotFoundException("Enter a valid Coupan ID");
		else
			return coupan;
	}

	@Override
	public List<Coupan> viewCoupans() {

		return dao.findAll();
	}

}

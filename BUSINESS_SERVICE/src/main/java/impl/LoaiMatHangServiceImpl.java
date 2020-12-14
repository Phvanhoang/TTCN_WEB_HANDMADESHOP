package impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import model.LoaiMatHang;
import repository.LoaiMatHangRepository;
import service.LoaiMatHangService;

@Service
public class LoaiMatHangServiceImpl implements LoaiMatHangService{
	@Autowired
	private LoaiMatHangRepository loaiMatHangRepository;
	
	public void save(LoaiMatHang loaiMatHang) {
		loaiMatHangRepository.save(loaiMatHang);
	}

	public LoaiMatHang findByMaLoaiMatHangAndDeletedFalse(long maLoaiMatHang) {
		return loaiMatHangRepository.findByMaLoaiMatHangAndDeletedFalse(maLoaiMatHang);
	}

	public Page<LoaiMatHang> findByDeletedFalse(Pageable pageable) {
		return loaiMatHangRepository.findByDeletedFalse(pageable);
	}

	public void delete(LoaiMatHang loaiMatHang) {
		loaiMatHangRepository.delete(loaiMatHang);
		
	}

}

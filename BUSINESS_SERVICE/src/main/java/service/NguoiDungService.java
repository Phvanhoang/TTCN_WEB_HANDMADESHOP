package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import model.NguoiDung;

public interface NguoiDungService {
	void save(NguoiDung nguoiDung);
	NguoiDung findByDeletedFalse(long maNguoiDung);
	Page<NguoiDung> findByDeletedFalse(Pageable pageable);
}

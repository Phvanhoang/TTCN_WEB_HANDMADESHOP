package impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import model.NguoiDung;
import repository.NguoiDungRepository;
import service.NguoiDungService;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {
	@Autowired
	private NguoiDungRepository nguoiDungRepository;

	public void save(NguoiDung nguoiDung) {
		nguoiDungRepository.save(nguoiDung);
	}

	public NguoiDung findByDeletedFalse(long maNguoiDung) {
		Optional<NguoiDung> optional = nguoiDungRepository.findById(maNguoiDung);
		if (!optional.isPresent()) return null;
		return nguoiDungRepository.findById(maNguoiDung).get();
	}

	public Page<NguoiDung> findByDeletedFalse(Pageable pageable) {
		return nguoiDungRepository.findAll(pageable);
	}
}

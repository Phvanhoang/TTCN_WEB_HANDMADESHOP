package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import model.MatHang;
import model.NguoiDung;

@Repository
public interface MatHangRepository extends PagingAndSortingRepository<MatHang, Long>{
	Page<MatHang> findAll(Pageable pageable);
	MatHang findByMaMatHang(Long maMatHang);

}

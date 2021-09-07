package ds.com.notice.service;

import ds.com.notice.dto.NoticeDTO;
import ds.com.notice.dto.PageRequestDTO;
import ds.com.notice.dto.PageResultDTO;
import ds.com.notice.entity.Notice;
import ds.com.notice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {
    private final NoticeRepository repository;
    @Override
    public Long register(NoticeDTO dto){
        log.info("==== DTO ====");
        log.info(dto);
        Notice entity = dtoToEntity(dto);
        log.info(entity);

        repository.save(entity);
        return entity.getGno();
    }
    @Override
    public PageResultDTO<NoticeDTO, Notice> getList(PageRequestDTO requestDTO){
        Pageable pageable = requestDTO.getPageable(Sort.by("gno").descending());
        Page<Notice> result = repository.findAll(pageable);
        Function<Notice, NoticeDTO> fn = (entity -> entityToDto(entity));
        return new PageResultDTO<>(result, fn);
    }
}

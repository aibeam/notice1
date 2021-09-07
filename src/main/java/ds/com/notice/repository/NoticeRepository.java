package ds.com.notice.repository;

import ds.com.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface NoticeRepository extends JpaRepository<Notice, Long>,
        QuerydslPredicateExecutor<Notice>{

}

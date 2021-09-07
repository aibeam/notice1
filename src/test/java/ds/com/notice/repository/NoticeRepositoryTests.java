package ds.com.notice.repository;

import ds.com.notice.entity.Notice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class NoticeRepositoryTests {
    @Autowired
    private NoticeRepository noticeRepository;

    @Test
    public void insertData(){
        IntStream.rangeClosed(1,150).forEach(i->{
            Notice notice = Notice.builder().title("안내 내용 #"+i).content("안녕하세요!..."+i).uno(0L+i).build();
            System.out.println(noticeRepository.save(notice));
        });
    }
}

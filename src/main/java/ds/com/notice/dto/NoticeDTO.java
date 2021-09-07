package ds.com.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoticeDTO {
    private Long gno;
    private String title;
    private String content;
    private Long uno;
    private LocalDateTime regDate, modDate;
}

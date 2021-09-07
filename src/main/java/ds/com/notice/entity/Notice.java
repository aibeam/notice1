package ds.com.notice.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Notice extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gno;

    @Column(length=100, nullable = false)
    private String title;
    @Column(length=1000, nullable = false)
    private String content;
    @Column(length=100, nullable = false)
    private Long uno;
}
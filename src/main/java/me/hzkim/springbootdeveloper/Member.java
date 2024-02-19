package me.hzkim.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity                                                 //  엔티티로 지정
// @Entity(name = "member_list")                        //  member_list라는 이름을 가진 테이블과 매핑
@NoArgsConstructor(access = AccessLevel.PROTECTED)      //  기본 생성자
@AllArgsConstructor
@Getter

public class Member {
    @Id                                                 //  id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)            //  name이라는 not null 컬럼과 매핑
    private String name;
}

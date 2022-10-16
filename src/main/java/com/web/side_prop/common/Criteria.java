package com.web.side_prop.common;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Data
public class Criteria {
    private int pageNum;    // 현재 페이지 번호
    private int amount;     // 페이지당 출력할 데이터 개수
    private String type;    // 검색 키워드
    private String keyword; // 검색 유형(T:제목, C:내용, W:작성자)

    //기본 페이지를 1페이지에 10개씩 보여줌
    public Criteria() {
        this(1, 10);
    }

    //매개변수로 들어오는 값응 이용해 조정 가능
    public Criteria(int pageNum, int amount){
        this.pageNum = pageNum;
        this.amount = amount;
    }

    //UriComponentsBuilder로 링크 생성
    public String getListLink(){
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
                .queryParam("pageNum", pageNum)
                .queryParam("amount", amount);

        return builder.toUriString();
    }

    public int getOffset() {
        return this.pageNum = (pageNum-1) * amount;
    }

    //get으로 시작해야 myBatis에서 찾을 수 있음
    public String[] getTypeArr(){
        return type == null ? new String[]{} : type.split("");
    }
}

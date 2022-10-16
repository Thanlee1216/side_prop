package com.web.side_prop.common;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class page {
    private int pageCount;      // 화면 하단에 표시할 페이지 번호 개수
    private int startPage;      // 화면 하단에 표시할 시작 페이지 번호
    private int endPage;        // 화면 하단에 표시할 마지막 페이지 번호
    private int realEnd;        // 실제 마지막 페이지 번호
    private boolean prev;       // 이전 페이지 존재 여부
    private boolean next;       // 이후 페이지 존재 여부
    private int total;          // 전체 데이터 개수
    private Criteria criteria;  // 페이지 번호 계산에 필요한 Criteria 클래스의 변수에 대한 정보를 가진 변수

    public page(){
    }

    public page(int total, int pageCount, Criteria criteria){
        this.total = total;
        this.criteria = criteria;
        this.pageCount = pageCount;

        this.endPage = (int)(Math.ceil(criteria.getPageNum()*1.0/pageCount))*pageCount;
        this.startPage = endPage - (pageCount-1);

        realEnd = (int)(Math.ceil(total*1.0/criteria.getAmount()));

        if(endPage > realEnd){ // endPage가 realEnd 보다 클 수 없음
            endPage = realEnd == 0 ? 1 : realEnd;
        }

        prev = startPage > 1;
        next = endPage < realEnd;
    }
}

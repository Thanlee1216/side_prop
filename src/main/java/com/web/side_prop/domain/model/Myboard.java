package com.web.side_prop.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Myboard {

    private String id;

    private int my_idx;

    private String my_title;

    private String my_content;
}

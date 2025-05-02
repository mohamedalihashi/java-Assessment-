package com.C1220740.C1220740;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private long id;
    private String name;
    private String position;

    public Long getStaff_id() {
        return id;
    }

    public void id(Long staffId) {
        this.id = staffId;
    }
}

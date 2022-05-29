package com.jessica.springcloud.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
public class Group implements java.io.Serializable {

    /**
     * id
     */
    private long gNo;
    /**
     * 團體名稱
     */
    private String gName;
    /**
     * 資料庫來源
     */
    private String dbSource;

    public Group(String gName) {
        this.gName = gName;
    }

}

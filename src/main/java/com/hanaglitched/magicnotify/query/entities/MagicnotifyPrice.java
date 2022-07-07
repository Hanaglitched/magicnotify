package com.hanaglitched.magicnotify.query.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "MAGICNOTIFY_PRICE")
// 자료형 매핑
// https://zetawiki.com/wiki/JPA_DB%EC%9E%90%EB%A3%8C%ED%98%95_%EB%A7%A4%ED%95%91
// PK 없는 테이블 매핑
// https://seunghunchan.tistory.com/32
public class MagicnotifyPrice implements Serializable {

    @Column(name = "foil")
    BigDecimal foil;
    @Column(name = "normal")
    BigDecimal normal;
    @Column(name = "date")
    Date date;
    @Column(name = "key")
    String key;

}

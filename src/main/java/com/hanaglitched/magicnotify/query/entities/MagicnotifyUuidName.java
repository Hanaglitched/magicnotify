package com.hanaglitched.magicnotify.query.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "MAGICNOTIFY_UUID_NAME")
public class MagicnotifyUuidName {
    @Id
    String key;
}

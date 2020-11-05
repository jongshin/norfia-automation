package com.vkim.skyeng.entity;

import java.time.LocalDateTime;

public interface BaseEntity {

  Long getId();

  LocalDateTime getLastUpdated();

  void setLastUpdated(LocalDateTime lastUpdated);
}

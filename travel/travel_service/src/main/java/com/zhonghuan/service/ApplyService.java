package com.zhonghuan.service;

import com.zhonghuan.domain.Apply;

import java.util.List;

public interface ApplyService {
    void saveApply(Apply apply);

    List<Apply> findInreview();
}

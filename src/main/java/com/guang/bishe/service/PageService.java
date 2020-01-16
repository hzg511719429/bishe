package com.guang.bishe.service;

import com.guang.bishe.service.dto.PageResult;

/**
 * @author guang
 */
public interface PageService {

    PageResult getProductList(int page, int row, int status, double min, double max, String word);
}

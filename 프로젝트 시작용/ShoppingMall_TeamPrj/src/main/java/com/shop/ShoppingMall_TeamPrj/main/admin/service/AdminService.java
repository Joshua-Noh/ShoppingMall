package com.shop.ShoppingMall_TeamPrj.main.admin.service;

import com.shop.ShoppingMall_TeamPrj.main.admin.vo.AdminVO;

public interface AdminService {
    Object getDashboardData();
    Object getUserData(String userId);
    void updateSettings(AdminVO adminVO);
}

package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysConfOrder;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-08-19
 */
public interface ISysConfOrderService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param confOrderId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SysConfOrder selectSysConfOrderById(Long confOrderId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysConfOrder 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysConfOrder> selectSysConfOrderList(SysConfOrder sysConfOrder);

    /**
     * 新增【请填写功能名称】
     *
     * @param sysConfOrder 【请填写功能名称】
     * @return 结果
     */
    public int insertSysConfOrder(SysConfOrder sysConfOrder);

    /**
     * 修改【请填写功能名称】
     *
     * @param sysConfOrder 【请填写功能名称】
     * @return 结果
     */
    public int updateSysConfOrder(SysConfOrder sysConfOrder);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param confOrderIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysConfOrderByIds(Long[] confOrderIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param confOrderId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysConfOrderById(Long confOrderId);
}

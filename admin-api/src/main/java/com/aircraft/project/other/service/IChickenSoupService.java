package com.aircraft.project.other.service;

import com.aircraft.common.exception.job.TaskException;
import com.aircraft.project.monitor.domain.SysJob;
import com.aircraft.project.other.domain.ChickenSoup;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * 每日一言 服务层
 */
public interface IChickenSoupService {
    /**
     * 查询每日一言集合
     *
     * @param chickenSoup 每日一言
     * @return 每日一言集合
     */
    public List<ChickenSoup> selectChickenSoupList(ChickenSoup chickenSoup);

    /**
     * 通过调度ID查询每日一言信息
     *
     * @param chickenSoupId 每日一言ID
     * @return 每日一言信息
     */
    public ChickenSoup selectChickenSoupById(Long chickenSoupId);

    /**
     * 批量删除每日一言信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteChickenSoupByIds(Long[] ids);

    /**
     * 修改每日一言信息
     *
     * @param chickenSoup 每日一言
     * @return 结果
     */
    public int updateChickenSoup(ChickenSoup chickenSoup);

    /**
     * 新增每日一言信息
     *
     * @param chickenSoup 每日一言
     * @return 结果
     */
    public int insertChickenSoup(ChickenSoup chickenSoup);
}
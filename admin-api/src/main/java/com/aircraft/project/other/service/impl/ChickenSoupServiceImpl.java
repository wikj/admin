package com.aircraft.project.other.service.impl;

import com.aircraft.project.other.domain.ChickenSoup;
import com.aircraft.project.other.mapper.ChickenSoupMapper;
import com.aircraft.project.other.service.IChickenSoupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChickenSoupServiceImpl implements IChickenSoupService {

    @Resource
    private ChickenSoupMapper chickenSoupMapper;


    @Override
    public List<ChickenSoup> selectChickenSoupList(ChickenSoup chickenSoup) {
        return chickenSoupMapper.selectChickenSoupList(chickenSoup);
    }

    @Override
    public ChickenSoup selectChickenSoupById(Long chickenSoupId) {
        return chickenSoupMapper.selectChickenSoupById(chickenSoupId);
    }

    @Override
    public int deleteChickenSoupByIds(Long[] ids) {
        return chickenSoupMapper.deleteChickenSoupByIds(ids);
    }

    @Override
    public int updateChickenSoup(ChickenSoup chickenSoup) {
        return chickenSoupMapper.updateChickenSoup(chickenSoup);
    }

    @Override
    public int insertChickenSoup(ChickenSoup chickenSoup) {
        return chickenSoupMapper.insertChickenSoup(chickenSoup);
    }
}

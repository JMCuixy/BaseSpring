package com.service.impl;

import com.service.CompactDisc;
import org.springframework.stereotype.Service;

/**
 * Created by XiuYin.Cui on 2017/12/12.
 */
@Service
public class CompactDiscImpl implements CompactDisc {

    public void playTrack(int track) {
        System.out.println("playTrack"+track);
    }
}

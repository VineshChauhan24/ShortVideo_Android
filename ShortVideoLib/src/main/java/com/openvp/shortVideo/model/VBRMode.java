package com.openvp.shortVideo.model;

/**
 * Created by shortVideo on 2017/3/16.
 * https://github.com/openvp
 * openvp@gmail.com
 */

public class VBRMode extends BaseMediaBitrateConfig {
    /**
     *
     * @param maxBitrate 最大码率
     * @param bitrate 额定码率
     */
    public VBRMode(int maxBitrate, int bitrate){
        if(maxBitrate<=0||bitrate<=0){
            throw new IllegalArgumentException("maxBitrate or bitrate value error!");
        }
        this.maxBitrate=maxBitrate;
        this.bitrate=bitrate;
        this.mode= MODE.VBR;
    }
}

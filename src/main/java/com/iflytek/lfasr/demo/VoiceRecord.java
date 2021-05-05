package com.iflytek.lfasr.demo;

import com.alibaba.fastjson.annotation.JSONField;

import java.time.Duration;

public class VoiceRecord {

    @JSONField(name = "bg")
    private long bgTime;

    @JSONField(name = "ed")
    private long edTime;

    @JSONField(name = "onebest")
    private String voiceRecord;

    @JSONField(name = "speaker")
    private int speaker;

    private final Duration newBgTime;

    private final Duration newEdTime;

    public VoiceRecord(long bgTime, long edTime, String voiceRecord) {
        super();
        this.bgTime = bgTime;
        this.edTime = edTime;
        this.voiceRecord = voiceRecord;
        this.newBgTime = Duration.ofMillis(bgTime);
        this.newEdTime = Duration.ofMillis(edTime);
    }

    public long getBgTime() {
        return bgTime;
    }

    public long getEdTime() {
        return edTime;
    }

    public int getSpeaker() {
        return speaker;
    }

    public String getVoiceRecord() {
        return voiceRecord;
    }

    @Override
    public String toString() {
        return newBgTime.toMinutesPart() + ":" + newBgTime.toSecondsPart() + "-" +
               newEdTime.toMinutesPart() + ":" + newEdTime.toSecondsPart() + "  "+ voiceRecord;
    }

    public void setBgTime(long bgTime) {
        this.bgTime = bgTime;
    }

    public void setEdTime(long edTime) {
        this.edTime = edTime;
    }

    public void setVoiceRecord(String voiceRecord) {
        this.voiceRecord = voiceRecord;
    }

    public void setSpeaker(int speaker) {
        this.speaker = speaker;
    }
}

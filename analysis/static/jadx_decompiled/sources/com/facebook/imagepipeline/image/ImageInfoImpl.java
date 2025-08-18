package com.facebook.imagepipeline.image;

import defpackage.pqb;
import defpackage.ru6;
import java.util.Map;

/* loaded from: classes.dex */
public class ImageInfoImpl implements ru6 {
    private final Map<String, Object> extras;
    private final int height;
    private final pqb qualityInfo;
    private final int sizeInBytes;
    private final int width;

    public ImageInfoImpl(int i, int i2, int i3, pqb pqbVar, Map<String, Object> map) {
        this.width = i;
        this.height = i2;
        this.sizeInBytes = i3;
        this.qualityInfo = pqbVar;
        this.extras = map;
    }

    @Override // defpackage.ru6, com.facebook.fresco.middleware.HasExtraData
    public Map<String, Object> getExtras() {
        return this.extras;
    }

    @Override // defpackage.ru6
    public int getHeight() {
        return this.height;
    }

    public pqb getQualityInfo() {
        return this.qualityInfo;
    }

    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    @Override // defpackage.ru6
    public int getWidth() {
        return this.width;
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class st6 implements o9f, ev6, ose {
    public final wma a;
    public static final aa0 b = new aa0(lt6.class, null, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final aa0 c = new aa0(Integer.TYPE, null, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final aa0 o = new aa0(rv6.class, null, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public static final aa0 X = new aa0(ot6.class, null, "camerax.core.imageAnalysis.outputImageFormat");
    public static final aa0 Y = new aa0(Boolean.class, null, "camerax.core.imageAnalysis.onePixelShiftEnabled");
    public static final aa0 Z = new aa0(Boolean.class, null, "camerax.core.imageAnalysis.outputImageRotationEnabled");

    public st6(wma wmaVar) {
        this.a = wmaVar;
    }

    @Override // defpackage.t7c
    public final ce3 getConfig() {
        return this.a;
    }

    @Override // defpackage.tu6
    public final int getInputFormat() {
        return 35;
    }
}

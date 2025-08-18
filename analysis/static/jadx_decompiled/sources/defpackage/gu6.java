package defpackage;

/* loaded from: classes.dex */
public final class gu6 implements o9f, ev6, n67 {
    public static final aa0 X;
    public static final aa0 Y;
    public static final aa0 Z;
    public static final aa0 b;
    public static final aa0 c;
    public static final aa0 o;
    public static final aa0 s0;
    public static final aa0 t0;
    public static final aa0 u0;
    public static final aa0 v0;
    public static final aa0 w0;
    public final wma a;

    static {
        Class cls = Integer.TYPE;
        b = new aa0(cls, null, "camerax.core.imageCapture.captureMode");
        c = new aa0(cls, null, "camerax.core.imageCapture.flashMode");
        o = new aa0(iz1.class, null, "camerax.core.imageCapture.captureBundle");
        X = new aa0(Integer.class, null, "camerax.core.imageCapture.bufferFormat");
        Y = new aa0(Integer.class, null, "camerax.core.imageCapture.outputFormat");
        Z = new aa0(rv6.class, null, "camerax.core.imageCapture.imageReaderProxyProvider");
        s0 = new aa0(Boolean.TYPE, null, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        t0 = new aa0(cls, null, "camerax.core.imageCapture.flashType");
        u0 = new aa0(cls, null, "camerax.core.imageCapture.jpegCompressionQuality");
        v0 = new aa0(eu6.class, null, "camerax.core.imageCapture.screenFlash");
        w0 = new aa0(Boolean.class, null, "camerax.core.useCase.isPostviewEnabled");
    }

    public gu6(wma wmaVar) {
        this.a = wmaVar;
    }

    @Override // defpackage.t7c
    public final ce3 getConfig() {
        return this.a;
    }

    @Override // defpackage.tu6
    public final int getInputFormat() {
        return ((Integer) h(tu6.z)).intValue();
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class sdf implements o9f, ev6, ose {
    public static final aa0 b = new aa0(wjf.class, null, "camerax.video.VideoCapture.videoOutput");
    public static final aa0 c = new aa0(l66.class, null, "camerax.video.VideoCapture.videoEncoderInfoFinder");
    public static final aa0 o = new aa0(Boolean.class, null, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");
    public final wma a;

    public sdf(wma wmaVar) {
        c54.k(wmaVar.a.containsKey(b));
        this.a = wmaVar;
    }

    @Override // defpackage.t7c
    public final ce3 getConfig() {
        return this.a;
    }

    @Override // defpackage.tu6
    public final int getInputFormat() {
        return 34;
    }
}

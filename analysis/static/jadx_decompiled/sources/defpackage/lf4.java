package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* loaded from: classes.dex */
public final /* synthetic */ class lf4 implements dd6, wff {
    public final /* synthetic */ int a;
    public final /* synthetic */ agf b;

    public /* synthetic */ lf4(agf agfVar, int i) {
        this.a = i;
        this.b = agfVar;
    }

    @Override // defpackage.dd6, defpackage.wff
    public final void c(VideoFrameProcessingException videoFrameProcessingException) {
        int i = this.a;
        this.b.c(videoFrameProcessingException);
    }
}

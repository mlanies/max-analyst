package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* loaded from: classes.dex */
public final /* synthetic */ class mf4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf4 b;
    public final /* synthetic */ jn c;

    public /* synthetic */ mf4(rf4 rf4Var, jn jnVar, int i) {
        this.a = i;
        this.b = rf4Var;
        this.c = jnVar;
    }

    @Override // defpackage.xff
    public final void run() throws VideoFrameProcessingException {
        switch (this.a) {
            case 0:
                this.b.a(this.c, true);
                break;
            default:
                this.b.a(this.c, false);
                break;
        }
    }
}

package defpackage;

import android.view.Choreographer;
import org.webrtc.RenderSynchronizer;

/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            default:
                ((RenderSynchronizer) this.b).onDisplayRefreshCycleBegin(j);
                break;
        }
    }
}

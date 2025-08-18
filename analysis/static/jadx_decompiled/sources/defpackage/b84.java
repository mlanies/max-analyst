package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class b84 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b84(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        v75 v75Var;
        e84 e84Var;
        qqd qqdVar;
        w75 w75Var;
        switch (this.a) {
            case 0:
                nw4 nw4Var = (nw4) this.b;
                np8.f(audioTrack == ((d84) nw4Var.o).u);
                d84 d84Var = (d84) nw4Var.o;
                w4d w4dVar = d84Var.r;
                if (w4dVar != null && d84Var.U && (v75Var = ((u78) w4dVar.b).a2) != null) {
                    v75Var.a.s0.c(2);
                    break;
                }
                break;
            default:
                c84 c84Var = (c84) this.b;
                if (audioTrack.equals(c84Var.c.w) && (qqdVar = (e84Var = c84Var.c).s) != null && e84Var.Y && (w75Var = ((v78) qqdVar.b).R0) != null) {
                    w75Var.a();
                    break;
                }
                break;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.a) {
            case 1:
                c84 c84Var = (c84) this.b;
                if (audioTrack.equals(c84Var.c.w)) {
                    c84Var.c.X = true;
                    break;
                }
                break;
            default:
                super.onPresentationEnded(audioTrack);
                break;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        v75 v75Var;
        e84 e84Var;
        qqd qqdVar;
        w75 w75Var;
        switch (this.a) {
            case 0:
                nw4 nw4Var = (nw4) this.b;
                np8.f(audioTrack == ((d84) nw4Var.o).u);
                d84 d84Var = (d84) nw4Var.o;
                w4d w4dVar = d84Var.r;
                if (w4dVar != null && d84Var.U && (v75Var = ((u78) w4dVar.b).a2) != null) {
                    v75Var.a.s0.c(2);
                    break;
                }
                break;
            default:
                c84 c84Var = (c84) this.b;
                if (audioTrack.equals(c84Var.c.w) && (qqdVar = (e84Var = c84Var.c).s) != null && e84Var.Y && (w75Var = ((v78) qqdVar.b).R0) != null) {
                    w75Var.a();
                    break;
                }
                break;
        }
    }
}

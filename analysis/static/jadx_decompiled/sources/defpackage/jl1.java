package defpackage;

import android.media.VolumeProvider;
import one.me.calls.impl.service.CallServiceImpl;

/* loaded from: classes.dex */
public final class jl1 extends VolumeProvider {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(v4b v4bVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.b = v4bVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        switch (this.a) {
            case 0:
                hm9.n("CallServiceTag", "on adjust volume changed: " + i);
                ((q71) ((CallServiceImpl) this.b).Y.getValue()).a();
                break;
            default:
                v4b v4bVar = (v4b) this.b;
                v4bVar.getClass();
                oaf.W(v4bVar.f, new u4b(v4bVar, i, 1, 1));
                break;
        }
    }

    @Override // android.media.VolumeProvider
    public void onSetVolumeTo(int i) {
        switch (this.a) {
            case 1:
                v4b v4bVar = (v4b) this.b;
                v4bVar.getClass();
                oaf.W(v4bVar.f, new u4b(v4bVar, i, 1, 0));
                break;
            default:
                super.onSetVolumeTo(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(CallServiceImpl callServiceImpl) {
        super(1, 0, 0);
        this.b = callServiceImpl;
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
import one.me.stickerssearch.StickersSearchScreen;

/* loaded from: classes2.dex */
public final class h5e implements bha {
    public final /* synthetic */ StickersSearchScreen a;

    public h5e(StickersSearchScreen stickersSearchScreen) {
        this.a = stickersSearchScreen;
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        bc7[] bc7VarArr = StickersSearchScreen.u0;
        q5e q5eVarN0 = this.a.n0();
        if (tpa.f(charSequence, ((l5e) q5eVarN0.w0.get()).a)) {
            return;
        }
        vxd vxdVar = q5eVarN0.y0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        q0e q0eVar = q5eVarN0.Z;
        q0eVar.m(null, new szc(1, ((szc) q0eVar.getValue()).b));
        q5eVarN0.u0.setValue(charSequence != null ? charSequence.toString() : null);
    }

    @Override // defpackage.bha
    public final void p() {
        this.a.getRouter().C();
    }
}

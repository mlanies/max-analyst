package defpackage;

import android.content.Context;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class fwc implements nq7 {
    public l26 X;
    public volatile z26 Y;
    public final a4c a;
    public final mu3 b;
    public volatile boolean c;
    public h26 o;
    public volatile boolean Z = false;
    public final dwc s0 = new dwc(this, 2);

    public fwc(EglBase.Context context, Context context2, a4c a4cVar, u5e u5eVar, dnc dncVar) {
        mu3 mu3Var = new mu3("SSSendControl");
        this.b = mu3Var;
        this.a = a4cVar;
        mu3Var.c(new ws4(this, context, context2, u5eVar, a4cVar, dncVar, 1));
    }

    @Override // defpackage.nq7
    public final void a(int i, int i2) {
        this.b.c(new ft0(this, i, i2, 3));
    }
}

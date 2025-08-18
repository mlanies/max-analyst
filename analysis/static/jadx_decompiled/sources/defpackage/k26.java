package defpackage;

import org.webrtc.VpxEncoderWrapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class k26 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;

    public /* synthetic */ k26(l26 l26Var, int i) {
        this.a = i;
        this.b = l26Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l26 l26Var = this.b;
        switch (i) {
            case 0:
                l26Var.x0 = true;
                VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
                vpxEncoderWrapper.setConsumerCallback(l26Var);
                l26Var.Y = vpxEncoderWrapper;
                break;
            case 1:
                l26Var.a();
                break;
            default:
                l26Var.a();
                l26Var.Z = null;
                l26Var.s0 = null;
                break;
        }
    }
}

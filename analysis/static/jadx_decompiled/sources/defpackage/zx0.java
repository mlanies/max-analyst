package defpackage;

import org.webrtc.AndroidVideoDecoder;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class zx0 implements AndroidVideoDecoder.ErrorCallback, SignalingProvider {
    public final /* synthetic */ py0 a;

    public /* synthetic */ zx0(py0 py0Var) {
        this.a = py0Var;
    }

    @Override // org.webrtc.AndroidVideoDecoder.ErrorCallback
    public void error(Exception exc, String str) {
        py0 py0Var = this.a;
        py0Var.getClass();
        py0Var.V0.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }

    @Override // ru.ok.android.externcalls.sdk.signaling.SignalingProvider
    public rod getSignaling() {
        return this.a.Z;
    }
}

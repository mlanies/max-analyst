package defpackage;

import java.util.concurrent.ExecutorService;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final class qld {
    public final ExecutorService a;
    public final a4c b;
    public volatile String c;
    public volatile PeerConnectionFactory d;
    public final iy9 e;
    public fd7 f;
    public JavaAudioDeviceModule g;
    public EglBase h;
    public final pn9 i;
    public final kra j;

    public qld(EglBase eglBase, a4c a4cVar, ag1 ag1Var, tg4 tg4Var) {
        ar0 ar0Var;
        ar0 ar0Var2;
        ExecutorService executorService = py0.o2;
        this.a = executorService;
        this.b = a4cVar;
        this.i = tg4Var;
        this.e = new iy9(eglBase.getEglBaseContext(), a4cVar);
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        imc imcVar = ag1Var.w;
        kra kraVar = new kra(eglBaseContext, imcVar != null && (((ar0Var = (ar0) imcVar.b) != null && ar0Var.a) || ((ar0Var2 = (ar0) imcVar.c) != null && ar0Var2.a)), a4cVar);
        this.j = kraVar;
        tg4Var.b(kraVar);
        executorService.execute(new ewc(this, eglBase, a4cVar, 1));
    }
}

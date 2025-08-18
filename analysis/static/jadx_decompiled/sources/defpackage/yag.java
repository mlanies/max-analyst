package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.EncodedImage;

/* loaded from: classes2.dex */
public final class yag extends Thread {
    public ByteBuffer X;
    public EncodedImage Y;
    public final /* synthetic */ z26 Z;
    public final Object a = new Object();
    public final Object b = new Object();
    public e24 c;
    public volatile boolean o;

    public yag(z26 z26Var, e24 e24Var) {
        this.Z = z26Var;
        this.c = e24Var;
        setName("SSFrameSender");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x011b, code lost:
    
        r18.o = true;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.run():void");
    }
}

package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class i2f extends Thread {
    public final /* synthetic */ ccd a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2f(ccd ccdVar, Context context, String str, long j) {
        super("TransmuxTranscodeHelper:Mp4Info");
        this.a = ccdVar;
        this.b = context;
        this.c = str;
        this.o = j;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ccd ccdVar = this.a;
        try {
            ccdVar.l(zd9.a(this.b, this.o, this.c));
        } catch (Exception e) {
            ccdVar.m(e);
        }
    }
}

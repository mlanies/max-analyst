package defpackage;

import com.my.tracker.obfuscated.t;

/* loaded from: classes.dex */
public final /* synthetic */ class vcg implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ vcg(t tVar, String str, String str2, long j, long j2, long j3, int i) {
        this.a = i;
        this.b = tVar;
        this.c = str;
        this.o = str2;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.o, this.X, this.Y, this.Z);
                break;
            default:
                this.b.a(this.c, this.o, this.X, this.Y, this.Z);
                break;
        }
    }
}

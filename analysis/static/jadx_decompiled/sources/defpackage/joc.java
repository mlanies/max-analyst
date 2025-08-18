package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class joc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ koc b;
    public final /* synthetic */ long c;

    public /* synthetic */ joc(koc kocVar, long j, int i) {
        this.a = i;
        this.b = kocVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                koc kocVar = this.b;
                kocVar.m.offer(Long.valueOf(this.c));
                kocVar.b();
                break;
            default:
                koc kocVar2 = this.b;
                kocVar2.getClass();
                kocVar2.f.post(new joc(kocVar2, this.c, 0));
                break;
        }
    }
}

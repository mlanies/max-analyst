package defpackage;

/* loaded from: classes2.dex */
public final class qoc implements poc {
    public final a4c a;

    public qoc(a4c a4cVar) {
        if (a4cVar == null) {
            throw new IllegalArgumentException("Illegal 'logger' value: null");
        }
        this.a = a4cVar;
    }

    @Override // defpackage.poc
    public final void a(int i, byte[] bArr) {
        int i2 = kbg.a[au1.s(i)];
        this.a.log("RtcNotifications", "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : xj6.a(bArr) : new String(bArr)));
    }

    @Override // defpackage.poc
    public final void b(ooc oocVar) {
        this.a.log("RtcNotifications", "<- " + oocVar);
    }

    @Override // defpackage.poc
    public final void c(Throwable th) {
        this.a.log("RtcNotifications", "<- " + th);
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class fze implements a4c {
    public final xye a;
    public final a4c b;

    public fze(xye xyeVar, a4c a4cVar) {
        this.a = xyeVar;
        this.b = a4cVar;
    }

    @Override // defpackage.a4c
    public final void log(String str, String str2) {
        this.b.log(str, str2);
    }

    @Override // defpackage.a4c
    public final void logException(String str, String str2, Throwable th) {
        this.b.logException(str, str2, th);
    }

    @Override // defpackage.a4c
    public final void reportException(String str, String str2, Throwable th) {
        this.b.reportException(str, str2, th);
        xye xyeVar = this.a;
        xyeVar.getClass();
        try {
            ((qye) xyeVar.b.getValue()).a(null, th);
        } catch (Throwable unused) {
        }
    }
}

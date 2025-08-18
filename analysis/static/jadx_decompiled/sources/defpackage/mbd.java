package defpackage;

/* loaded from: classes2.dex */
public final class mbd {
    public final xme a;

    public mbd(yme ymeVar) {
        xme xmeVar = ymeVar instanceof xme ? (xme) ymeVar : null;
        this.a = xmeVar == null ? new xme(ymeVar) : xmeVar;
    }

    public final Thread a(String str, Runnable runnable) {
        return this.a.a(str).newThread(runnable);
    }
}

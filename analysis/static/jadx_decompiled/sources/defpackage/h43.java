package defpackage;

import android.util.CloseGuard;

/* loaded from: classes.dex */
public final class h43 implements i43 {
    public final CloseGuard a = new CloseGuard();

    @Override // defpackage.i43
    public final void a() {
        this.a.warnIfOpen();
    }

    @Override // defpackage.i43
    public final void b(String str) {
        this.a.open(str);
    }

    @Override // defpackage.i43
    public final void close() {
        this.a.close();
    }
}

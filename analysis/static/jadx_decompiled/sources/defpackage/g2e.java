package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class g2e implements nm9 {
    public final /* synthetic */ h2e a;

    public g2e(h2e h2eVar) {
        this.a = h2eVar;
    }

    @Override // defpackage.nm9
    public final void onFailed(Throwable th) {
        h2e h2eVar = this.a;
        h2eVar.b(h2eVar.f, th);
    }

    @Override // defpackage.nm9
    public final void onFinished(String str, File file, String str2) {
        ((iba) this.a.c.getValue()).c().execute(new ewc(this, file, str2, 5));
    }
}

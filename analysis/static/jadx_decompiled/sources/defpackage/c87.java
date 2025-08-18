package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class c87 implements d87 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ i87 c;

    public c87(i87 i87Var, Intent intent, int i) {
        this.c = i87Var;
        this.a = intent;
        this.b = i;
    }

    @Override // defpackage.d87
    public final void a() {
        this.c.stopSelf(this.b);
    }

    @Override // defpackage.d87
    public final Intent getIntent() {
        return this.a;
    }
}

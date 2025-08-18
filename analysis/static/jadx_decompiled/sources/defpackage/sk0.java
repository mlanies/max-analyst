package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class sk0 implements yk {
    public final Uri a;
    public final kl b;
    public final el c;
    public final za7 o;

    public sk0(Uri uri, kl klVar, el elVar, za7 za7Var) {
        this.a = uri;
        this.b = klVar;
        this.c = elVar;
        this.o = za7Var;
    }

    @Override // defpackage.yk
    public final za7 getOkParser() {
        return this.o;
    }

    @Override // defpackage.fl
    public final int getPriority() {
        return 16;
    }

    @Override // defpackage.fl
    public final kl getScope() {
        return this.b;
    }

    @Override // defpackage.fl
    public final Uri getUri() {
        return this.a;
    }

    @Override // defpackage.fl
    public final boolean shouldPost() {
        return this.c.c;
    }

    @Override // defpackage.fl
    public final boolean willWriteParams() {
        return this.c.d;
    }

    @Override // defpackage.fl
    public final boolean willWriteSupplyParams() {
        return this.c.e;
    }

    @Override // defpackage.fl
    public final void writeParams(kb7 kb7Var) {
        this.c.c(kb7Var);
    }

    @Override // defpackage.fl
    public final void writeSupplyParams(kb7 kb7Var) {
        this.c.d(kb7Var);
    }
}

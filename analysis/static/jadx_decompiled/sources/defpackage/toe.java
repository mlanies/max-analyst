package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class toe extends tu0 {
    public final /* synthetic */ ote n;
    public final /* synthetic */ voe o;

    public toe(voe voeVar, ote oteVar) {
        this.o = voeVar;
        this.n = oteVar;
    }

    @Override // defpackage.tu0
    public final void w(int i) {
        this.o.m = true;
        this.n.J(i);
    }

    @Override // defpackage.tu0
    public final void x(Typeface typeface) {
        voe voeVar = this.o;
        voeVar.n = Typeface.create(typeface, voeVar.c);
        voeVar.m = true;
        this.n.K(voeVar.n, false);
    }
}

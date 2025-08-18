package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class gab {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final ja6 d;
    public final lu6 e;
    public final ey1 f;
    public final bp4 g;
    public final boolean h;
    public final boolean i = false;
    public final o55 j;
    public final y7g k;
    public final ide l;
    public final lq8 m;
    public final lq8 n;
    public final o84 o;
    public final s2b p;
    public final wd6 q;
    public final int r;
    public final boolean s;

    public gab(Context context, ja6 ja6Var, lu6 lu6Var, ey1 ey1Var, bp4 bp4Var, boolean z, o55 o55Var, y7g y7gVar, y7g y7gVar2, y7g y7gVar3, ide ideVar, o84 o84Var, s2b s2bVar, int i, wd6 wd6Var) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = ja6Var;
        this.e = lu6Var;
        this.f = ey1Var;
        this.g = bp4Var;
        this.h = z;
        this.j = o55Var;
        this.k = y7gVar;
        this.n = y7gVar2;
        this.m = y7gVar3;
        this.l = ideVar;
        this.o = o84Var;
        this.p = s2bVar;
        new lq9();
        new lq9();
        this.r = i;
        this.q = wd6Var;
        this.s = false;
    }

    public final k54 a(dab dabVar) {
        return new k54(this.d, this.j.a(), this.e, this.f, this.g, this.h, this.i, dabVar, this.r, this.q);
    }

    public final iic b(dab dabVar, boolean z, zv6 zv6Var) {
        return new iic(this.j.d(), this.k, dabVar, z, zv6Var);
    }
}

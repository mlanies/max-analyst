package defpackage;

import kotlinx.coroutines.internal.Segment;

/* loaded from: classes.dex */
public final class w3d {
    public final Object a;
    public final c66 b;
    public final c66 c;
    public final Object d;
    public final Object e;
    public final c66 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ y3d i;

    public w3d(y3d y3dVar, Object obj, c66 c66Var, c66 c66Var2, Object obj2, ffe ffeVar, c66 c66Var3) {
        this.i = y3dVar;
        this.a = obj;
        this.b = c66Var;
        this.c = c66Var2;
        this.d = obj2;
        this.e = ffeVar;
        this.f = c66Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof Segment) {
            ((Segment) obj).onCancellation(this.h, null, this.i.a);
            return;
        }
        cm4 cm4Var = obj instanceof cm4 ? (cm4) obj : null;
        if (cm4Var != null) {
            cm4Var.dispose();
        }
    }
}

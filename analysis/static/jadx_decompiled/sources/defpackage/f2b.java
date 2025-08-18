package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class f2b implements ide {
    public final Context a;
    public final iv6 b;
    public final ty2 c;

    public f2b(Context context, vq7 vq7Var) {
        lv6 lv6VarG = lv6.g();
        this.a = context;
        iv6 iv6VarF = lv6VarG.f();
        this.b = iv6VarF;
        ty2 ty2Var = (ty2) vq7Var.c;
        if (ty2Var != null) {
            this.c = ty2Var;
        } else {
            this.c = new ty2();
        }
        ty2 ty2Var2 = this.c;
        Resources resources = context.getResources();
        bg4 bg4VarH = bg4.h();
        j84 j84VarA = lv6VarG.a();
        lv6VarG.b.v.getClass();
        if (v4f.b == null) {
            v4f.b = new v4f(new Handler(Looper.getMainLooper()));
        }
        v4f v4fVar = v4f.b;
        y7g y7gVar = (y7g) iv6VarF.f;
        ty2Var2.a = resources;
        ty2Var2.b = bg4VarH;
        ty2Var2.c = j84VarA;
        ty2Var2.getClass();
        ty2Var2.o = v4fVar;
        ty2Var2.X = y7gVar;
        ty2Var2.Y = (wz) vq7Var.b;
        ty2Var2.Z = (ide) vq7Var.o;
    }

    @Override // defpackage.ide
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e2b get() {
        e2b e2bVar = new e2b(this.a, this.c, this.b, null, null);
        e2bVar.r = null;
        return e2bVar;
    }
}

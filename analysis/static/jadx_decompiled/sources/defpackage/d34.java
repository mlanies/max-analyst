package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d34 {
    public final Context a;
    public final String b;
    public final wde c;
    public final sy4 d;
    public final List e;
    public final boolean f;
    public final int g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;

    public d34(Context context, String str, wde wdeVar, sy4 sy4Var, List list, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3, Set set, List list2, List list3) {
        this.a = context;
        this.b = str;
        this.c = wdeVar;
        this.d = sy4Var;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = set;
        this.m = list2;
        this.n = list3;
    }

    public final boolean a(int i, int i2) {
        if ((i > i2 && this.k) || !this.j) {
            return false;
        }
        Set set = this.l;
        return set == null || !set.contains(Integer.valueOf(i));
    }
}

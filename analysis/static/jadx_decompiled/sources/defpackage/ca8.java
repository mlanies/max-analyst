package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ca8 {
    public final f98 a;
    public final i3b b;
    public final hd8 c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public ca8() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.emptyList();
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }

    public ca8(f98 f98Var, i3b i3bVar, hd8 hd8Var, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = f98Var;
        this.b = i3bVar;
        this.c = hd8Var;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public ca8(ca8 ca8Var) {
        this.a = ca8Var.a;
        this.b = ca8Var.b;
        this.c = ca8Var.c;
        this.d = ca8Var.d;
        this.e = ca8Var.e;
        this.f = ca8Var.f;
        this.g = ca8Var.g;
        this.h = ca8Var.h;
    }
}

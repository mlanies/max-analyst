package com.facebook.fresco.ui.common;

import defpackage.nqf;
import defpackage.u2;
import defpackage.vu6;
import defpackage.x53;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends u2 {
    public Object X;
    public Object Y;
    public String c;
    public Object o;

    public final void Z1() {
        this.o = null;
        this.X = null;
        this.Y = null;
        vu6 vu6Var = vu6.a;
        nqf nqfVar = nqf.a;
        a2();
        ((ArrayList) this.b).clear();
    }

    public final void a2() {
        ((ArrayList) this.b).clear();
    }

    public final c b2() {
        String str = this.c;
        Object obj = this.o;
        Object obj2 = this.X;
        Object obj3 = this.Y;
        x53.D0((ArrayList) this.b);
        return new c(str, obj, obj2, obj3);
    }
}

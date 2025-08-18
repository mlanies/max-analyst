package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class v4 {
    public final ruc a;

    public v4(ruc rucVar) {
        this.a = rucVar;
    }

    public ArrayList a(Class cls) {
        return this.a.c(cls);
    }

    public khe b(Class cls) {
        ruc rucVar = this.a;
        rucVar.getClass();
        return new khe(new v2b(rucVar, 3, cls));
    }

    public Object c(Class cls) {
        return this.a.d(cls, true);
    }

    public khe d(Class cls) {
        ruc rucVar = this.a;
        rucVar.getClass();
        return new khe(new quc(rucVar, cls, true));
    }

    public Object e() {
        return this.a.d(xx6.class, false);
    }

    public khe f() {
        ruc rucVar = this.a;
        rucVar.getClass();
        return new khe(new quc(rucVar, xx6.class, false));
    }
}

package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class s6d implements r6d, px0 {
    public final r6d a;
    public final String b;
    public final Set c;

    public s6d(r6d r6dVar) {
        this.a = r6dVar;
        this.b = r6dVar.a() + '?';
        this.c = j1e.e(r6dVar);
    }

    @Override // defpackage.r6d
    public final String a() {
        return this.b;
    }

    @Override // defpackage.px0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.r6d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.r6d
    public final int d(String str) {
        return this.a.d(str);
    }

    @Override // defpackage.r6d
    public final pag e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s6d) {
            return tpa.f(this.a, ((s6d) obj).a);
        }
        return false;
    }

    @Override // defpackage.r6d
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.r6d
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.r6d
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.r6d
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.r6d
    public final r6d i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.r6d
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.r6d
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}

package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v85 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final i63 i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final ExportException p;
    public final zw6 q;

    public v85(ffc ffcVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, i63 i63Var, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.q = ffcVar;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i63Var;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = exportException;
        a(str2, i8, ffcVar, 1);
        a(str4, i8, ffcVar, 2);
    }

    public static void a(String str, int i, ffc ffcVar, int i2) {
        if (str == null || i == 1) {
            return;
        }
        char c = 0;
        ls5 ls5VarListIterator = ffcVar.listIterator(0);
        while (ls5VarListIterator.hasNext()) {
            u85 u85Var = (u85) ls5VarListIterator.next();
            if ((i2 == 1 ? u85Var.a : u85Var.b) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v85)) {
            return false;
        }
        v85 v85Var = (v85) obj;
        return Objects.equals(this.q, v85Var.q) && this.a == v85Var.a && this.b == v85Var.b && this.c == v85Var.c && this.d == v85Var.d && this.e == v85Var.e && Objects.equals(this.f, v85Var.f) && Objects.equals(this.g, v85Var.g) && this.h == v85Var.h && Objects.equals(this.i, v85Var.i) && this.j == v85Var.j && this.k == v85Var.k && this.l == v85Var.l && Objects.equals(this.m, v85Var.m) && Objects.equals(this.n, v85Var.n) && this.o == v85Var.o && Objects.equals(this.p, v85Var.p);
    }

    public final int hashCode() {
        return Objects.hashCode(this.p) + ((((Objects.hashCode(this.n) + ((Objects.hashCode(this.m) + ((((((((Objects.hashCode(this.i) + ((((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}

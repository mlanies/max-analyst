package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class v6g {
    public static final x6g b;
    public final x6g a;

    static {
        b = (Build.VERSION.SDK_INT >= 30 ? new n6g() : new m6g()).b().a.a().a.b().a.c();
    }

    public v6g(x6g x6gVar) {
        this.a = x6gVar;
    }

    public x6g a() {
        return this.a;
    }

    public x6g b() {
        return this.a;
    }

    public x6g c() {
        return this.a;
    }

    public void d(View view) {
    }

    public tl4 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6g)) {
            return false;
        }
        v6g v6gVar = (v6g) obj;
        return n() == v6gVar.n() && m() == v6gVar.m() && Objects.equals(j(), v6gVar.j()) && Objects.equals(h(), v6gVar.h()) && Objects.equals(e(), v6gVar.e());
    }

    public v27 f(int i) {
        return v27.e;
    }

    public v27 g() {
        return j();
    }

    public v27 h() {
        return v27.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public v27 i() {
        return j();
    }

    public v27 j() {
        return v27.e;
    }

    public v27 k() {
        return j();
    }

    public x6g l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void p(v27[] v27VarArr) {
    }

    public void q(x6g x6gVar) {
    }
}

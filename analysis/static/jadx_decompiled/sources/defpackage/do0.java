package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: classes.dex */
public final class do0 implements ww0 {
    public final String a;
    public final jic b;
    public final anc c;
    public final ju6 d;
    public final ww0 e;
    public final String f;
    public Object g;
    public final int h;

    public do0(String str, jic jicVar, anc ancVar, ju6 ju6Var, ww0 ww0Var, String str2) {
        this.a = str;
        this.b = jicVar;
        this.c = ancVar;
        this.d = ju6Var;
        this.e = ww0Var;
        this.f = str2;
        this.h = ((((ju6Var.hashCode() + ((ancVar.hashCode() + (((str.hashCode() * 31) + (jicVar != null ? jicVar.hashCode() : 0)) * 31)) * 31)) * 31) + (ww0Var != null ? ww0Var.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ww0
    public final boolean a(Uri uri) {
        return w9e.p0(this.a, uri.toString(), false);
    }

    @Override // defpackage.ww0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ww0
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ww0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!do0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        do0 do0Var = (do0) obj;
        return tpa.f(this.a, do0Var.a) && tpa.f(this.b, do0Var.b) && tpa.f(this.c, do0Var.c) && tpa.f(this.d, do0Var.d) && tpa.f(this.e, do0Var.e) && tpa.f(this.f, do0Var.f);
    }

    @Override // defpackage.ww0
    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}

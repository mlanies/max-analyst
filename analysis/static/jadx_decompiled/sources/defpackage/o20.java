package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Base64;
import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o20 implements t00 {
    public final Context a;
    public final y00 b;
    public final vxc c;
    public final HashMap d = new HashMap();
    public final Map e = Collections.synchronizedMap(new i56(200, 0));
    public final LruCache f = new LruCache(200);
    public final HashSet g = new HashSet();
    public final hc3 h = new hc3();

    public o20(Context context, y00 y00Var, vxc vxcVar) {
        this.a = context;
        this.b = y00Var;
        this.c = vxcVar;
    }

    public final Uri a(l20 l20Var) {
        x10 x10Var;
        y00 y00Var = this.b;
        y00Var.getClass();
        Uri uri = (Uri) y00Var.d.get(l20Var.r);
        if (uri != null) {
            return uri;
        }
        boolean zI = l20Var.i();
        s10 s10Var = l20Var.j;
        if (zI || s5c.P(l20Var)) {
            return j47.N((s5c.P(l20Var) ? s10Var.d.d : l20Var.d).d);
        }
        if (l20Var.f() || s5c.N(l20Var)) {
            return j47.N((s5c.N(l20Var) ? s10Var.d.b : l20Var.b).a());
        }
        if (!l20Var.g() || (x10Var = l20Var.g.f) == null) {
            return uri;
        }
        return j47.N(x10Var != null ? x10Var.a() : null);
    }

    public final BitmapDrawable b(l20 l20Var, boolean z) {
        l20 l20Var2;
        n20 n20Var = new n20(l20Var.r, z);
        Map map = this.e;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) map.get(n20Var);
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        s10 s10Var = l20Var.j;
        if (s10Var != null && (l20Var2 = s10Var.d) != null) {
            l20Var = l20Var2;
        }
        byte[] bArrD = s5c.D(l20Var);
        if (bArrD == null || bArrD.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e) {
                hm9.p("o20", "AttachmentsPreviewCache:", e);
            }
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrD, 0, bArrD.length);
        if (bitmapDecodeByteArray == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.a.getResources(), bitmapDecodeByteArray);
        map.put(n20Var, bitmapDrawable2);
        return bitmapDrawable2;
    }

    public final Uri c(l20 l20Var, boolean z) {
        l20 l20Var2;
        n20 n20Var = new n20(l20Var.r, z);
        LruCache lruCache = this.f;
        Uri uri = (Uri) lruCache.get(n20Var);
        if (uri != null) {
            return uri;
        }
        s10 s10Var = l20Var.j;
        if (s10Var != null && (l20Var2 = s10Var.d) != null) {
            l20Var = l20Var2;
        }
        byte[] bArrD = s5c.D(l20Var);
        if (bArrD == null || bArrD.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e) {
                hm9.p("o20", "AttachmentsPreviewCache:", e);
            }
        }
        Uri uri2 = Uri.parse("data:image/png;base64," + Base64.encodeToString(bArrD, 2));
        lruCache.put(n20Var, uri2);
        return uri2;
    }
}

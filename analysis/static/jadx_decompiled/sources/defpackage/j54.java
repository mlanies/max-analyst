package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j54 extends rg4 {
    public final eab c;
    public final hab d;
    public final ju6 e;
    public boolean f;
    public final n87 g;
    public int h;
    public final /* synthetic */ k54 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j54(k54 k54Var, fi0 fi0Var, eab eabVar, boolean z, int i) {
        super(fi0Var);
        this.i = k54Var;
        this.c = eabVar;
        oj0 oj0Var = (oj0) eabVar;
        this.d = oj0Var.c;
        this.e = oj0Var.a.h;
        this.g = new n87(k54Var.b, new ui0(this, k54Var, i, 4));
        oj0Var.a(new i54(this, z));
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void d() {
        p();
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void f(Throwable th) {
        q(th);
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        g05 g05Var = (g05) obj;
        f46.I();
        boolean zA = fi0.a(i);
        eab eabVar = this.c;
        if (zA) {
            if (g05Var == null) {
                oj0 oj0Var = (oj0) eabVar;
                tpa.f(oj0Var.Y.get("cached_value_found"), Boolean.TRUE);
                oj0Var.w0.v.getClass();
                q(new ExceptionWithNoStacktrace("Encoded image is null."));
                return;
            }
            if (!g05Var.e0()) {
                q(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                return;
            }
        }
        if (u(g05Var, i)) {
            boolean zL = fi0.l(i, 4);
            if (zA || zL || ((oj0) eabVar).f()) {
                this.g.c();
            }
        }
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void j(float f) {
        super.j(f * 0.99f);
    }

    public final dx6 m(l43 l43Var, long j, pqb pqbVar, boolean z, String str, String str2, String str3, String str4) {
        Map extras;
        Object obj;
        String string = null;
        if (!this.d.i(this.c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((hx6) pqbVar).b);
        String strValueOf3 = String.valueOf(z);
        if (l43Var != null && (extras = l43Var.getExtras()) != null && (obj = extras.get(HasExtraData.KEY_NON_FATAL_DECODE_ERROR)) != null) {
            string = obj.toString();
        }
        String str5 = string;
        if (!(l43Var instanceof CloseableStaticBitmap)) {
            HashMap map = new HashMap(7);
            map.put("queueTime", strValueOf);
            map.put("hasGoodQuality", strValueOf2);
            map.put("isFinal", strValueOf3);
            map.put("encodedImageSize", str2);
            map.put("imageFormat", str);
            map.put("requestedImageSize", str3);
            map.put("sampleSize", str4);
            if (str5 != null) {
                map.put(HasExtraData.KEY_NON_FATAL_DECODE_ERROR, str5);
            }
            return new dx6(map);
        }
        Bitmap underlyingBitmap = ((CloseableStaticBitmap) l43Var).getUnderlyingBitmap();
        String str6 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
        HashMap map2 = new HashMap(8);
        map2.put("bitmapSize", str6);
        map2.put("queueTime", strValueOf);
        map2.put("hasGoodQuality", strValueOf2);
        map2.put("isFinal", strValueOf3);
        map2.put("encodedImageSize", str2);
        map2.put("imageFormat", str);
        map2.put("requestedImageSize", str3);
        map2.put("sampleSize", str4);
        int byteCount = underlyingBitmap.getByteCount();
        StringBuilder sb = new StringBuilder();
        sb.append(byteCount);
        map2.put("byteCount", sb.toString());
        if (str5 != null) {
            map2.put(HasExtraData.KEY_NON_FATAL_DECODE_ERROR, str5);
        }
        return new dx6(map2);
    }

    public abstract int n(g05 g05Var);

    public abstract hx6 o();

    public final void p() {
        s(true);
        this.b.c();
    }

    public final void q(Throwable th) {
        s(true);
        this.b.e(th);
    }

    public final l43 r(g05 g05Var, int i, pqb pqbVar) {
        k54 k54Var = this.i;
        k54Var.getClass();
        return k54Var.c.a(g05Var, i, pqbVar, this.e);
    }

    public final void s(boolean z) {
        g05 g05Var;
        synchronized (this) {
            if (z) {
                if (!this.f) {
                    this.b.i(1.0f);
                    this.f = true;
                    n87 n87Var = this.g;
                    synchronized (n87Var) {
                        g05Var = n87Var.e;
                        n87Var.e = null;
                        n87Var.f = 0;
                    }
                    g05.d(g05Var);
                }
            }
        }
    }

    public final void t(g05 g05Var, l43 l43Var, int i) {
        g05Var.o0();
        Integer numValueOf = Integer.valueOf(g05Var.Y);
        oj0 oj0Var = (oj0) this.c;
        oj0Var.putExtra(HasExtraData.KEY_ENCODED_WIDTH, numValueOf);
        g05Var.o0();
        oj0Var.putExtra(HasExtraData.KEY_ENCODED_HEIGHT, Integer.valueOf(g05Var.Z));
        oj0Var.putExtra(HasExtraData.KEY_ENCODED_SIZE, Integer.valueOf(g05Var.o()));
        g05Var.o0();
        oj0Var.putExtra(HasExtraData.KEY_COLOR_SPACE, g05Var.u0);
        if (l43Var instanceof CloseableStaticBitmap) {
            oj0Var.putExtra(HasExtraData.KEY_BITMAP_CONFIG, String.valueOf(((CloseableStaticBitmap) l43Var).getUnderlyingBitmap().getConfig()));
        }
        if (l43Var != null) {
            l43Var.putExtras(oj0Var.Y);
        }
        oj0Var.putExtra(HasExtraData.KEY_LAST_SCAN_NUMBER, Integer.valueOf(i));
    }

    public abstract boolean u(g05 g05Var, int i);
}

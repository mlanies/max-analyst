package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class fj {
    public final AtomicReference a = new AtomicReference(xxc.b);
    public final HashMap b;

    static {
        nec.a(fj.class).b();
    }

    public fj() {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.b = new HashMap();
    }

    public final List a(CharSequence charSequence) {
        if ((charSequence instanceof Spanned) && charSequence.length() != 0) {
            HashMap map = this.b;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int length = charSequence.length();
                Object[] spans = null;
                try {
                    Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, c4f.class);
                    }
                } catch (Throwable unused) {
                }
                c4f[] c4fVarArr = (c4f[]) spans;
                if (c4fVarArr != null) {
                    for (c4f c4fVar : c4fVarArr) {
                        try {
                            au1.r(map.get(charSequence.subSequence(((Spanned) charSequence).getSpanStart(c4fVar), ((Spanned) charSequence).getSpanEnd(c4fVar)).toString()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return x53.x0(arrayList, new fs4(7));
            }
        }
        return nz4.a;
    }
}

package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class ca3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                for (m56 m56Var : (m56[]) this.b) {
                    int iF = xfg.f((Comparable) m56Var.invoke(obj), (Comparable) m56Var.invoke(obj2));
                    if (iF != 0) {
                        return iF;
                    }
                }
                return 0;
            case 1:
                uj3 uj3Var = (uj3) obj2;
                long jN = ((uj3) obj).n();
                ei9 ei9Var = (ei9) this.b;
                int iB = ei9Var.b(jN);
                long j = iB >= 0 ? ei9Var.c[iB] : 0L;
                int iB2 = ei9Var.b(uj3Var.n());
                return np8.j(j, iB2 >= 0 ? ei9Var.c[iB2] : 0L);
            case 2:
                return oq3.a((uj3) obj, (uj3) obj2, (Collator) ((oq3) this.b).a.e());
            case 3:
                kzc kzcVar = (kzc) obj;
                kzc kzcVar2 = (kzc) obj2;
                vx7 vx7Var = (vx7) this.b;
                vx7Var.getClass();
                if (kzcVar2 == null) {
                    return 0;
                }
                e52 e52Var = kzcVar.o;
                e52 e52Var2 = kzcVar2.o;
                if (e52Var == null || e52Var2 == null) {
                    return (e52Var == null || e52Var2 != null) ? 0 : -1;
                }
                long jM = e52Var2.m();
                e52 e52Var3 = kzcVar.o;
                long jM2 = e52Var3.m();
                k92 k92Var = e52Var2.b;
                long j2 = vx7Var.b;
                if (k92Var.f(j2)) {
                    jM = Long.MAX_VALUE;
                }
                if (e52Var3.b.f(j2)) {
                    jM2 = Long.MAX_VALUE;
                }
                return Long.compare(jM, jM2);
            case 4:
                m88 m88Var = (m88) this.b;
                return m88Var.a(obj2) - m88Var.a(obj);
            case 5:
                n88 n88Var = (n88) this.b;
                return n88Var.a(obj2) - n88Var.a(obj);
            case 6:
                rb0 rb0Var = (rb0) obj2;
                ((ae3) this.b).getClass();
                Class cls = ((rb0) obj).a.j;
                int i = 1;
                int i2 = cls == MediaCodec.class ? 2 : cls == h8b.class ? 0 : 1;
                Class cls2 = rb0Var.a.j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == h8b.class) {
                    i = 0;
                }
                return i2 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}

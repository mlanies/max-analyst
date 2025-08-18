package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j2d {
    public final itd b;
    public final String c;
    public final Iterator d;
    public final float e;
    public final int f;
    public final int g;
    public i2d h;
    public i2d i;
    public long j;
    public final byte[] a = new byte[4];
    public long k = -9223372036854775807L;

    public j2d(qy5 qy5Var) {
        itd itdVar;
        int i;
        List list;
        int i2 = -1;
        boolean z = true;
        f99 f99Var = qy5Var.k;
        float f = -3.4028235E38f;
        if (f99Var == null) {
            i = -1;
            itdVar = null;
        } else {
            int i3 = -1;
            int i4 = 0;
            itdVar = null;
            float f2 = -3.4028235E38f;
            while (true) {
                d99[] d99VarArr = f99Var.a;
                if (i4 >= d99VarArr.length) {
                    break;
                }
                d99 d99Var = d99VarArr[i4];
                if (d99Var instanceof eud) {
                    eud eudVar = (eud) d99Var;
                    f2 = eudVar.a;
                    i3 = eudVar.b - 1;
                } else if (d99Var instanceof itd) {
                    itdVar = (itd) d99Var;
                }
                i4++;
            }
            if (itdVar != null) {
                fm9.j("SVC temporal layer count not found.", i3 != -1);
                fm9.j("Capture frame rate not found.", f2 != -3.4028235E38f);
                fm9.j("Invalid capture frame rate: " + f2, f2 % 1.0f == 0.0f && f2 % 30.0f == 0.0f);
                int i5 = ((int) f2) / 30;
                int i6 = i3;
                while (true) {
                    if (i6 < 0) {
                        break;
                    }
                    if ((i5 & 1) == 1) {
                        fm9.j("Could not compute normal speed max SVC layer for capture frame rate  " + f2, (i5 >> 1) == 0);
                        i2 = i6;
                    } else {
                        i5 >>= 1;
                        i6--;
                    }
                }
            }
            i = i2;
            f = f2;
            i2 = i3;
        }
        this.b = itdVar;
        String str = qy5Var.n;
        str.getClass();
        this.c = str;
        if (itdVar != null) {
            if (!str.equals("video/avc") && !str.equals("video/hevc")) {
                z = false;
            }
            fm9.e("Unsupported MIME type for SEF slow motion video track: ".concat(str), z);
        }
        if (itdVar != null) {
            list = itdVar.a;
        } else {
            ls5 ls5Var = zw6.b;
            list = ffc.X;
        }
        Iterator it = list.iterator();
        this.d = it;
        this.e = f;
        this.f = i2;
        this.g = i;
        this.i = it.hasNext() ? new i2d((gtd) it.next(), i2, i) : null;
    }

    public final void a() {
        i2d i2dVar = this.h;
        if (i2dVar != null) {
            this.j = ((i2dVar.b - i2dVar.a) * (i2dVar.c - 1)) + this.j;
            this.h = null;
        }
        this.h = this.i;
        Iterator it = this.d;
        this.i = it.hasNext() ? new i2d((gtd) it.next(), this.f, this.g) : null;
    }
}

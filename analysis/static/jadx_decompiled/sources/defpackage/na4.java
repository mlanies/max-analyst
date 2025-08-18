package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class na4 implements v43 {
    public final int X;
    public final Context a;
    public final xw0 b;
    public iff c;
    public boolean o;

    public na4(Context context) {
        this.a = context.getApplicationContext();
        this.b = xw0.X;
        this.c = iff.i;
        this.o = true;
        this.X = -2000;
    }

    public static ExportException e(qy5 qy5Var, String str) {
        return ExportException.c(new IllegalArgumentException(str), 4003, new qh3(qy5Var.toString(), null, ia9.k(qy5Var.n), false));
    }

    public static zw6 f(zw6 zw6Var, oa4 oa4Var) {
        ArrayList arrayList = new ArrayList(zw6Var.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < zw6Var.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) zw6Var.get(i2);
            int iA = oa4Var.a(mediaCodecInfo);
            if (iA != Integer.MAX_VALUE) {
                if (iA < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = iA;
                } else if (iA == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return zw6.j(arrayList);
    }

    @Override // defpackage.v43
    public boolean a() {
        return !this.c.equals(iff.i);
    }

    @Override // defpackage.v43
    public y84 b(qy5 qy5Var) throws ExportException {
        if (qy5Var.i == -1) {
            ny5 ny5VarA = qy5Var.a();
            ny5VarA.b(131072);
            qy5Var = ny5VarA.a();
        }
        qy5 qy5Var2 = qy5Var;
        String str = qy5Var2.n;
        fm9.h(str);
        MediaFormat mediaFormatU = j47.u(qy5Var2);
        zw6 zw6VarF = h15.f(str);
        if (zw6VarF.isEmpty()) {
            throw e(qy5Var2, "No audio media codec found");
        }
        return new y84(this.a, qy5Var2, mediaFormatU, ((MediaCodecInfo) zw6VarF.get(0)).getName(), false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // defpackage.v43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.y84 d(defpackage.qy5 r19) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na4.d(qy5):y84");
    }

    public na4(na4 na4Var) {
        this.a = na4Var.a;
        this.b = na4Var.b;
        this.c = na4Var.c;
        this.o = na4Var.o;
        this.X = na4Var.X;
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.cardview.widget.CardView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.upload.messages.MessageUploadException;

/* loaded from: classes2.dex */
public final class ob6 implements qj3, b7b, km0, e46, za7, k88, lm9, ihb, kz3, dnc {
    public static final ob6 a = new ob6();
    public static final ob6 b = new ob6();
    public static final /* synthetic */ ob6 c = new ob6();
    public static final te5 o = new te5();
    public static final ob6 X = new ob6();
    public static final ob6 Y = new ob6();

    public ob6(int i) {
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                new khe(new xid(18));
                break;
        }
    }

    public static ow4 l(int i) {
        Object next;
        v25 v25Var = ow4.t0;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (true) {
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (((ow4) next).a == i) {
                break;
            }
        }
        ow4 ow4Var = (ow4) next;
        return ow4Var == null ? ow4.Y : ow4Var;
    }

    @Override // defpackage.k88
    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        kef kefVar = (kef) obj;
        if (!kefVar.b || !pag.l(kefVar.d)) {
            throw new MessageUploadException("conversion failed");
        }
    }

    @Override // defpackage.km0
    public long b(long j) {
        return j;
    }

    public nd7 c(qy5 qy5Var) {
        int i = 1;
        int i2 = 0;
        String str = qy5Var.n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new xo(i2);
                case "application/x-icy":
                    return new ss6();
                case "application/id3":
                    return new bt6(null);
                case "application/x-emsg":
                    return new xo(i);
                case "application/x-scte35":
                    return new wvd();
            }
        }
        throw new IllegalArgumentException(wg0.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // defpackage.k88
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.k88
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.ihb
    public void f(int i, Serializable serializable) {
    }

    @Override // defpackage.k88
    public int g() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.k88
    public boolean h() {
        return false;
    }

    @Override // defpackage.lm9
    public void i(String str) {
        hm9.n("RLottie", str);
    }

    @Override // defpackage.lm9
    public void j(String str, Throwable th) {
        hm9.p("RLottie", str, th);
    }

    public m85[] k(k85[] k85VarArr, gg0 gg0Var) {
        m85 b9Var;
        double dLog;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (k85 k85Var : k85VarArr) {
            if (k85Var == null || k85Var.b.length <= 1) {
                arrayList.add(null);
            } else {
                ww6 ww6VarI = zw6.i();
                ww6VarI.d(new z8(0L, 0L));
                arrayList.add(ww6VarI);
            }
        }
        int length = k85VarArr.length;
        long[][] jArr = new long[length][];
        for (int i2 = 0; i2 < k85VarArr.length; i2++) {
            k85 k85Var2 = k85VarArr[i2];
            if (k85Var2 == null) {
                jArr[i2] = new long[0];
            } else {
                int[] iArr = k85Var2.b;
                jArr[i2] = new long[iArr.length];
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    jArr[i2][i3] = k85Var2.a.c[iArr[i3]].s0;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            long[] jArr3 = jArr[i4];
            jArr2[i4] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        b9.v(arrayList, jArr2);
        pg9 pg9VarG = sh0.H().c().g();
        int i5 = 0;
        while (i5 < length) {
            long[] jArr4 = jArr[i5];
            if (jArr4.length > 1) {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i6 = i;
                while (true) {
                    long[] jArr5 = jArr[i5];
                    dLog = 0.0d;
                    if (i6 >= jArr5.length) {
                        break;
                    }
                    long j = jArr5[i6];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i6] = dLog;
                    i6++;
                }
                int i7 = length2 - 1;
                double d = dArr[i7] - dArr[i];
                int i8 = i;
                while (i8 < i7) {
                    double d2 = dArr[i8];
                    i8++;
                    pg9VarG.g(Double.valueOf(d == dLog ? 1.0d : (((d2 + dArr[i8]) * 0.5d) - dArr[i]) / d), Integer.valueOf(i5));
                    i = 0;
                    dLog = 0.0d;
                }
            }
            i5++;
            i = 0;
        }
        zw6 zw6VarJ = zw6.j(pg9VarG.h());
        for (int i9 = 0; i9 < zw6VarJ.size(); i9++) {
            int iIntValue = ((Integer) zw6VarJ.get(i9)).intValue();
            int i10 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i10;
            jArr2[iIntValue] = jArr[iIntValue][i10];
            b9.v(arrayList, jArr2);
        }
        for (int i11 = 0; i11 < k85VarArr.length; i11++) {
            if (arrayList.get(i11) != null) {
                jArr2[i11] = jArr2[i11] * 2;
            }
        }
        b9.v(arrayList, jArr2);
        ww6 ww6VarI2 = zw6.i();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ww6 ww6Var = (ww6) arrayList.get(i12);
            ww6VarI2.d(ww6Var == null ? zw6.m() : ww6Var.j());
        }
        ffc ffcVarJ = ww6VarI2.j();
        m85[] m85VarArr = new m85[k85VarArr.length];
        for (int i13 = 0; i13 < k85VarArr.length; i13++) {
            k85 k85Var3 = k85VarArr[i13];
            if (k85Var3 != null) {
                int[] iArr3 = k85Var3.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        int i14 = iArr3[0];
                        int i15 = k85Var3.c;
                        b9Var = new gm5(k85Var3.a, new int[]{i14});
                    } else {
                        long j2 = 25000;
                        b9Var = new b9(k85Var3.a, iArr3, k85Var3.c, gg0Var, 10000, j2, j2, 1279, 719, 0.7f, 0.75f, (zw6) ffcVarJ.get(i13), rhe.a);
                    }
                    m85VarArr[i13] = b9Var;
                }
            }
        }
        return m85VarArr;
    }

    public void m(qz7 qz7Var, float f) {
        lnc lncVar = (lnc) ((Drawable) qz7Var.b);
        CardView cardView = (CardView) qz7Var.c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != lncVar.e || lncVar.f != useCompatPadding || lncVar.g != preventCornerOverlap) {
            lncVar.e = f;
            lncVar.f = useCompatPadding;
            lncVar.g = preventCornerOverlap;
            lncVar.b(null);
            lncVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            qz7Var.X(0, 0, 0, 0);
            return;
        }
        lnc lncVar2 = (lnc) ((Drawable) qz7Var.b);
        float f2 = lncVar2.e;
        float f3 = lncVar2.a;
        int iCeil = (int) Math.ceil(mnc.a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(mnc.b(f2, f3, cardView.getPreventCornerOverlap()));
        qz7Var.X(iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean n(qy5 qy5Var) {
        String str = qy5Var.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.lm9
    public void o(Throwable th) {
        hm9.p("RLottie", "fail!", th);
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        if (db7Var.peek() == 0) {
            return null;
        }
        db7Var.z();
        return null;
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return fme.a(((Number) obj).intValue());
    }
}

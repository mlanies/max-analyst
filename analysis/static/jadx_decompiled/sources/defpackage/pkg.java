package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pkg implements u43 {
    public static pkg X;
    public Object a;
    public int b;
    public Object c;
    public Object o;

    public static ExportException c(qy5 qy5Var, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String string = qy5Var.toString();
        String str2 = qy5Var.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new qh3(string, null, ia9.k(str2), true));
    }

    public static synchronized pkg f(Context context) {
        try {
            if (X == null) {
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new cm9("MessengerIpcClient", 0)));
                pkg pkgVar = new pkg();
                pkgVar.o = new vjg(pkgVar);
                pkgVar.b = 1;
                pkgVar.c = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                pkgVar.a = context.getApplicationContext();
                X = pkgVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return X;
    }

    public String a(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = (String[]) this.a;
            int i3 = this.b;
            if (i2 >= i3) {
                sb.append(strArr[i3]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            int i4 = ((int[]) this.c)[i2];
            if (i4 == 1) {
                sb.append(str);
            } else {
                String[] strArr2 = (String[]) this.o;
                if (i4 == 2) {
                    sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, strArr2[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }

    public y84 b(MediaFormat mediaFormat, qy5 qy5Var, Surface surface, boolean z) throws ExportException {
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        qy5Var.n.getClass();
        try {
            ArrayList arrayListH = p88.h(qy5Var, p88.g((xw0) this.o, qy5Var, false, false));
            if (arrayListH.isEmpty()) {
                throw c(qy5Var, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < arrayListH.size(); i++) {
                    y78 y78Var = (y78) arrayListH.get(i);
                    if (!y78Var.g) {
                        arrayList.add(y78Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayListH = arrayList;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Context context = (Context) this.a;
            for (y78 y78Var2 : arrayListH.subList(0, 1)) {
                mediaFormat.setString("mime", y78Var2.c);
                try {
                    y84 y84Var = new y84(context, qy5Var, mediaFormat, y78Var2.a, true, surface);
                    y84Var.b();
                    ((av1) this.c).getClass();
                    return y84Var;
                } catch (ExportException e) {
                    arrayList2.add(e);
                }
            }
            throw ((ExportException) arrayList2.get(0));
        } catch (MediaCodecUtil$DecoderQueryException e2) {
            z04.v("Error querying decoders", e2);
            throw c(qy5Var, "Querying codecs failed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (defpackage.oaf.d.startsWith("SM-F936") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // defpackage.u43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.y84 d(defpackage.qy5 r8, android.view.Surface r9, boolean r10) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkg.d(qy5, android.view.Surface, boolean):y84");
    }

    public iqd e(Resources resources, hle hleVar) {
        te0 te0Var = (te0) this.o;
        if (te0Var != null) {
            return iqd.g(te0Var);
        }
        Drawable drawable = (Drawable) this.c;
        if (drawable != null) {
            te0 te0Var2 = new te0(drawable);
            this.o = te0Var2;
            return iqd.g(te0Var2);
        }
        if (((Uri) this.a) == null) {
            te0 te0Var3 = new te0(new ColorDrawable(this.b));
            this.o = te0Var3;
            return iqd.g(te0Var3);
        }
        uqd uqdVarH = new q1a(2, new l5(12, this)).h(new yt8(15, resources));
        hleVar.getClass();
        jle jleVar = (jle) hleVar;
        return new rqd(uqdVarH.m(jleVar.a()).i(jleVar.b()), new yt8(16, this), 2);
    }

    @Override // defpackage.u43
    public y84 g(qy5 qy5Var) {
        return b(j47.u(qy5Var), qy5Var, null, false);
    }

    public synchronized ukg h(ckg ckgVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(ckgVar.toString());
            }
            if (!((vjg) this.o).d(ckgVar)) {
                vjg vjgVar = new vjg(this);
                this.o = vjgVar;
                vjgVar.d(ckgVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ckgVar.b.a;
    }
}

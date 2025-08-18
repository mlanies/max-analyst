package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class qx7 implements s43, kx3, cc3, ypa, b66, iud {
    public final /* synthetic */ int a;
    public static final qx7 b = new qx7(1);
    public static final /* synthetic */ qx7 c = new qx7(2);
    public static final qx7 o = new qx7(3);
    public static final qx7 X = new qx7(4);
    public static final qx7 Y = new qx7(5);

    public /* synthetic */ qx7(int i) {
        this.a = i;
    }

    public static int a(View view) {
        return tu0.G((x6g.f(view, view.getRootWindowInsets()).a.f(2).d > 0 ? 52 : 60) * fk4.d().getDisplayMetrics().density);
    }

    public static ArrayList b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(d((gg1) entry.getKey(), (bo1) entry.getValue()));
        }
        return arrayList;
    }

    public static z9f d(gg1 gg1Var, bo1 bo1Var) {
        iqe iqeVar = new iqe(bo1Var.getName());
        uc0 uc0VarA = oag.a(bo1Var.getName(), Long.valueOf(gg1Var.a));
        String strQ = bo1Var.q();
        if (strQ == null) {
            strQ = "";
        }
        return new z9f(iqeVar, uc0VarA, strQ, gg1Var);
    }

    public static vs8 e(fka fkaVar) {
        return new vs8(fkaVar.a().g().a.o, fkaVar.a().k().a.o, false, 3, false, false, 1008);
    }

    public static sn0 h() {
        try {
            xig xigVar = z04.d;
            fp3.o(xigVar, "IBitmapDescriptorFactory is not initialized");
            kig kigVar = (kig) xigVar;
            Parcel parcelR = kigVar.R(kigVar.G0(), 4);
            xr6 xr6VarK0 = oy9.K0(parcelR.readStrongBinder());
            parcelR.recycle();
            return new sn0(new rxd(xr6VarK0));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static sn0 i(Bitmap bitmap) {
        try {
            xig xigVar = z04.d;
            fp3.o(xigVar, "IBitmapDescriptorFactory is not initialized");
            kig kigVar = (kig) xigVar;
            Parcel parcelG0 = kigVar.G0();
            agg.b(parcelG0, bitmap);
            Parcel parcelR = kigVar.R(parcelG0, 6);
            xr6 xr6VarK0 = oy9.K0(parcelR.readStrongBinder());
            parcelR.recycle();
            return new sn0(new rxd(xr6VarK0));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[EDGE_INSN: B:91:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089, LOOP_LABEL: LOOP:2: B:49:0x0072->B:60:0x0089], EDGE_INSN: B:94:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx7.j(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static Spannable k(CharSequence charSequence, int i, boolean z, boolean z2, m56 m56Var) {
        if (!(charSequence instanceof Spannable) || charSequence.length() == 0) {
            return null;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        if (spans.length == 0) {
            return (Spannable) charSequence;
        }
        for (Object obj : spans) {
            if (obj instanceof cmb) {
                cmb cmbVar = (cmb) obj;
                cmbVar.b = i;
                cmbVar.c = z;
            } else if ((obj instanceof URLSpan) && !(obj instanceof gk7)) {
                Spannable spannable = (Spannable) charSequence;
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                try {
                    ((Spannable) charSequence).removeSpan(obj);
                    ((Spannable) charSequence).setSpan(new gk7(((URLSpan) obj).getURL(), i, z, z2), spanStart, spanEnd, 33);
                } catch (Throwable unused) {
                }
            }
            if (m56Var != null) {
                m56Var.invoke(obj);
            }
        }
        return (Spannable) charSequence;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return obj;
    }

    public /* bridge */ Object c(rjc rjcVar) {
        return null;
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return nd7.s((Executor) bg4Var.f(new lqb(le0.class, Executor.class)));
    }

    @Override // defpackage.ypa
    public Object g(Uri uri, w24 w24Var) {
        return Long.valueOf(maf.G(new BufferedReader(new InputStreamReader(w24Var)).readLine()));
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.s43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gle w(defpackage.gy8 r13) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx7.w(gy8):gle");
    }
}

package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class lq9 implements b66, cc3, iud, vaf, za7, py7, df9 {
    public static lq9 a;
    public static final lq9 b = new lq9();
    public static final lq9 c = new lq9();
    public static final lq9 o = new lq9();
    public static final lq9 X = new lq9();
    public static final lq9 Y = new lq9();

    public /* synthetic */ lq9(Object obj) {
    }

    @Override // defpackage.py7
    public Map a(Map map) {
        return map == null ? new LinkedHashMap() : map;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return new t28(new uh((ed1) obj, 4, xlc.a(0, "SELECT * FROM call_links")));
    }

    public void b(cy7 cy7Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Event bus " + cy7Var + " accessed from non-main thread " + Looper.myLooper());
    }

    public int c(Context context, String str) {
        return lu4.a(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:9:0x0027, B:11:0x0033, B:48:0x00a3, B:16:0x003c, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:39:0x0080, B:40:0x0088, B:38:0x0072, B:43:0x008d, B:46:0x0090, B:47:0x009a, B:17:0x003f), top: B:132:0x0027, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq9.d(android.content.Context, java.lang.String, boolean):int");
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return nd7.s((Executor) bg4Var.f(new lqb(kh7.class, Executor.class)));
    }

    @Override // defpackage.vaf
    public int j(Object obj) {
        return ((qq8) obj).U();
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        return mqd.w(db7Var);
    }

    @Override // defpackage.df9
    public Object r(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        fs8 fs8VarZ = null;
        if (iN == 0) {
            return null;
        }
        long jW0 = 0;
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            if (strZ0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                jW0 = gy8Var.w0();
            } else if (strZ0.equals("message")) {
                fs8VarZ = tpa.z(gy8Var);
            } else {
                gy8Var.z();
            }
        }
        return new r71(jW0, fs8VarZ);
    }

    public lq9() {
        new LinkedHashSet(20);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qe0 {
    public final je7 a;
    public final je7 b;

    public qe0(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public static final kge a(qe0 qe0Var, byte[] bArr, fbf fbfVar) {
        qe0Var.getClass();
        kge kgeVar = new kge(new String(bArr, a52.a), fbfVar.b, fbfVar.c);
        kgeVar.setAlpha(fbfVar.d);
        kgeVar.a.g.setXfermode(new PorterDuffXfermode(fbfVar.e ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
        Object objA = hp0.a(gp0.a);
        kgeVar.setColorFilter(objA != null ? fp0.a(fbfVar.f, objA) : null);
        return kgeVar;
    }

    public static ArrayList b(JSONArray jSONArray, int[] iArr) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject.getJSONArray("stops");
            int i2 = i * 3;
            int iMin = Math.min(i2 + 3, iArr.length);
            dy7.m(iMin, iArr.length);
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i2, iMin);
            if (iArrCopyOfRange.length < 2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int length2 = iArrCopyOfRange.length;
            int length3 = jSONArray2.length();
            float[] fArr = new float[length3];
            int length4 = jSONArray2.length();
            int i3 = 0;
            while (i3 < length4) {
                fArr[i3] = (float) jSONArray2.getDouble(i3);
                i3++;
                i = i;
            }
            int i4 = i;
            if (length2 != length3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            arrayList.add(new ebf((float) jSONObject.getDouble("x"), (float) jSONObject.getDouble("y"), (float) jSONObject.getDouble("radiusX"), (float) jSONObject.getDouble("radiusY"), (float) jSONObject.getDouble("angle"), fArr, iArrCopyOfRange));
            i = i4 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap c(android.content.Context r44, defpackage.ze0 r45) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe0.c(android.content.Context, ze0):java.util.LinkedHashMap");
    }

    public final Object d(Context context, fbf fbfVar, Continuation continuation) {
        return j47.t0(((w9a) ((kke) this.a.getValue())).b(), new pe0(this, context, fbfVar, null), continuation);
    }
}

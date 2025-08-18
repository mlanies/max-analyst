package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class cbf {
    public final qre a;
    public final je7 b = tu0.r(3, new bse(5));
    public final je7 c = tu0.r(3, new bse(6));
    public final je7 d = tu0.r(3, new bse(7));
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public cbf(qre qreVar) {
        this.a = qreVar;
    }

    public static void a(Canvas canvas, ArrayList arrayList, ArrayList arrayList2, Paint paint) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            bbf bbfVar = (bbf) next;
            Shader shader = (Shader) x53.j0(i, arrayList2);
            if (shader != null) {
                paint.setShader(shader);
                float f = bbfVar.c;
                float f2 = bbfVar.b;
                float f3 = bbfVar.a;
                float f4 = bbfVar.d;
                float fMax = f / Math.max(f, f4);
                float f5 = bbfVar.c;
                float fMax2 = f4 / Math.max(f5, f4);
                int iSave = canvas.save();
                try {
                    canvas.rotate(bbfVar.e, f3, f2);
                    canvas.scale(fMax, fMax2, f3, f2);
                    canvas.drawCircle(f3, f2, Math.max(f5, f4), paint);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            i = i2;
        }
    }

    public static void b(List list, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        arrayList.clear();
        arrayList2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ore oreVar = (ore) it.next();
            float f = i;
            float f2 = (oreVar.a * f) / 100.0f;
            float f3 = i2;
            float f4 = (oreVar.b * f3) / 100.0f;
            float f5 = (f * oreVar.e) / 100.0f;
            float f6 = (f3 * oreVar.f) / 100.0f;
            arrayList2.add(new RadialGradient(f2, f4, Math.max(f5, f6), oreVar.c, oreVar.d, Shader.TileMode.CLAMP));
            arrayList.add(new bbf(f2, f4, f5, f6, oreVar.g, oreVar.d));
        }
    }

    public static final void c(int i, int i2, float f, float[] fArr) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        double d = f;
        float fCos = (float) Math.cos(Math.toRadians(d));
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fAbs = Math.abs(f2 / fCos);
        float fAbs2 = Math.abs(f3 / fSin);
        kpa kpaVar = fAbs >= fAbs2 ? new kpa(Float.valueOf(Math.abs(fAbs2 * fCos)), Float.valueOf(f3)) : new kpa(Float.valueOf(f2), Float.valueOf(Math.abs(fAbs * fSin)));
        float fFloatValue = ((Number) kpaVar.a).floatValue();
        float fFloatValue2 = ((Number) kpaVar.b).floatValue();
        if (fCos >= 0.0f && fSin >= 0.0f) {
            fArr[0] = f2 + fFloatValue;
            fArr[1] = f3 - fFloatValue2;
            return;
        }
        if (fCos < 0.0f && fSin >= 0.0f) {
            fArr[0] = f2 - fFloatValue;
            fArr[1] = f3 - fFloatValue2;
        } else if (fCos < 0.0f && fSin < 0.0f) {
            fArr[0] = f2 - fFloatValue;
            fArr[1] = f3 + fFloatValue2;
        } else {
            if (fCos < 0.0f || fSin >= 0.0f) {
                return;
            }
            fArr[0] = f2 + fFloatValue;
            fArr[1] = f3 + fFloatValue2;
        }
    }
}

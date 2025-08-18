package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public abstract class dz7 {
    public static final ArrayList a(List list, int i, int i2, int i3) {
        ArrayList arrayListI0 = x53.I0(list, i, i);
        ArrayList arrayList = new ArrayList(z53.S(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                y53.R();
                throw null;
            }
            arrayList.add(new sma((List) next, i4 + i3, i2));
            i4 = i5;
        }
        return arrayList;
    }

    public static final a51 b(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        int i = cz7.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? new v41(callsAudioDeviceInfo, z) : i != 5 ? new y41(callsAudioDeviceInfo) : new x41(callsAudioDeviceInfo) : new w41(callsAudioDeviceInfo) : new z41(callsAudioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hb1 c(defpackage.fqa r30, boolean r31, boolean r32, boolean r33, defpackage.bn1 r34, defpackage.i95 r35, defpackage.gg1 r36) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz7.c(fqa, boolean, boolean, boolean, bn1, i95, gg1):hb1");
    }

    public static final yj1 d(wvc wvcVar, fqa fqaVar, boolean z) {
        kvc kvcVar;
        gg1 gg1Var = (wvcVar == null || (kvcVar = wvcVar.b) == null) ? null : kvcVar.c;
        ig1 ig1Var = fqaVar.a;
        return new yj1(tpa.f(gg1Var, ig1Var.getId()), ig1Var.m(), (wvcVar != null ? wvcVar.a : null) == xvc.a, gg1Var, !z, wvcVar != null ? wvcVar.d : null);
    }

    public static final zx7 e(hb1 hb1Var, la1 la1Var, bn1 bn1Var) {
        int i;
        SpannableStringBuilder spannableStringBuilderG;
        boolean z = la1Var.g;
        boolean z2 = z ? false : hb1Var.Y;
        boolean z3 = la1Var.t;
        String str = hb1Var.b;
        boolean z4 = hb1Var.s0;
        boolean z5 = la1Var.m;
        haf hafVar = hb1Var.z0;
        boolean z6 = hb1Var.w0;
        int i2 = hb1Var.B0;
        if (z3 || z) {
            i = i2;
            spannableStringBuilderG = null;
        } else {
            i = i2;
            spannableStringBuilderG = bn1Var.g(z6, i2, str, z, z4, z5, hafVar != null ? hafVar.g : false, la1Var.e);
        }
        return new zx7(hb1Var.X, str, hb1Var.a, z2, z5, hb1Var.Z, z4, hafVar, z6, hb1Var.v0, i, spannableStringBuilderG, hb1Var.o);
    }

    public static final qma f(hb1 hb1Var, boolean z, boolean z2, boolean z3) {
        boolean z4 = z ? hb1Var.Y : false;
        boolean z5 = (z2 || z3) ? hb1Var.s0 : false;
        iaf iafVar = z ? hb1Var.A0 : null;
        if (iafVar == null) {
            iafVar = iaf.o;
        }
        return new qma(hb1Var.X, hb1Var.b, hb1Var.a, z4, hb1Var.u0, z5, hb1Var.z0, iafVar, hb1Var.w0, hb1Var.c);
    }
}

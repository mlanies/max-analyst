package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class m02 extends a12 {
    public static final int[] J0 = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] K0 = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] L0 = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] M0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, HttpStatus.SC_SWITCHING_PROTOCOLS, HttpStatus.SC_PROCESSING, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] N0 = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] O0 = {193, HttpStatus.SC_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, HttpStatus.SC_ACCEPTED, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] P0 = {195, 227, HttpStatus.SC_RESET_CONTENT, HttpStatus.SC_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] Q0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public byte E0;
    public byte F0;
    public boolean H0;
    public long I0;
    public final int s0;
    public final int t0;
    public final int u0;
    public List y0;
    public List z0;
    public final yaf Z = new yaf(3, false);
    public final ArrayList w0 = new ArrayList();
    public k02 x0 = new k02(0, 4);
    public int G0 = 0;
    public final long v0 = 16000000;

    public m02(String str, int i) {
        this.s0 = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.u0 = 0;
            this.t0 = 0;
        } else if (i == 2) {
            this.u0 = 1;
            this.t0 = 0;
        } else if (i == 3) {
            this.u0 = 0;
            this.t0 = 1;
        } else if (i != 4) {
            this.u0 = 0;
            this.t0 = 0;
        } else {
            this.u0 = 1;
            this.t0 = 1;
        }
        j(0);
        i();
        this.H0 = true;
        this.I0 = -9223372036854775807L;
    }

    @Override // defpackage.a12
    public final w4d a() {
        List list = this.y0;
        this.z0 = list;
        list.getClass();
        return new w4d(7, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7 A[FALL_THROUGH] */
    @Override // defpackage.a12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.w02 r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m02.d(w02):void");
    }

    @Override // defpackage.a12, defpackage.l54
    /* renamed from: e */
    public final jbe c() {
        jbe jbeVar;
        jbe jbeVarC = super.c();
        if (jbeVarC != null) {
            return jbeVarC;
        }
        long j = this.v0;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.I0;
        if (j2 == -9223372036854775807L || this.X - j2 < j || (jbeVar = (jbe) this.b.pollFirst()) == null) {
            return null;
        }
        this.y0 = Collections.emptyList();
        this.I0 = -9223372036854775807L;
        jbeVar.w(this.X, a(), Long.MAX_VALUE);
        return jbeVar;
    }

    @Override // defpackage.a12, defpackage.l54
    public final void flush() {
        super.flush();
        this.y0 = null;
        this.z0 = null;
        j(0);
        this.B0 = 4;
        this.x0.h = 4;
        i();
        this.C0 = false;
        this.D0 = false;
        this.E0 = (byte) 0;
        this.F0 = (byte) 0;
        this.G0 = 0;
        this.H0 = true;
        this.I0 = -9223372036854775807L;
    }

    @Override // defpackage.a12
    public final boolean g() {
        return this.y0 != this.z0;
    }

    public final ArrayList h() {
        ArrayList arrayList = this.w0;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            xz3 xz3VarC = ((k02) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(xz3VarC);
            if (xz3VarC != null) {
                iMin = Math.min(iMin, xz3VarC.t0);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            xz3 xz3VarC2 = (xz3) arrayList2.get(i2);
            if (xz3VarC2 != null) {
                if (xz3VarC2.t0 != iMin) {
                    xz3VarC2 = ((k02) arrayList.get(i2)).c(iMin);
                    xz3VarC2.getClass();
                }
                arrayList3.add(xz3VarC2);
            }
        }
        return arrayList3;
    }

    public final void i() {
        k02 k02Var = this.x0;
        k02Var.g = this.A0;
        k02Var.a.clear();
        k02Var.b.clear();
        k02Var.c.setLength(0);
        k02Var.d = 15;
        k02Var.e = 0;
        k02Var.f = 0;
        ArrayList arrayList = this.w0;
        arrayList.clear();
        arrayList.add(this.x0);
    }

    public final void j(int i) {
        int i2 = this.A0;
        if (i2 == i) {
            return;
        }
        this.A0 = i;
        if (i != 3) {
            i();
            if (i2 == 3 || i == 1 || i == 0) {
                this.y0 = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.w0;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((k02) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.a12, defpackage.l54
    public final void release() {
    }
}

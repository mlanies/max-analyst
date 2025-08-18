package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class n02 extends b12 {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, HttpStatus.SC_SWITCHING_PROTOCOLS, HttpStatus.SC_PROCESSING, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, HttpStatus.SC_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, HttpStatus.SC_ACCEPTED, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, HttpStatus.SC_RESET_CONTENT, HttpStatus.SC_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final wpa h = new wpa();
    public final ArrayList m = new ArrayList();
    public l02 n = new l02(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public n02(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            z04.c0("Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.b12
    public final c12 e() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new c12(list);
    }

    @Override // defpackage.b12, defpackage.m54
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.x02 r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n02.g(x02):void");
    }

    @Override // defpackage.b12, defpackage.m54
    /* renamed from: h */
    public final kbe c() {
        kbe kbeVar;
        kbe kbeVarC = super.c();
        if (kbeVarC != null) {
            return kbeVarC;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (kbeVar = (kbe) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.emptyList();
        this.y = -9223372036854775807L;
        c12 c12VarE = e();
        long j3 = this.e;
        kbeVar.c = j3;
        kbeVar.X = c12VarE;
        kbeVar.Y = j3;
        return kbeVar;
    }

    @Override // defpackage.b12
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            yz3 yz3VarC = ((l02) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(yz3VarC);
            if (yz3VarC != null) {
                iMin = Math.min(iMin, yz3VarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            yz3 yz3VarC2 = (yz3) arrayList2.get(i2);
            if (yz3VarC2 != null) {
                if (yz3VarC2.i != iMin) {
                    yz3VarC2 = ((l02) arrayList.get(i2)).c(iMin);
                    yz3VarC2.getClass();
                }
                arrayList3.add(yz3VarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        l02 l02Var = this.n;
        l02Var.g = this.q;
        l02Var.a.clear();
        l02Var.b.clear();
        l02Var.c.setLength(0);
        l02Var.d = 15;
        l02Var.e = 0;
        l02Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((l02) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.b12, defpackage.m54
    public final void release() {
    }
}

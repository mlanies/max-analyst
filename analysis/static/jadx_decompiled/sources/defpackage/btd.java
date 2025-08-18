package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class btd {
    public static final ye4 i = new ye4(17);
    public static final ye4 j = new ye4(19);
    public static final ye4 k = new ye4(18);
    public static final ye4 l = new ye4(20);
    public final /* synthetic */ int a;
    public final int b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Object[] h;

    public btd(int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = i2;
                this.h = new atd[5];
                this.c = new ArrayList();
                this.d = -1;
                break;
            default:
                this.b = i2;
                this.h = new zsd[5];
                this.c = new ArrayList();
                this.d = -1;
                break;
        }
    }

    public final void a(int i2, float f) {
        zsd zsdVar;
        atd atdVar;
        switch (this.a) {
            case 0:
                int i3 = this.d;
                ArrayList arrayList = this.c;
                if (i3 != 1) {
                    Collections.sort(arrayList, i);
                    this.d = 1;
                }
                int i4 = this.g;
                zsd[] zsdVarArr = (zsd[]) this.h;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.g = i5;
                    zsdVar = zsdVarArr[i5];
                } else {
                    zsdVar = new zsd();
                }
                int i6 = this.e;
                this.e = i6 + 1;
                zsdVar.a = i6;
                zsdVar.b = i2;
                zsdVar.c = f;
                arrayList.add(zsdVar);
                this.f += i2;
                while (true) {
                    int i7 = this.f;
                    int i8 = this.b;
                    if (i7 <= i8) {
                        break;
                    } else {
                        int i9 = i7 - i8;
                        zsd zsdVar2 = (zsd) arrayList.get(0);
                        int i10 = zsdVar2.b;
                        if (i10 <= i9) {
                            this.f -= i10;
                            arrayList.remove(0);
                            int i11 = this.g;
                            if (i11 < 5) {
                                this.g = i11 + 1;
                                zsdVarArr[i11] = zsdVar2;
                            }
                        } else {
                            zsdVar2.b = i10 - i9;
                            this.f -= i9;
                        }
                    }
                }
            default:
                int i12 = this.d;
                ArrayList arrayList2 = this.c;
                if (i12 != 1) {
                    Collections.sort(arrayList2, k);
                    this.d = 1;
                }
                int i13 = this.g;
                atd[] atdVarArr = (atd[]) this.h;
                if (i13 > 0) {
                    int i14 = i13 - 1;
                    this.g = i14;
                    atdVar = atdVarArr[i14];
                } else {
                    atdVar = new atd();
                }
                int i15 = this.e;
                this.e = i15 + 1;
                atdVar.a = i15;
                atdVar.b = i2;
                atdVar.c = f;
                arrayList2.add(atdVar);
                this.f += i2;
                while (true) {
                    int i16 = this.f;
                    int i17 = this.b;
                    if (i16 <= i17) {
                        break;
                    } else {
                        int i18 = i16 - i17;
                        atd atdVar2 = (atd) arrayList2.get(0);
                        int i19 = atdVar2.b;
                        if (i19 <= i18) {
                            this.f -= i19;
                            arrayList2.remove(0);
                            int i20 = this.g;
                            if (i20 < 5) {
                                this.g = i20 + 1;
                                atdVarArr[i20] = atdVar2;
                            }
                        } else {
                            atdVar2.b = i19 - i18;
                            this.f -= i18;
                        }
                    }
                }
        }
    }

    public final float b() {
        switch (this.a) {
            case 0:
                int i2 = this.d;
                ArrayList arrayList = this.c;
                if (i2 != 0) {
                    Collections.sort(arrayList, j);
                    this.d = 0;
                }
                float f = 0.5f * this.f;
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    zsd zsdVar = (zsd) arrayList.get(i4);
                    i3 += zsdVar.b;
                    if (i3 >= f) {
                        return zsdVar.c;
                    }
                }
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zsd) wg0.f(arrayList, 1)).c;
            default:
                int i5 = this.d;
                ArrayList arrayList2 = this.c;
                if (i5 != 0) {
                    Collections.sort(arrayList2, l);
                    this.d = 0;
                }
                float f2 = 0.5f * this.f;
                int i6 = 0;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    atd atdVar = (atd) arrayList2.get(i7);
                    i6 += atdVar.b;
                    if (i6 >= f2) {
                        return atdVar.c;
                    }
                }
                if (arrayList2.isEmpty()) {
                    return Float.NaN;
                }
                return ((atd) wg0.f(arrayList2, 1)).c;
        }
    }
}

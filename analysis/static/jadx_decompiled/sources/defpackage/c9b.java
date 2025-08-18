package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c9b extends ws {
    public sud[] f;
    public sud[] g;
    public int h;
    public b9b i;

    @Override // defpackage.ws
    public final sud d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            sud[] sudVarArr = this.f;
            sud sudVar = sudVarArr[i2];
            if (!zArr[sudVar.b]) {
                b9b b9bVar = this.i;
                b9bVar.b = sudVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((sud) b9bVar.b).s0[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    sud sudVar2 = sudVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = sudVar2.s0[i3];
                            float f3 = ((sud) b9bVar.b).s0[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.ws
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.ws
    public final void i(zh7 zh7Var, ws wsVar, boolean z) {
        sud sudVar = wsVar.a;
        if (sudVar == null) {
            return;
        }
        ks ksVar = wsVar.d;
        int iF = ksVar.f();
        for (int i = 0; i < iF; i++) {
            sud sudVarG = ksVar.g(i);
            float fH = ksVar.h(i);
            b9b b9bVar = this.i;
            b9bVar.b = sudVarG;
            boolean z2 = sudVarG.a;
            float[] fArr = sudVar.s0;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((sud) b9bVar.b).s0;
                    float f = (fArr[i2] * fH) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((sud) b9bVar.b).s0[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((c9b) b9bVar.c).k((sud) b9bVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fH;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((sud) b9bVar.b).s0[i3] = f3;
                    } else {
                        ((sud) b9bVar.b).s0[i3] = 0.0f;
                    }
                }
                j(sudVarG);
            }
            this.b = (wsVar.b * fH) + this.b;
        }
        k(sudVar);
    }

    public final void j(sud sudVar) {
        int i;
        int i2 = this.h + 1;
        sud[] sudVarArr = this.f;
        if (i2 > sudVarArr.length) {
            sud[] sudVarArr2 = (sud[]) Arrays.copyOf(sudVarArr, sudVarArr.length * 2);
            this.f = sudVarArr2;
            this.g = (sud[]) Arrays.copyOf(sudVarArr2, sudVarArr2.length * 2);
        }
        sud[] sudVarArr3 = this.f;
        int i3 = this.h;
        sudVarArr3[i3] = sudVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && sudVarArr3[i3].b > sudVar.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new ky6(10));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        sudVar.a = true;
        sudVar.a(this);
    }

    public final void k(sud sudVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == sudVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        sudVar.a = false;
                        return;
                    } else {
                        sud[] sudVarArr = this.f;
                        int i3 = i + 1;
                        sudVarArr[i] = sudVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ws
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            sud sudVar = this.f[i];
            b9b b9bVar = this.i;
            b9bVar.b = sudVar;
            str = str + b9bVar + " ";
        }
        return str;
    }
}

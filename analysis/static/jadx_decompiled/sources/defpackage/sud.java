package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sud implements Comparable {
    public float X;
    public boolean a;
    public int w0;
    public int b = -1;
    public int c = -1;
    public int o = 0;
    public boolean Y = false;
    public final float[] Z = new float[9];
    public final float[] s0 = new float[9];
    public ws[] t0 = new ws[16];
    public int u0 = 0;
    public int v0 = 0;

    public sud(int i) {
        this.w0 = i;
    }

    public final void a(ws wsVar) {
        int i = 0;
        while (true) {
            int i2 = this.u0;
            if (i >= i2) {
                ws[] wsVarArr = this.t0;
                if (i2 >= wsVarArr.length) {
                    this.t0 = (ws[]) Arrays.copyOf(wsVarArr, wsVarArr.length * 2);
                }
                ws[] wsVarArr2 = this.t0;
                int i3 = this.u0;
                wsVarArr2[i3] = wsVar;
                this.u0 = i3 + 1;
                return;
            }
            if (this.t0[i] == wsVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(ws wsVar) {
        int i = this.u0;
        int i2 = 0;
        while (i2 < i) {
            if (this.t0[i2] == wsVar) {
                while (i2 < i - 1) {
                    ws[] wsVarArr = this.t0;
                    int i3 = i2 + 1;
                    wsVarArr[i2] = wsVarArr[i3];
                    i2 = i3;
                }
                this.u0--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.w0 = 5;
        this.o = 0;
        this.b = -1;
        this.c = -1;
        this.X = 0.0f;
        this.Y = false;
        int i = this.u0;
        for (int i2 = 0; i2 < i; i2++) {
            this.t0[i2] = null;
        }
        this.u0 = 0;
        this.v0 = 0;
        this.a = false;
        Arrays.fill(this.s0, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((sud) obj).b;
    }

    public final void d(zh7 zh7Var, float f) {
        this.X = f;
        this.Y = true;
        int i = this.u0;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.t0[i2].h(zh7Var, this, false);
        }
        this.u0 = 0;
    }

    public final void e(zh7 zh7Var, ws wsVar) {
        int i = this.u0;
        for (int i2 = 0; i2 < i; i2++) {
            this.t0[i2].i(zh7Var, wsVar, false);
        }
        this.u0 = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}

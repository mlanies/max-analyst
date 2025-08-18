package defpackage;

/* loaded from: classes.dex */
public abstract class o6g {
    public final x6g a;
    public v27[] b;

    public o6g() {
        this(new x6g());
    }

    public final void a() {
        v27[] v27VarArr = this.b;
        if (v27VarArr != null) {
            v27 v27VarF = v27VarArr[0];
            v27 v27VarF2 = v27VarArr[1];
            x6g x6gVar = this.a;
            if (v27VarF2 == null) {
                v27VarF2 = x6gVar.a.f(2);
            }
            if (v27VarF == null) {
                v27VarF = x6gVar.a.f(1);
            }
            f(v27.a(v27VarF, v27VarF2));
            v27 v27Var = this.b[4];
            if (v27Var != null) {
                e(v27Var);
            }
            v27 v27Var2 = this.b[5];
            if (v27Var2 != null) {
                d(v27Var2);
            }
            v27 v27Var3 = this.b[6];
            if (v27Var3 != null) {
                g(v27Var3);
            }
        }
    }

    public abstract x6g b();

    public void c(int i, v27 v27Var) {
        char c;
        if (this.b == null) {
            this.b = new v27[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                v27[] v27VarArr = this.b;
                if (i2 != 1) {
                    c = 2;
                    if (i2 == 2) {
                        c = 1;
                    } else if (i2 != 4) {
                        c = '\b';
                        if (i2 == 8) {
                            c = 3;
                        } else if (i2 == 16) {
                            c = 4;
                        } else if (i2 == 32) {
                            c = 5;
                        } else if (i2 == 64) {
                            c = 6;
                        } else if (i2 == 128) {
                            c = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(zr6.h(i2, "type needs to be >= FIRST and <= LAST, type="));
                        }
                    }
                } else {
                    c = 0;
                }
                v27VarArr[c] = v27Var;
            }
        }
    }

    public abstract void d(v27 v27Var);

    public abstract void e(v27 v27Var);

    public abstract void f(v27 v27Var);

    public abstract void g(v27 v27Var);

    public void h(int i, boolean z) {
    }

    public o6g(x6g x6gVar) {
        this.a = x6gVar;
    }
}

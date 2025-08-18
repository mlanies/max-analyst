package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class knb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final ja6 h;

    public knb(ja6 ja6Var) {
        ja6Var.getClass();
        this.h = ja6Var;
        this.c = 0;
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    public final boolean a(p5b p5bVar) {
        int i;
        int i2 = this.e;
        while (this.a != 6 && (i = p5bVar.read()) != -1) {
            try {
                int i3 = this.c;
                this.c = i3 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i4 = this.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.a = 5;
                                } else if (i4 != 5) {
                                    od2.p(false);
                                } else {
                                    int i5 = ((this.b << 8) + i) - 2;
                                    od2.V(p5bVar, i5);
                                    this.c += i5;
                                    this.a = 2;
                                }
                            } else if (i == 255) {
                                this.a = 3;
                            } else if (i == 0) {
                                this.a = 2;
                            } else if (i == 217) {
                                this.g = true;
                                int i6 = i3 - 1;
                                int i7 = this.d;
                                if (i7 > 0) {
                                    this.f = i6;
                                }
                                this.d = i7 + 1;
                                this.e = i7;
                                this.a = 2;
                            } else {
                                if (i == 218) {
                                    int i8 = i3 - 1;
                                    int i9 = this.d;
                                    if (i9 > 0) {
                                        this.f = i8;
                                    }
                                    this.d = i9 + 1;
                                    this.e = i9;
                                }
                                if (i == 1 || ((i >= 208 && i <= 215) || i == 217 || i == 216)) {
                                    this.a = 2;
                                } else {
                                    this.a = 4;
                                }
                            }
                        } else if (i == 255) {
                            this.a = 3;
                        }
                    } else if (i == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (i == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = i;
            } catch (IOException e) {
                nu0.H(e);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i2) ? false : true;
    }

    public final boolean b(g05 g05Var) {
        if (this.a == 6 || g05Var.o() <= this.c) {
            return false;
        }
        InputStream inputStreamN = g05Var.n();
        inputStreamN.getClass();
        ja6 ja6Var = this.h;
        p5b p5bVar = new p5b(inputStreamN, (byte[]) ja6Var.get(16384), ja6Var);
        try {
            try {
                od2.V(p5bVar, this.c);
                return a(p5bVar);
            } catch (IOException e) {
                nu0.H(e);
                throw null;
            }
        } finally {
            q43.b(p5bVar);
        }
    }
}

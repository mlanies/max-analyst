package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zt4 implements cw4, dw4 {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public Object g;

    public zt4(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.g = new yze[list.size()];
                this.f = -9223372036854775807L;
                break;
            default:
                this.b = list;
                this.g = new xze[list.size()];
                this.f = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.cw4
    public final void a() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
            case 1:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
            case 2:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
            default:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.dw4
    public void d(wpa wpaVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if (this.c) {
                    if (this.d == 2) {
                        if (wpaVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (wpaVar.u() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (wpaVar.a() == 0) {
                            z = false;
                        } else {
                            if (wpaVar.u() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                        }
                    }
                    int i = wpaVar.b;
                    int iA = wpaVar.a();
                    for (yze yzeVar : (yze[]) this.g) {
                        wpaVar.G(i);
                        yzeVar.b(wpaVar, iA, 0);
                    }
                    this.e += iA;
                    break;
                }
                break;
            default:
                fm9.l((yze) this.g);
                if (this.c) {
                    int iA2 = wpaVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        byte[] bArr = wpaVar.a;
                        int i3 = wpaVar.b;
                        wpa wpaVar2 = (wpa) this.b;
                        System.arraycopy(bArr, i3, wpaVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            wpaVar2.G(0);
                            if (73 != wpaVar2.u() || 68 != wpaVar2.u() || 51 != wpaVar2.u()) {
                                z04.c0("Discarding invalid ID3 tag");
                                this.c = false;
                                break;
                            } else {
                                wpaVar2.H(3);
                                this.d = wpaVar2.t() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((yze) this.g).b(wpaVar, iMin2, 0);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dw4
    public void e(boolean z) {
        int i;
        switch (this.a) {
            case 1:
                if (this.c) {
                    fm9.k(this.f != -9223372036854775807L);
                    for (yze yzeVar : (yze[]) this.g) {
                        yzeVar.a(this.f, 1, this.e, 0, null);
                    }
                    this.c = false;
                    break;
                }
                break;
            default:
                fm9.l((yze) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    fm9.k(this.f != -9223372036854775807L);
                    ((yze) this.g).a(this.f, 1, this.d, 0, null);
                    this.c = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cw4
    public void f(yaf yafVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.d == 2) {
                        if (yafVar.c() == 0) {
                            z2 = false;
                        } else {
                            if (yafVar.v() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (yafVar.c() == 0) {
                            z = false;
                        } else {
                            if (yafVar.v() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                        }
                    }
                    int i = yafVar.b;
                    int iC = yafVar.c();
                    for (xze xzeVar : (xze[]) this.g) {
                        yafVar.H(i);
                        xzeVar.c(iC, yafVar);
                    }
                    this.e += iC;
                    break;
                }
                break;
            default:
                np8.g((xze) this.g);
                if (this.c) {
                    int iC2 = yafVar.c();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iC2, 10 - i2);
                        byte[] bArr = yafVar.a;
                        int i3 = yafVar.b;
                        yaf yafVar2 = (yaf) this.b;
                        System.arraycopy(bArr, i3, yafVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            yafVar2.H(0);
                            if (73 != yafVar2.v() || 68 != yafVar2.v() || 51 != yafVar2.v()) {
                                this.c = false;
                                break;
                            } else {
                                yafVar2.I(3);
                                this.d = yafVar2.u() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iC2, this.d - this.e);
                    ((xze) this.g).c(iMin2, yafVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            case 1:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            case 2:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cw4
    public void h() {
        int i;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.f != -9223372036854775807L) {
                        for (xze xzeVar : (xze[]) this.g) {
                            xzeVar.b(this.f, 1, this.e, 0, null);
                        }
                    }
                    this.c = false;
                    break;
                }
                break;
            default:
                np8.g((xze) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    long j = this.f;
                    if (j != -9223372036854775807L) {
                        ((xze) this.g).b(j, 1, i, 0, null);
                    }
                    this.c = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dw4
    public void i(pa5 pa5Var, l3f l3fVar) {
        switch (this.a) {
            case 1:
                int i = 0;
                while (true) {
                    yze[] yzeVarArr = (yze[]) this.g;
                    if (i >= yzeVarArr.length) {
                        break;
                    } else {
                        k3f k3fVar = (k3f) ((List) this.b).get(i);
                        l3fVar.a();
                        l3fVar.b();
                        yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 3);
                        ny5 ny5Var = new ny5();
                        l3fVar.b();
                        ny5Var.a = l3fVar.f;
                        ny5Var.m = ia9.l("application/dvbsubs");
                        ny5Var.p = Collections.singletonList(k3fVar.b);
                        ny5Var.d = k3fVar.a;
                        yzeVarMo6B.e(new qy5(ny5Var));
                        yzeVarArr[i] = yzeVarMo6B;
                        i++;
                    }
                }
            default:
                l3fVar.a();
                l3fVar.b();
                yze yzeVarMo6B2 = pa5Var.mo6B(l3fVar.e, 5);
                this.g = yzeVarMo6B2;
                ny5 ny5Var2 = new ny5();
                l3fVar.b();
                ny5Var2.a = l3fVar.f;
                ny5Var2.m = ia9.l("application/id3");
                yzeVarMo6B2.e(new qy5(ny5Var2));
                break;
        }
    }

    @Override // defpackage.cw4
    public void j(oa5 oa5Var, l3f l3fVar) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    xze[] xzeVarArr = (xze[]) this.g;
                    if (i >= xzeVarArr.length) {
                        break;
                    } else {
                        j3f j3fVar = (j3f) ((List) this.b).get(i);
                        l3fVar.a();
                        l3fVar.b();
                        xze xzeVarB = oa5Var.B(l3fVar.e, 3);
                        my5 my5Var = new my5();
                        l3fVar.b();
                        my5Var.a = l3fVar.f;
                        my5Var.k = "application/dvbsubs";
                        my5Var.m = Collections.singletonList(j3fVar.b);
                        my5Var.c = j3fVar.a;
                        xzeVarB.d(new oy5(my5Var));
                        xzeVarArr[i] = xzeVarB;
                        i++;
                    }
                }
            default:
                l3fVar.a();
                l3fVar.b();
                xze xzeVarB2 = oa5Var.B(l3fVar.e, 5);
                this.g = xzeVarB2;
                my5 my5Var2 = new my5();
                l3fVar.b();
                my5Var2.a = l3fVar.f;
                my5Var2.k = "application/id3";
                xzeVarB2.d(new oy5(my5Var2));
                break;
        }
    }

    public zt4(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new wpa(10);
                this.f = -9223372036854775807L;
                break;
            default:
                this.b = new yaf(10);
                this.f = -9223372036854775807L;
                break;
        }
    }
}

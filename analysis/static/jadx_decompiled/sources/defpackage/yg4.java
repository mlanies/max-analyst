package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ bkg o;

    public /* synthetic */ yg4(ah4 ah4Var, Runnable runnable, bkg bkgVar, int i) {
        this.a = i;
        this.b = ah4Var;
        this.c = runnable;
        this.o = bkgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ah4 ah4Var = this.b;
                ah4Var.getClass();
                final Runnable runnable = this.c;
                final bkg bkgVar = this.o;
                final int i = 0;
                ah4Var.a.execute(new Runnable() { // from class: wg4
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ch4) bkgVar.b).j(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ch4) bkgVar.b).j(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                bkg bkgVar2 = bkgVar;
                                try {
                                    runnable2.run();
                                    ((ch4) bkgVar2.b).i(null);
                                    return;
                                } catch (Exception e3) {
                                    ((ch4) bkgVar2.b).j(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ah4 ah4Var2 = this.b;
                ah4Var2.getClass();
                final Runnable runnable2 = this.c;
                final bkg bkgVar2 = this.o;
                final int i2 = 2;
                ah4Var2.a.execute(new Runnable() { // from class: wg4
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ch4) bkgVar2.b).j(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ch4) bkgVar2.b).j(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                bkg bkgVar22 = bkgVar2;
                                try {
                                    runnable22.run();
                                    ((ch4) bkgVar22.b).i(null);
                                    return;
                                } catch (Exception e3) {
                                    ((ch4) bkgVar22.b).j(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ah4 ah4Var3 = this.b;
                ah4Var3.getClass();
                final Runnable runnable3 = this.c;
                final bkg bkgVar3 = this.o;
                final int i3 = 1;
                ah4Var3.a.execute(new Runnable() { // from class: wg4
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ch4) bkgVar3.b).j(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ch4) bkgVar3.b).j(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                bkg bkgVar22 = bkgVar3;
                                try {
                                    runnable22.run();
                                    ((ch4) bkgVar22.b).i(null);
                                    return;
                                } catch (Exception e3) {
                                    ((ch4) bkgVar22.b).j(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
